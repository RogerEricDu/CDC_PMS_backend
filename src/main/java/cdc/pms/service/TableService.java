package cdc.pms.service;

import cdc.pms.dto.TableDTO;

import java.util.Map;
import java.util.Objects;

public interface TableService {
    Map<String, Object> getDiseaseSample(TableDTO tableDTO);
}
