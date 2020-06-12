package dwee.spring.fema.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dean on 5/14/20.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class MissionAssignment {
    private String maId;
    private String city;
    private String stateorTribe;
    private String zip;
    private Integer disasterNumber;
    private String declarationType;
    private String agency;
    private String assistanceRequested;
    private String statementOfWork;
    private String disasterDescription;
    private String authority;
    private String dateRequested;
    private String dateObligated;
    private Float stateCostSharePct;
    private Float federalCostSharePct;
    private Double stateCostShareAmt;
    private Double federalCostShareAmt;
    private Double requestedAmount;
    private Double obligationAmount;
    private String projectedCompletionDate;
    private String hash;
    private String lastRefresh;
    private String id;

    public String getMaId() {
        return maId;
    }

    public void setMaId(String maId) {
        this.maId = maId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateorTribe() {
        return stateorTribe;
    }

    public void setStateorTribe(String stateorTribe) {
        this.stateorTribe = stateorTribe;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Integer getDisasterNumber() {
        return disasterNumber;
    }

    public void setDisasterNumber(Integer disasterNumber) {
        this.disasterNumber = disasterNumber;
    }

    public String getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAssistanceRequested() {
        return assistanceRequested;
    }

    public void setAssistanceRequested(String assistanceRequested) {
        this.assistanceRequested = assistanceRequested;
    }

    public String getStatementOfWork() {
        return statementOfWork;
    }

    public void setStatementOfWork(String statementOfWork) {
        this.statementOfWork = statementOfWork;
    }

    public String getDisasterDescription() {
        return disasterDescription;
    }

    public void setDisasterDescription(String disasterDescription) {
        this.disasterDescription = disasterDescription;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(String dateRequested) {
        this.dateRequested = dateRequested;
    }

    public String getDateObligated() {
        return dateObligated;
    }

    public void setDateObligated(String dateObligated) {
        this.dateObligated = dateObligated;
    }

    public Float getStateCostSharePct() {
        return stateCostSharePct;
    }

    public void setStateCostSharePct(Float stateCostSharePct) {
        this.stateCostSharePct = stateCostSharePct;
    }

    public Float getFederalCostSharePct() {
        return federalCostSharePct;
    }

    public void setFederalCostSharePct(Float federalCostSharePct) {
        this.federalCostSharePct = federalCostSharePct;
    }

    public Double getStateCostShareAmt() {
        return stateCostShareAmt;
    }

    public void setStateCostShareAmt(Double stateCostShareAmt) {
        this.stateCostShareAmt = stateCostShareAmt;
    }

    public Double getFederalCostShareAmt() {
        return federalCostShareAmt;
    }

    public void setFederalCostShareAmt(Double federalCostShareAmt) {
        this.federalCostShareAmt = federalCostShareAmt;
    }

    public Double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Double getObligationAmount() {
        return obligationAmount;
    }

    public void setObligationAmount(Double obligationAmount) {
        this.obligationAmount = obligationAmount;
    }

    public String getProjectedCompletionDate() {
        return projectedCompletionDate;
    }

    public void setProjectedCompletionDate(String projectedCompletionDate) {
        this.projectedCompletionDate = projectedCompletionDate;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getLastRefresh() {
        return lastRefresh;
    }

    public void setLastRefresh(String lastRefresh) {
        this.lastRefresh = lastRefresh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MissionAssignment{" +
                "maId='" + maId + '\'' +
                ", city='" + city + '\'' +
                ", stateorTribe='" + stateorTribe + '\'' +
                ", zip='" + zip + '\'' +
                ", disasterNumber=" + disasterNumber +
                ", declarationType='" + declarationType + '\'' +
                ", agency='" + agency + '\'' +
                ", assistanceRequested='" + assistanceRequested + '\'' +
                ", statementOfWork='" + statementOfWork + '\'' +
                ", disasterDescription='" + disasterDescription + '\'' +
                ", authority='" + authority + '\'' +
                ", dateRequested='" + dateRequested + '\'' +
                ", dateObligated='" + dateObligated + '\'' +
                ", stateCostSharePct=" + stateCostSharePct +
                ", federalCostSharePct=" + federalCostSharePct +
                ", stateCostShareAmt=" + stateCostShareAmt +
                ", federalCostShareAmt=" + federalCostShareAmt +
                ", requestedAmount=" + requestedAmount +
                ", obligationAmount=" + obligationAmount +
                ", projectedCompletionDate='" + projectedCompletionDate + '\'' +
                ", hash='" + hash + '\'' +
                ", lastRefresh='" + lastRefresh + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
