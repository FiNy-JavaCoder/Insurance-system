package SystemOfInsureds.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/add")
    public String addInsured() {

        return "adding_insured_person";
    }

    @GetMapping("/display")
    public String displayInsuredPeople() {

        return "displaying_insured_people";
    }

    @GetMapping("/menu")
    public String displayMenu() {
        return "menu";
    }

    @GetMapping("/shutdown")
    public void shutdownApp() {

        System.exit(0);
    }
}

