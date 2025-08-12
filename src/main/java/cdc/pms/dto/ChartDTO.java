package cdc.pms.dto;

import java.util.List;

public class ChartDTO {
    private String geographicLocation;
    private List<String> diseaseName;

    // Getter / Setter
    public String getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(String geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public List<String> getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(List<String> diseaseName) {
        this.diseaseName = diseaseName;
    }
}
