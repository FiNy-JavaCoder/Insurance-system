package SystemOfInsureds.controller;

import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.exceptions.InsuredNotFoundException;
import SystemOfInsureds.models.dto.service.InsuredsService;
import SystemOfInsureds.models.dto.mappers.InsuredMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private InsuredsService insureds_Service;

    @Autowired
    private InsuredMapper insuredMapper;

    @Secured("ROLE_ADMIN")
    @GetMapping("register")
    public String renderCreateForm(@ModelAttribute InsuredPersonDTO insuredPersonDTO) {
        return "adding_insured_person";
    }
    @Secured("ROLE_ADMIN")
    @PostMapping("register")
    public String addInsured(
            @Valid @ModelAttribute InsuredPersonDTO insuredPersonDTO) {
        insureds_Service.create(insuredPersonDTO);
        return "redirect:/manager/display";
    }

    @GetMapping("display")
    public String displayAll(Model model) {
        model.addAttribute("all", insureds_Service.getAllInsureds());
        return "displaying_insured_people";
    }
    @Secured("ROLE_ADMIN")
    @GetMapping("edit/{insuredId}")
    public String renderEditForm(
            @PathVariable("insuredId") Long insuredId, InsuredPersonDTO insuredPersonDTO, RedirectAttributes redirectAttributes) {
        InsuredPersonDTO fetchedInsured = insureds_Service.getById(insuredId);

        insuredMapper.updateInsuredPersonDTO(fetchedInsured, insuredPersonDTO);
        return "edit_insured_person";
    }
    @Secured("ROLE_ADMIN")
    @PostMapping("edit/{insuredId}")
    public String editInsured(
            @PathVariable("insuredId") long insuredId,
            @Valid InsuredPersonDTO insuredPersonDTO, BindingResult result , RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            StringBuilder errorMessage = new StringBuilder("Error updating InsuredPerson with ID: " + insuredId + ". ");
            result.getAllErrors().forEach(error -> errorMessage.append(error.getDefaultMessage()).append(" "));
            return renderEditForm(insuredId, insuredPersonDTO, redirectAttributes);
        }
        insuredPersonDTO.setInsuredId(insuredId);
        insureds_Service.edit(insuredPersonDTO);
        redirectAttributes.addFlashAttribute("successMessage", String.format("Pojištěnec s ID: %d byl aktualizován.", insuredId));
        return "redirect:/manager/display";
    }
    @Secured("ROLE_ADMIN")
    @GetMapping("delete/{insuredId}")
    public String deleteInsured(@PathVariable("insuredId") long insuredId,
                                RedirectAttributes redirectAttributes) {

        insureds_Service.remove(insuredId);
        redirectAttributes.addFlashAttribute("infoMessage", String.format("Pojištěnec s ID: %d byl smazán.", insuredId));
        return "redirect:/manager/display";
    }
    @ExceptionHandler({InsuredNotFoundException.class})
    public String handleInsuredNotFoundException(InsuredNotFoundException ex, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("errorMessage", ex.getMessage());
        return "redirect:/manager/display";
    }

}

