package cdc.pms.controller;

import cdc.pms.dto.TableDTO;
import cdc.pms.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    private TableService tableService;

    @PostMapping("/diseaseSample")
    public ResponseEntity<Map<String, Object>> getDiseaseSample(@RequestBody TableDTO tableDTO){
        Map<String,Object> result = tableService.getDiseaseSample(tableDTO);
        return ResponseEntity.ok(result);
    }
}