package finalProject.Service;

import finalProject.models.InsuredPerson_DTO;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class DATABASE_DISPLAY_SERVICE {
    public LinkedList<InsuredPerson_DTO> getInsuredList() {
        getListOfInsured();
        return insuredList;
    }

    LinkedList<InsuredPerson_DTO> insuredList = new LinkedList<>();
    private void getListOfInsured() {
        insuredList.clear();
        try (Connection spojeni = DriverManager.getConnection("jdbc:mysql://localhost/final_project?user=root");
             PreparedStatement preparedStatement = spojeni.prepareStatement("SELECT * FROM list_of_insured");
             ResultSet vysledky = preparedStatement.executeQuery()) {
            while (vysledky.next()) {
                InsuredPerson_DTO insuredPerson = new InsuredPerson_DTO();
                insuredPerson.setFirstName(vysledky.getString("JMÉNO"));
                insuredPerson.setLastName(vysledky.getString("PŘÍJMENÍ"));
                insuredPerson.setBirthDate(vysledky.getDate("DATUM NAROZENÍ").toLocalDate());
                insuredPerson.setPhoneNumber(vysledky.getString("TELEFONNÍ ČÍSLO"));
                insuredPerson.setPhonePreselection(vysledky.getString("PŘEDVOLBA"));
                insuredPerson.setEmail(vysledky.getString("EMAIL"));
                insuredList.add(insuredPerson);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}