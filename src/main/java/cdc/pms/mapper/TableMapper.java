package cdc.pms.mapper;

import cdc.pms.entity.Table;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface TableMapper {
    @SelectProvider(type = TableSqlProvider.class, method = "selectDiseaseSample")
    @Results({
            @Result(property = "cardID", column = "cardID"),
            @Result(property = "cardNumber", column = "cardNumber"),
            @Result(property = "status", column = "status"),
            @Result(property = "patientName", column = "patientName"),
            @Result(property = "guardianName", column = "guardianName"),
            @Result(property = "idNumber", column = "idNumber"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "birthDate", column = "birthDate"),
            @Result(property = "age", column = "age"),
            @Result(property = "workUnit", column = "workUnit"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "patientCategory", column = "patientCategory"),
            @Result(property = "addressStandardCode", column = "addressStandardCode"),
            @Result(property = "detailedAddress", column = "detailedAddress"),
            @Result(property = "populationCategory", column = "populationCategory"),
            @Result(property = "caseClassification", column = "caseClassification"),
            @Result(property = "caseClassificationSecond", column = "caseClassificationSecond"),
            @Result(property = "onsetDate", column = "onsetDate"),
            @Result(property = "diagnosisDate", column = "diagnosisDate"),
            @Result(property = "deathDate", column = "deathDate"),
            @Result(property = "diseaseName", column = "diseaseName"),
            @Result(property = "originalDisease", column = "originalDisease"),
            @Result(property = "originalDiagnosisDate", column = "originalDiagnosisDate"),
            @Result(property = "originalFinalReviewDate", column = "originalFinalReviewDate"),
            @Result(property = "reportingDoctor", column = "reportingDoctor"),
            @Result(property = "reportDate", column = "reportDate"),
            @Result(property = "reportUnitRegionCode", column = "reportUnitRegionCode"),
            @Result(property = "reportUnit", column = "reportUnit"),
            @Result(property = "unitType", column = "unitType"),
            @Result(property = "reportEntryTime", column = "reportEntryTime"),
            @Result(property = "entryUser", column = "entryUser"),
            @Result(property = "entryOrganization", column = "entryOrganization"),
            @Result(property = "districtReviewTime", column = "districtReviewTime"),
            @Result(property = "cityReviewTime", column = "cityReviewTime"),
            @Result(property = "provinceReviewTime", column = "provinceReviewTime"),
            @Result(property = "reviewStatus", column = "reviewStatus"),
            @Result(property = "correctionReportTime", column = "correctionReportTime"),
            @Result(property = "correctionFinalReviewTime", column = "correctionFinalReviewTime"),
            @Result(property = "FinalConfirmedDeathDate", column = "FinalConfirmedDeathDate"),
            @Result(property = "correctionUser", column = "correctionUser"),
            @Result(property = "correctionOrganization", column = "correctionOrganization"),
            @Result(property = "remarks", column = "remarks")


    })
    List<Table> findDiseaseSample(
            @Param("dataset") String dataset,
            @Param("dataYear") int dataYear,
            @Param("cardID") Long cardID,
            @Param("patientName") String patientName,
            @Param("caseClassification") String caseClassification,
            @Param("onsetDate1") LocalDate onsetDate1,
            @Param("onsetDate2") LocalDate onsetDate2,
            @Param("diseaseName") String diseaseName,
            @Param("offset") int offset,
            @Param("limit") int limit
    );

    // 查总数
    @SelectProvider(type = TableSqlProvider.class, method = "countDiseaseSample")
    long countDiseaseSample(@Param("dataset") String dataset,
                            @Param("dataYear") int dataYear,
                            @Param("cardID") Long cardID,
                            @Param("patientName") String patientName,
                            @Param("caseClassification") String caseClassification,
                            @Param("onsetDate1") LocalDate onsetDate1,
                            @Param("onsetDate2") LocalDate onsetDate2,
                            @Param("diseaseName") String diseaseName);
}
