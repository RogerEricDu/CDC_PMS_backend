package cdc.pms.dto;

import java.time.LocalDate;

public class TableDTO {
    private String dataset;
    private Integer dataYear;
    private Long cardID;
    private String patientName;
    private String caseClassification;
    private LocalDate onsetDate1;
    private LocalDate onsetDate2;
    private String diseaseName;

    private Integer page; //当前页
    private Integer size; //每页大小

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public Integer getDataYear() {
        return dataYear;
    }

    public void setDataYear(Integer dataYear) {
        this.dataYear = dataYear;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getCardID() {
        return cardID;
    }

    public void setCardID(Long cardID) {
        this.cardID = cardID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCaseClassification() {
        return caseClassification;
    }

    public void setCaseClassification(String caseClassification) {
        this.caseClassification = caseClassification;
    }

    public LocalDate getOnsetDate1() {return onsetDate1;}

    public void setOnsetDate1(LocalDate onsetDate1) {this.onsetDate1 = onsetDate1;}

    public LocalDate getOnsetDate2() {return onsetDate2;}

    public void setOnsetDate2(LocalDate onsetDate2) {this.onsetDate2 = onsetDate2;}

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}