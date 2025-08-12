package cdc.pms.service;

import cdc.pms.entity.User;

public interface AuthService {
    String authenticate(String username, String password) throws IllegalArgumentException;
    User getUserByUsername(String username); // 可根据实际需求决定是否暴露
}

