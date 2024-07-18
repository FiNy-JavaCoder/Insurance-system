package SystemOfInsureds.models.dto;


import jakarta.validation.constraints.*;

import java.time.LocalDate;


public class InsuredPersonDTOFilter {

    private String filterFirstName;

    private String filterLastName;

    private LocalDate filterBirthDate;

    private String filterEmail;

    private String filterPhonePreselection;


    private String filterPhoneNumber;


    private String filterCountry;


    private String filterCity;


    private String filterStreet;
    
    private int filterDescriptionNumber;

    private int filterOrientationNumber;


    private int filterPostCode;

    public long getFilterInsuredID() {
        return filterInsuredID;
    }

    public void setFilterInsuredID(Long insuredID) {
        this.filterInsuredID = insuredID;
    }

    private long filterInsuredID;

    public String getFirstName() {
        return filterFirstName;
    }

    public void setFilterFirstName (String firstName) {
        this.filterFirstName = filterFirstName;
    }

    public String getFilterLastName() {
        return filterLastName;
    }

    public void setFilterLastName(String filterLastName) {
        this.filterLastName = filterLastName;
    }

    public LocalDate getFilterBirthDate() {
        return filterBirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.filterBirthDate = birthDate;
    }

    public String getFilterEmail() {
        return filterEmail;
    }

    public void setFilterEmail(@Email String email) {
        this.filterEmail = filterEmail;
    }

    public String getFilterPhonePreselection() {
        return filterPhonePreselection;
    }

    public void setFilterPhonePreselection(String filterPhonePreselection) {
        this.filterPhonePreselection = filterPhonePreselection;
    }

    public String getFilterPhoneNumber() {
        return filterPhoneNumber;
    }

    public void setPhoneNumber(String filterPhoneNumber) {
        this.filterPhoneNumber = filterPhoneNumber;
    }

    public String getFilterCountry() {
        return filterCountry;
    }

    public void setFilterCountry (String filterCountry) {
        this.filterCountry = filterCountry;
    }

    public String getFilterCity() {
        return filterCity;
    }

    public void setCity(String filterCity) {
        this.filterCity = filterCity;
    }

    public String getFilterStreet() {
        return filterStreet;
    }

    public void setStreet(String filterStreet) {
        this.filterStreet = filterStreet;
    }

    public int getDescriptionNumber() {
        return filterDescriptionNumber;
    }

    public void setDescriptionNumber(int filterDescriptionNumber) {
        this.filterDescriptionNumber = filterDescriptionNumber;
    }

    public int getFilterOrientationNumber() {
        return filterOrientationNumber;
    }

    public void setFilterOrientationNumber(int filterOrientationNumber) {
        this.filterOrientationNumber = filterOrientationNumber;
    }

    public int getFilterPostCode() {
        return filterPostCode;
    }

    public void setFilterPostCode(int filterPostCode) {
        this.filterPostCode = filterPostCode;
    }

}

