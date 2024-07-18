package SystemOfInsureds.controller;

import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.dto.InsuredPersonDTOFilter;
import SystemOfInsureds.models.service.InsuredsService;
import SystemOfInsureds.models.dto.mappers.InsuredMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private InsuredsService insureds_Service;

    @Autowired
    private InsuredMapper insuredMapper;

    @GetMapping("register")
    public String renderCreateForm(@ModelAttribute InsuredPersonDTO insuredPersonDTO) {
        return "adding_insured_person";
    }

    @PostMapping("register")
    public String addInsured(
            @Valid @ModelAttribute InsuredPersonDTO insuredPersonDTO) {
        insureds_Service.create(insuredPersonDTO);
        return "menu";
    }

    @GetMapping("display")
    public String displayAll(Model model) {
        model.addAttribute("all", insureds_Service.getAllInsureds());
        return "displaying_insured_people";
    }

    @GetMapping("edit/{insuredId}")
    public String renderEditForm(
            @PathVariable Long insuredId, InsuredPersonDTO insuredPersonDTO) {

        InsuredPersonDTO fetchedInsured = insureds_Service.getById(insuredId);
        insuredMapper.updateInsuredPersonDTO(fetchedInsured, insuredPersonDTO);
        return "edit_insured_person";
    }
/*
    @PostMapping("edit/{insuredId}")
    public String editInsured(
            @PathVariable long insuredId,
            @Valid InsuredPersonDTO insuredPersonDTO) {
        insuredPersonDTO.setInsuredId(insuredId);
        insureds_Service.edit(insuredPersonDTO);
        return "redirect:/manager/display";
    }
    */
}

