package SystemOfInsureds.controller;


import SystemOfInsureds.models.dto.UserDTO;
import SystemOfInsureds.models.exceptions.DuplicateEmailException;
import SystemOfInsureds.models.exceptions.PasswordsDoNotEqualException;
import SystemOfInsureds.models.dto.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AccountController {

    @Autowired
    private UserService userService;

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

    @PostMapping("/account/register-user")
    public String register(
            @Valid @ModelAttribute UserDTO userDTO,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors())
            return renderRegister(userDTO);

        try {
            userService.create(userDTO, false);
        } catch (DuplicateEmailException e) {
            result.rejectValue("email", "error", "Email je již používán.");
            return "/account/register";
        } catch (PasswordsDoNotEqualException e) {
            result.rejectValue("password", "error", "Hesla se nerovnají.");
            result.rejectValue("confirmPassword", "error", "Hesla se nerovnají.");
            return "/account/register";
        }

        redirectAttributes.addFlashAttribute("success", "Uživatel zaregistrován.");
        return "redirect:/account/login-user";
    }

}