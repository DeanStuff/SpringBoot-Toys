package dwee.spring.fema.entity;

import javax.persistence.*;

/**
 * Created by dean on 5/31/20.
 */
@Entity
@Table(name = "covidnetwork")
public class COVIDNetwork {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "catchment")
    private String catchment ;

    @Column(name = "network")
    private String network;

    @Column(name = "year")
    private Integer year;

    @Column(name = "mmwrYear")
    private Integer mmwrYear;

    @Column(name = "mmwrWeek")
    private Integer mmwrWeek;

    @Column(name = "ageCategory")
    private String ageCategory;

    @Column(name = "cumuulativeRate")
    private Double cumulativeRate;

    @Column(name = "WeeklyRate")
    private Double weeklyRate;

    public String getCatchment() {
        return catchment;
    }

    public void setCatchment(String catchment) {
        this.catchment = catchment;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMmwrYear() {
        return mmwrYear;
    }

    public void setMmwrYear(Integer mmwrYear) {
        this.mmwrYear = mmwrYear;
    }

    public Integer getMmwrWeek() {
        return mmwrWeek;
    }

    public void setMmwrWeek(Integer mmwrWeek) {
        this.mmwrWeek = mmwrWeek;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public Double getCumulativeRate() {
        return cumulativeRate;
    }

    public void setCumulativeRate(Double cumulativeRate) {
        this.cumulativeRate = cumulativeRate;
    }

    public Double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(Double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }
}
