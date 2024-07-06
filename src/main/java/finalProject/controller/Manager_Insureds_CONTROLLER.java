package finalProject.controller;

import finalProject.models.service.Insureds_SERVICE;
import finalProject.models.dto.InsuredPerson_DTO;
import finalProject.models.dto.mappers.InsuredMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class Manager_Insureds_CONTROLLER {

    @Autowired private Insureds_SERVICE insureds_SERVICE;

    @Autowired private InsuredMapper insuredMapper;

    @GetMapping("add")
    public String renderCreateForm(@ModelAttribute InsuredPerson_DTO insuredPerson_DTO) {
        return "adding_insured_person";
    }

    @PostMapping("add")
    public String addInsured(
        @Valid @ModelAttribute InsuredPerson_DTO insuredPerson_DTO,
                BindingResult result) {
        if (result.hasErrors())
            return "insuredPerson_DTO";
insureds_SERVICE.create(insuredPerson_DTO);
        return "adding_insured_person";

    }


    @PostMapping("/register")
    public String createNewInsured() {

        return "redirect:/add";
    }

}
