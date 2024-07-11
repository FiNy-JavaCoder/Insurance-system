package SystemOfInsureds.controller;

import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.service.InsuredsService;
import SystemOfInsureds.models.dto.mappers.InsuredMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @GetMapping("display")
    public String displayInsureds(Model model) {
        List<InsuredPersonDTO> insureds = insureds_Service.getAll();
        model.addAttribute("insureds", insureds);
        return "displaying_insured_people";
    }

    @PostMapping("register")
    public String addInsured(
            @Valid @ModelAttribute InsuredPersonDTO insuredPersonDTO) {
        insureds_Service.create(insuredPersonDTO);
    return "menu";
}

}
