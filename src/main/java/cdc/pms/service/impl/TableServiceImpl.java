package cdc.pms.service.impl;

import cdc.pms.dto.TableDTO;
import cdc.pms.entity.Table;
import cdc.pms.mapper.TableMapper;
import cdc.pms.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TableMapper tableMapper;

    @Override
    public Map<String, Object> getDiseaseSample(TableDTO tableDTO) {
        String dataset = tableDTO.getDataset();
        int dataYear = tableDTO.getDataYear();
        Long cardID = tableDTO.getCardID();
        String patientName = tableDTO.getPatientName();
        String caseClassification = tableDTO.getCaseClassification();
        LocalDate onsetDate1 = tableDTO.getOnsetDate1();
        LocalDate onsetDate2 = tableDTO.getOnsetDate2();
        String diseaseName = tableDTO.getDiseaseName();
        int page = tableDTO.getPage();
        int size = tableDTO.getSize();

        int offset = (page - 1) * size;
        int limit = size;

        List<Table> tables = tableMapper.findDiseaseSample(dataset, dataYear, cardID,patientName,caseClassification,onsetDate1,onsetDate2,diseaseName,offset, limit);
        // 对 patientName 加密，只保留姓氏
        for (Table t : tables) {
            String name = t.getPatientName();
            if (name != null && name.length() > 0) {
                String surname = name.substring(0, 1);
                String stars = "";
                for (int i = 1; i < name.length(); i++) {
                    stars += "*";
                }
                t.setPatientName(surname + stars);
            }
        }
        long total;

        if (cardID != null) {
            total = tables.size(); // 只有一条或0条
        } else {
            total = tableMapper.countDiseaseSample(dataset, dataYear, cardID,
                    patientName, caseClassification,onsetDate1,onsetDate2, diseaseName);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("data", tables);
        result.put("page", page);
        result.put("size", size);
        result.put("total", total);
        result.put("code", 200);
        result.put("message", "ok");
        result.put("description", "");

        return result;
    }
}
