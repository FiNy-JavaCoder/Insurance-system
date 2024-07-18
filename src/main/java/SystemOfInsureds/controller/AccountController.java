package SystemOfInsureds.controller;


import SystemOfInsureds.models.dto.UserDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AccountController {

    // GETMAPPING REQUESTS //

    @GetMapping("/account/login-user")
    public String renderLogin() {
        return "account/login";
    }
    @GetMapping("/account/register-user")
    public String renderRegister(@ModelAttribute UserDTO userDTO) {
        return "account/register";
    }
    // POSTMAPPING REQUESTS //

    @PostMapping("account/register-user")
    public String register(
            @Valid @ModelAttribute UserDTO userDTO,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors())
            return renderRegister(userDTO);

        redirectAttributes.addFlashAttribute("success", "Uživatel zaregistrován.");
        return "redirect:/account/login-user";
    }
}

