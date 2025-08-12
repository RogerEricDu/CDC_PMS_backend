package cdc.pms.mapper;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class TreeSqlProvider {
    public String selectDiseaseRank(final Map<String, Object> params) {
        String geographicLocation = (String) params.get("geographicLocation");
        Integer dataYear = (Integer) params.get("dataYear");
        String tableName = geographicLocation + "_data"; // 表名仍用 geo 定位

        return new SQL() {{
            SELECT("*");
            FROM(tableName);
            if (dataYear != null) {
                WHERE("dataYear = #{dataYear}");
            }
        }}.toString();
    }

    public String selectDiseaseChart(final Map<String, Object> params) {
        String geographicLocation = (String) params.get("geographicLocation");
        String diseaseName = (String) params.get("diseaseName");
        String tableName = geographicLocation + "_data"; // 表名仍用 geo 定位

        return new SQL() {{
            SELECT("*");
            FROM(tableName);
            if (diseaseName != null) {
                WHERE("diseaseName = #{diseaseName}");
            }
        }}.toString();
    }

    public String selectDiseaseMapData(final Map<String, Object> params) {
        String tableName = (String) params.get("tableName");
        return new SQL() {{
            SELECT("*");
            FROM(tableName);
            WHERE("diseaseName = #{diseaseName}");
        }}.toString();
    }
}
