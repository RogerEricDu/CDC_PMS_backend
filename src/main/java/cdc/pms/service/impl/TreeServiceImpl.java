package cdc.pms.service.impl;

import cdc.pms.dto.ChartDTO;
import cdc.pms.dto.MapDTO;
import cdc.pms.dto.TableDTO;
import cdc.pms.dto.TreeDTO;
import cdc.pms.entity.Table;
import cdc.pms.entity.Tree;
import cdc.pms.mapper.TreeMapper;
import cdc.pms.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeMapper treeMapper;


    @Override
    public Map<String, Object> getDiseaseRank(TreeDTO treeDTO) {
        // 获取查询条件
        String geographicLocation = treeDTO.getGeographicLocation();
        int dataYear = treeDTO.getDataYear();

        // 查询数据
        List<Tree> trees = treeMapper.findDiseaseRank(
                geographicLocation, dataYear);


        // 构造返回结果，包含分页信息
        Map<String, Object> result = new HashMap<>();
        result.put("data", trees);
        result.put("code", 200);
        result.put("message", "ok");
        result.put("description", "");

        return result;
    }

    @Override
    public Map<String, Object> getDiseaseChart(ChartDTO chartDTO) {
        String geographicLocation = chartDTO.getGeographicLocation();
        List<String> diseaseNames = chartDTO.getDiseaseName();

        List<Tree> resultList = new ArrayList<>();

        for (String disease : diseaseNames) {
            List<Tree> partialResult = treeMapper.findDiseaseChart(geographicLocation, disease);
            resultList.addAll(partialResult);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("data", resultList);
        result.put("code", 200);
        result.put("message", "ok");
        result.put("description", "");
        return result;
    }

    @Override
    public Map<String, Object> getDiseaseMap(MapDTO mapDTO) {
        String diseaseName = mapDTO.getDiseaseName();

        // 四个地区表名
        String[] regions = {"bomi", "chayu", "zuogongxian", "basu"};
        Map<String, List<Tree>> regionDataMap = new HashMap<>();

        for (String region : regions) {
            String tableName = region + "_data";
            List<Tree> data = treeMapper.findDiseaseMapData(tableName, diseaseName);
            regionDataMap.put(region, data);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "ok");
        result.put("data", regionDataMap);
        return result;
    }
}
