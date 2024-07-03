package finalProject.controller;

import finalProject.Service.DATABASE_DISPLAY_SERVICE;
import finalProject.Service.DATABASE_SERVICE;
import finalProject.models.InsuredPerson_DTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RootButtons_CONTROLLER {
    @Autowired
    private DATABASE_SERVICE listInsuredPeopleSERVICE;

    @Autowired
    private DATABASE_DISPLAY_SERVICE displayInsuredPeopleSERVICE;

    @Autowired
    private InsuredPerson_DTO insuredPerson_DTO;


    @GetMapping("add")
    public String addInsured(Model model) {
        model.addAttribute("insuredPerson_DTO", new InsuredPerson_DTO());
        return "adding_insured_person";
    }

    @PostMapping("/register")
    public String createNewInsured(@ModelAttribute InsuredPerson_DTO insuredPerson_DTOxx) {
        listInsuredPeopleSERVICE.createNewInsured(insuredPerson_DTOxx);
        listInsuredPeopleSERVICE.addInsuredPerson();
        listInsuredPeopleSERVICE.resetInsuredPerson();
        return "redirect:/add";
    }

    // ------------------------------------ //
    @GetMapping("display")
    public String displayInsuredPeople(Model model) {
model.addAttribute("insuredList", displayInsuredPeopleSERVICE.getInsuredList());
        return "displaying_insured_people";
    }

    @GetMapping("menu")
    public String displayMenu() {
        return "menu";
    }

    // ------------------------------------ //
    @GetMapping("shutdown")
    public void shutdownApp() {
        System.exit(0);
    }
}

