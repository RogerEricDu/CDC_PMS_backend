package cdc.pms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Table {
    private Long cardID;
    private String cardNumber;
    private String status;
    private String patientName;
    private String guardianName;
    private String idNumber;
    private String gender;
    private LocalDate birthDate;
    private Integer age;
    private String workUnit;
    private String phone;
    private String patientCategory;
    private Integer addressStandardCode;
    private String detailedAddress;
    private String populationCategory;
    private String caseClassification;
    private String caseClassificationSecond;
    private LocalDate onsetDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime districtReviewTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime diagnosisDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime deathDate;
    private String diseaseName;
    private String originalDisease;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime originalDiagnosisDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime originalFinalReviewDate;
    private String reportingDoctor;
    private LocalDate reportDate;
    private Integer reportUnitRegionCode;
    private String reportUnit;
    private String unitType;
    private String reportEntryTime;
    private String entryUser;
    private String entryOrganization;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime cityReviewTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime provinceReviewTime;
    private String reviewStatus;
    private String correctionReportTime;
    private String correctionFinalReviewTime;
    private String FinalConfirmedDeathDate;
    private String correctionUser;
    private String correctionOrganization;
    private String remarks;

    public Long getCardID() {
        return cardID;
    }

    public void setCardID(Long cardID) {
        this.cardID = cardID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory;
    }

    public Integer getAddressStandardCode() {
        return addressStandardCode;
    }

    public void setAddressStandardCode(Integer addressStandardCode) {
        this.addressStandardCode = addressStandardCode;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getPopulationCategory() {
        return populationCategory;
    }

    public void setPopulationCategory(String populationCategory) {
        this.populationCategory = populationCategory;
    }

    public String getCaseClassification() {
        return caseClassification;
    }

    public void setCaseClassification(String caseClassification) {
        this.caseClassification = caseClassification;
    }

    public String getCaseClassificationSecond() {
        return caseClassificationSecond;
    }

    public void setCaseClassificationSecond(String caseClassificationSecond) {
        this.caseClassificationSecond = caseClassificationSecond;
    }

    public LocalDate getOnsetDate() {
        return onsetDate;
    }

    public void setOnsetDate(LocalDate onsetDate) {
        this.onsetDate = onsetDate;
    }

    public LocalDateTime getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(LocalDateTime diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public LocalDateTime getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDateTime deathDate) {
        this.deathDate = deathDate;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getOriginalDisease() {
        return originalDisease;
    }

    public void setOriginalDisease(String originalDisease) {
        this.originalDisease = originalDisease;
    }

    public LocalDateTime getOriginalDiagnosisDate() {
        return originalDiagnosisDate;
    }

    public void setOriginalDiagnosisDate(LocalDateTime originalDiagnosisDate) {
        this.originalDiagnosisDate = originalDiagnosisDate;
    }

    public LocalDateTime getOriginalFinalReviewDate() {
        return originalFinalReviewDate;
    }

    public void setOriginalFinalReviewDate(LocalDateTime originalFinalReviewDate) {
        this.originalFinalReviewDate = originalFinalReviewDate;
    }

    public String getReportingDoctor() {
        return reportingDoctor;
    }

    public void setReportingDoctor(String reportingDoctor) {
        this.reportingDoctor = reportingDoctor;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public Integer getReportUnitRegionCode() {
        return reportUnitRegionCode;
    }

    public void setReportUnitRegionCode(Integer reportUnitRegionCode) {
        this.reportUnitRegionCode = reportUnitRegionCode;
    }

    public String getReportUnit() {
        return reportUnit;
    }

    public void setReportUnit(String reportUnit) {
        this.reportUnit = reportUnit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getReportEntryTime() {
        return reportEntryTime;
    }

    public void setReportEntryTime(String reportEntryTime) {
        this.reportEntryTime = reportEntryTime;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public String getEntryOrganization() {
        return entryOrganization;
    }

    public void setEntryOrganization(String entryOrganization) {
        this.entryOrganization = entryOrganization;
    }

    public LocalDateTime getDistrictReviewTime() {
        return districtReviewTime;
    }

    public void setDistrictReviewTime(LocalDateTime districtReviewTime) {
        this.districtReviewTime = districtReviewTime;
    }

    public LocalDateTime getCityReviewTime() {
        return cityReviewTime;
    }

    public void setCityReviewTime(LocalDateTime cityReviewTime) {
        this.cityReviewTime = cityReviewTime;
    }

    public LocalDateTime getProvinceReviewTime() {
        return provinceReviewTime;
    }

    public void setProvinceReviewTime(LocalDateTime provinceReviewTime) {
        this.provinceReviewTime = provinceReviewTime;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getCorrectionReportTime() {
        return correctionReportTime;
    }

    public void setCorrectionReportTime(String correctionReportTime) {
        this.correctionReportTime = correctionReportTime;
    }

    public String getCorrectionFinalReviewTime() {
        return correctionFinalReviewTime;
    }

    public void setCorrectionFinalReviewTime(String correctionFinalReviewTime) {
        this.correctionFinalReviewTime = correctionFinalReviewTime;
    }

    public String getFinalConfirmedDeathDate() {
        return FinalConfirmedDeathDate;
    }

    public void setFinalConfirmedDeathDate(String finalConfirmedDeathDate) {
        FinalConfirmedDeathDate = finalConfirmedDeathDate;
    }

    public String getCorrectionUser() {
        return correctionUser;
    }

    public void setCorrectionUser(String correctionUser) {
        this.correctionUser = correctionUser;
    }

    public String getCorrectionOrganization() {
        return correctionOrganization;
    }

    public void setCorrectionOrganization(String correctionOrganization) {
        this.correctionOrganization = correctionOrganization;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
