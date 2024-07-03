package finalProject.models;


import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


@Component
public class InsuredPerson_DTO {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        if (birthDate != null) {
            return birthDate;
        }
        return birthDate = LocalDate.now();
    }

    public int getAge() {
        return age;
    }

    public String getPhonePreselection() {
        return phonePreselection;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhonePreselection(String phonePreselection) {
        this.phonePreselection = phonePreselection;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private int age;
    private String phonePreselection;
    private String phoneNumber;

    private String email;


    private String searchName;
    private String searchSurname;
    private LocalDate searchBirthDate;
    private String searchEmail;
    private String searchPhoneNumber;


    public LinkedList<InsuredPerson_DTO> getListOfInsured() {
        return listOfInsured;
    }

    public void setListOfInsured(LinkedList<InsuredPerson_DTO> listOfInsured) {
        this.listOfInsured = listOfInsured;
    }

    private LinkedList<InsuredPerson_DTO> listOfInsured;
}

