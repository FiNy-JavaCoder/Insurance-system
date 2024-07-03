package finalProject.Service;

import finalProject.models.InsuredPerson_DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DATABASE_SERVICE {

    @Autowired
    private InsuredPerson_DTO insuredPerson_DTO;
    private List<InsuredPerson_DTO> listOfInsured;


    public void createNewInsured(InsuredPerson_DTO insuredPerson_DTOxx) {
        insuredPerson_DTO.setFirstName(insuredPerson_DTOxx.getFirstName());
        insuredPerson_DTO.setLastName(insuredPerson_DTOxx.getLastName());
        insuredPerson_DTO.setBirthDate(insuredPerson_DTOxx.getBirthDate());
        insuredPerson_DTO.setPhoneNumber(insuredPerson_DTOxx.getPhoneNumber());
        insuredPerson_DTO.setPhonePreselection(insuredPerson_DTOxx.getPhonePreselection());
        insuredPerson_DTO.setEmail(insuredPerson_DTOxx.getEmail());
    }

    // v DATABASE_SERVICE.java
    public void addInsuredPerson() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/final_project?user=root");

             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO list_of_insured (`JMÉNO`, `PŘÍJMENÍ`, `DATUM NAROZENÍ`, `TELEFONNÍ ČÍSLO`, `PŘEDVOLBA`, `EMAIL`) VALUES (?, ?, ?, ?, ?, ?)");) {
            preparedStatement.setString(1, insuredPerson_DTO.getFirstName());
            preparedStatement.setString(2, insuredPerson_DTO.getLastName());
            preparedStatement.setDate(3, java.sql.Date.valueOf(insuredPerson_DTO.getBirthDate()));
            preparedStatement.setString(4, insuredPerson_DTO.getPhoneNumber());
            preparedStatement.setString(5, insuredPerson_DTO.getPhonePreselection());
            preparedStatement.setString(6, insuredPerson_DTO.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void resetInsuredPerson() {
        insuredPerson_DTO.setFirstName(null);
        insuredPerson_DTO.setLastName(null);
        insuredPerson_DTO.setBirthDate(null);
        insuredPerson_DTO.setPhoneNumber(null);
        insuredPerson_DTO.setPhonePreselection(null);
        insuredPerson_DTO.setEmail(null);
    }


}