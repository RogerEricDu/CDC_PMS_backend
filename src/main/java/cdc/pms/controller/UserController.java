package cdc.pms.controller;

import cdc.pms.entity.User;
import cdc.pms.service.AuthService;
import cdc.pms.service.UserService;
import cdc.pms.utils.JwtUtil;
import cdc.pms.utils.Result;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    // 用户注册
    @PostMapping("/register")
    public Result<?> registerUser(@RequestBody User user) {
        userService.addUser(user);
        return Result.success("User Registered successfully", null);
    }

    // 用户登录
    @PostMapping("/login")
    public Result<?> loginUser(@RequestBody User loginDetails) {
        try {
            String token = authService.authenticate(loginDetails.getUsername(), loginDetails.getPassword());
            return Result.success("Login successful", token);
        } catch (IllegalArgumentException e) {
            return Result.error(401, "Invalid Username/Password");
        }
    }

    // 获取当前用户信息（从token解析）
    @GetMapping("/me")
    public Result<?> getCurrentUserInfo(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return Result.error(401, "Missing or invalid Authorization header");
        }

        String token = authHeader.replace("Bearer ", "");
        String username;
        try {
            username = jwtUtil.extractUsername(token);
        } catch (Exception e) {
            return Result.error(401, "Invalid token");
        }

        User user = userService.findByUsername(username);
        if (user == null) {
            return Result.error(404, "User not found");
        }

        return Result.success(user);
    }

    // 更新用户信息
    @PutMapping("")
    public Result<?> updateUserInfo(@RequestBody User userUpdates) {
        userService.updateUser(userUpdates);
        return Result.success("Update successful", null);
    }

    // 获取所有用户
    @GetMapping()
    public Result<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return Result.success(users);
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public Result<?> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return Result.success("User deleted successfully", null);
    }
}
