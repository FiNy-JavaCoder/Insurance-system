package SystemOfInsureds.models.dto;


import jakarta.validation.constraints.*;

import java.time.LocalDate;


public class InsuredPersonDTO {
    @NotNull(message = "Křestní jméno nesmí být prázdné")
    @NotBlank(message = "Křestní jméno nesmí být prázdné")
    @Size(min = 2, max = 35, message = "Délka křestního jména musí být v rozmezí 2 až 35 znaků")
    private String firstName;

    @NotNull(message = "Příjmení nesmí být prázdné")
    @NotBlank(message = "Příjmení jméno nesmí být prázdné")
    @Size(max = 35, message = "Příjmení je příliš dlouhé")
    private String lastName;

    @PastOrPresent(message = "Datum narození musí být v minulosti")
    private LocalDate birthDate;

    @Email
    private String email;

    private String phonePreselection;

    @Size(min = 9, max = 15, message = "Telefoní číslo musí být v rozmezí 9 až 15 znaků")
    @NotNull(message = "Telefoní číslo nesmí být prázdné")
    @NotBlank(message = "Telefoní číslo nesmí být prázdné")
    private String phoneNumber;

    @NotNull(message = "Země nesmí být prázdná")
    @NotBlank(message = "Země nesmí být prázdná")
    private String country;

    @NotNull(message = "Město nesmí být prázdné")
    @NotBlank(message = "Město nesmí být prázdné")
    private String city;

    @NotNull(message = "Ulice nesmí být prázdná")
    @NotBlank(message = "Ulice nesmí být prázdná")
    private String street;
    
    private int descriptionNumber;

    private int orientationNumber;


    private int postCode;

    public long getInsuredID() {
        return insuredID;
    }

    public void setInsuredID(Long insuredID) {
        this.insuredID = insuredID;
    }

    private long insuredID = -1;

    public @NotNull(message = "Křestní jméno nesmí být prázdné") @NotBlank(message = "Křestní jméno nesmí být prázdné") @Size(min = 2, max = 35, message = "Délka křestního jména musí být v rozmezí 2 až 35 znaků") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull(message = "Křestní jméno nesmí být prázdné") @NotBlank(message = "Křestní jméno nesmí být prázdné") @Size(min = 2, max = 35, message = "Délka křestního jména musí být v rozmezí 2 až 35 znaků") String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "Příjmení nesmí být prázdné") @NotBlank(message = "Příjmení jméno nesmí být prázdné") @Size(max = 35, message = "Příjmení je příliš dlouhé") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "Příjmení nesmí být prázdné") @NotBlank(message = "Příjmení jméno nesmí být prázdné") @Size(max = 35, message = "Příjmení je příliš dlouhé") String lastName) {
        this.lastName = lastName;
    }

    public @PastOrPresent(message = "Datum narození musí být v minulosti") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@PastOrPresent(message = "Datum narození musí být v minulosti") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public String getPhonePreselection() {
        return phonePreselection;
    }

    public void setPhonePreselection(String phonePreselection) {
        this.phonePreselection = phonePreselection;
    }

    public @NotNull(message = "Telefoní číslo nesmí být prázdné") @NotBlank(message = "Telefoní číslo nesmí být prázdné") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotNull(message = "Telefoní číslo nesmí být prázdné") @NotBlank(message = "Telefoní číslo nesmí být prázdné") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotNull(message = "Země nesmí být prázdná") @NotBlank(message = "Země nesmí být prázdná") String getCountry() {
        return country;
    }

    public void setCountry(@NotNull(message = "Země nesmí být prázdná") @NotBlank(message = "Země nesmí být prázdná") String country) {
        this.country = country;
    }

    public @NotNull(message = "Město nesmí být prázdné") @NotBlank(message = "Město nesmí být prázdné") String getCity() {
        return city;
    }

    public void setCity(@NotNull(message = "Město nesmí být prázdné") @NotBlank(message = "Město nesmí být prázdné") String city) {
        this.city = city;
    }

    public @NotNull(message = "Ulice nesmí být prázdná") @NotBlank(message = "Ulice nesmí být prázdná") String getStreet() {
        return street;
    }

    public void setStreet(@NotNull(message = "Ulice nesmí být prázdná") @NotBlank(message = "Ulice nesmí být prázdná") String street) {
        this.street = street;
    }

    public int getDescriptionNumber() {
        return descriptionNumber;
    }

    public void setDescriptionNumber(int descriptionNumber) {
        this.descriptionNumber = descriptionNumber;
    }

    public int getOrientationNumber() {
        return orientationNumber;
    }

    public void setOrientationNumber(int orientationNumber) {
        this.orientationNumber = orientationNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

}

