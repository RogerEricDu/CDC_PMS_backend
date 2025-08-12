package cdc.pms.service;

import cdc.pms.dto.ChartDTO;
import cdc.pms.dto.MapDTO;
import cdc.pms.dto.TableDTO;
import cdc.pms.dto.TreeDTO;

import java.util.Map;

public interface TreeService {
    Map<String, Object> getDiseaseRank(TreeDTO treeDTO);
    Map<String, Object> getDiseaseChart(ChartDTO chartDTO);
    Map<String, Object> getDiseaseMap(MapDTO mapDTO);
}
