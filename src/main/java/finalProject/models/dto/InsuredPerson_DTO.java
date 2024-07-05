package finalProject.models.dto;


import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.LinkedList;

public class InsuredPerson_DTO {
    @NotNull(message = "Křestní jméno nesmí být prázdné")
    @NotBlank(message = "Křestní jméno nesmí být prázdné")
    @Size(max = 35, message = "Křestní jméno je příliš dlouhé")
    private String firstName;
    @NotNull(message = "Příjmení nesmí být prázdné")
    @NotBlank(message = "Příjmení jméno nesmí být prázdné")
    @Size(max = 35, message = "Příjmení je příliš dlouhé")
    private String lastName;
    @Future(message = "Datum narození musí být v budoucnosti")
    private LocalDate birthDate;
    @Email
    private String email;

    private String phonePreselection;
    private String phoneNumber;
    private String country;
    @NotNull(message = "Město nesmí být prázdné")
    @NotBlank(message = "Město nesmí být prázdné")
    private String city;
    @NotNull(message = "Ulice nesmí být prázdná")
    @NotBlank(message = "Ulice nesmí být prázdná")
    private String street;
    @Size(min = 1, message = "Číslo popisné musí být celé kladné číslo")
    private int describtionNumber;
    @Size(min = 1, message = "Číslo popisné musí být celé kladné číslo")
    private int orintationNumber;
    @Size(min = 10000,max = 79862, message = "Číslo popisné musí být celé kladné číslo")
    private int postCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhonePreselection() {
        return phonePreselection;
    }

    public void setPhonePreselection(String phonePreselection) {
        this.phonePreselection = phonePreselection;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getDescribtionNumber() {
        return describtionNumber;
    }

    public void setDescribtionNumber(int describtionNumber) {
        this.describtionNumber = describtionNumber;
    }

    public int getOrintationNumber() {
        return orintationNumber;
    }

    public void setOrintationNumber(int orintationNumber) {
        this.orintationNumber = orintationNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
}

