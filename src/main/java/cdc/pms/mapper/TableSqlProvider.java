package cdc.pms.mapper;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class TableSqlProvider {

    public String selectDiseaseSample(final Map<String, Object> params) {
        String dataset = (String) params.get("dataset");
        String tableName = dataset + "_data";

        SQL sql = new SQL()
                .SELECT("*")
                .FROM(tableName);

        // 精确查询
        if (params.get("cardID") != null) {
            sql.WHERE("cardID = #{cardID}");
        }

        // 模糊查询
        if (params.get("patientName") != null) {
            sql.WHERE("patientName LIKE CONCAT('%', #{patientName}, '%')");
        }

        if (params.get("caseClassification") != null) {
            sql.WHERE("caseClassification LIKE CONCAT('%', #{caseClassification}, '%')");
        }

        if (params.get("onsetDate1") != null && params.get("onsetDate2") != null) {
            sql.WHERE("onsetDate BETWEEN #{onsetDate1} AND #{onsetDate2}");
        } else if (params.get("onsetDate1") != null) {
            sql.WHERE("onsetDate >= #{onsetDate1}");
        } else if (params.get("onsetDate2") != null) {
            sql.WHERE("onsetDate <= #{onsetDate2}");
        }

        if (params.get("diseaseName") != null) {
            sql.WHERE("diseaseName LIKE CONCAT('%', #{diseaseName}, '%')");
        }

        if (params.get("dataYear") != null) {
            sql.WHERE("dataYear = #{dataYear}");
        }

        String query = sql.toString();
        query += " LIMIT #{limit} OFFSET #{offset}";
        return query;
    }

    public String countDiseaseSample(final Map<String, Object> params) {
        String dataset = (String) params.get("dataset");
        String tableName = dataset + "_data";

        SQL sql = new SQL()
                .SELECT("COUNT(*)")
                .FROM(tableName);

        if (params.get("cardID") != null) {
            sql.WHERE("cardID = #{cardID}");
        }

        if (params.get("patientName") != null) {
            sql.WHERE("patientName LIKE CONCAT('%', #{patientName}, '%')");
        }

        if (params.get("caseClassification") != null) {
            sql.WHERE("caseClassification LIKE CONCAT('%', #{caseClassification}, '%')");
        }

        if (params.get("onsetDate1") != null && params.get("onsetDate2") != null) {
            sql.WHERE("onsetDate BETWEEN #{onsetDate1} AND #{onsetDate2}");
        } else if (params.get("onsetDate1") != null) {
            sql.WHERE("onsetDate >= #{onsetDate1}");
        } else if (params.get("onsetDate2") != null) {
            sql.WHERE("onsetDate <= #{onsetDate2}");
        }

        if (params.get("diseaseName") != null) {
            sql.WHERE("diseaseName LIKE CONCAT('%', #{diseaseName}, '%')");
        }

        if (params.get("dataYear") != null) {
            sql.WHERE("dataYear = #{dataYear}");
        }

        return sql.toString();
    }
}

