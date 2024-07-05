package finalProject.controller;

import finalProject.models.dto.InsuredPerson_DTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class Manager_Insureds_CONTROLLER {


    @PostMapping("add")
    public String addInsured() {
        @Valid @ModelAttribute InsuredPerson_DTO insuredPerson_DTO;

        return "adding_insured_person";
    }


    @PostMapping("/register")
    public String createNewInsured() {

        return "redirect:/add";
    }

}
