package cdc.pms.mapper;

import cdc.pms.entity.Table;
import cdc.pms.entity.Tree;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TreeMapper {
    @SelectProvider(type = TreeSqlProvider.class, method = "selectDiseaseRank")
    @Results({
            @Result(property = "ID", column = "ID"),
            @Result(property = "diseaseName", column = "diseaseName"),
            @Result(property = "deathRank", column = "deathRank"),
            @Result(property = "deathNumber", column = "deathNumber"),
            @Result(property = "geographicLocation", column = "geographicLocation"),
            @Result(property = "dataYear", column = "dataYear")


    })
    List<Tree> findDiseaseRank(
            @Param("geographicLocation") String geographicLocation,
            @Param("dataYear") int dataYear
    );

    @SelectProvider(type = TreeSqlProvider.class, method = "selectDiseaseChart")
    @Results({
            @Result(property = "ID", column = "ID"),
            @Result(property = "diseaseName", column = "diseaseName"),
            @Result(property = "deathRank", column = "deathRank"),
            @Result(property = "deathNumber", column = "deathNumber"),
            @Result(property = "geographicLocation", column = "geographicLocation"),
            @Result(property = "dataYear", column = "dataYear")


    })
    List<Tree> findDiseaseChart(
            @Param("geographicLocation") String geographicLocation,
            @Param("diseaseName") String diseaseName
    );

    @SelectProvider(type = TreeSqlProvider.class, method = "selectDiseaseMapData")
    @Results({
            @Result(property = "ID", column = "ID"),
            @Result(property = "diseaseName", column = "diseaseName"),
            @Result(property = "deathRank", column = "deathRank"),
            @Result(property = "deathNumber", column = "deathNumber"),
            @Result(property = "geographicLocation", column = "geographicLocation"),
            @Result(property = "dataYear", column = "dataYear")
    })
    List<Tree> findDiseaseMapData(
            @Param("tableName") String tableName,
            @Param("diseaseName") String diseaseName
    );

}
