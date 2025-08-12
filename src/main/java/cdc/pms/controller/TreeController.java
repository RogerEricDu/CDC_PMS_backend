package cdc.pms.controller;

import cdc.pms.dto.ChartDTO;
import cdc.pms.dto.MapDTO;
import cdc.pms.dto.TreeDTO;
import cdc.pms.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @PostMapping("/diseaseSample")
    public ResponseEntity<Map<String, Object>> getDiseaseRank(@RequestBody TreeDTO treeDTO){
        Map<String,Object> result = treeService.getDiseaseRank(treeDTO);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/diseaseChart")
    public ResponseEntity<Map<String, Object>> getDiseaseChart(@RequestBody ChartDTO chartDTO){
        Map<String,Object> result = treeService.getDiseaseChart(chartDTO);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/diseaseMap")
    public ResponseEntity<Map<String, Object>> getDiseaseMap(@RequestBody MapDTO mapDTO){
        Map<String,Object> result = treeService.getDiseaseMap(mapDTO);
        return ResponseEntity.ok(result);
    }
}