package finalProject.models.dto;


import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


public class InsuredPerson_DTO {
    @NotNull(message = "Křestní jméno nesmí být prázdné")
    @NotBlank(message = "Křestní jméno nesmí být prázdné")
    @Size(min = 2, max = 35, message = "Délka křestního jména musí být v rozmezí 2 až 35 znaků")
    private String firstName;

    @NotNull(message = "Příjmení nesmí být prázdné")
    @NotBlank(message = "Příjmení jméno nesmí být prázdné")
    @Size(max = 35, message = "Příjmení je příliš dlouhé")
    private String lastName;

    @PastOrPresent(message = "Datum narození musí být v minulosti")
    private LocalDate birthDate;

    @Email
    private String email;

    private String phonePreselection;

    @Size(min = 9, max = 15, message = "Telefoní číslo musí být v rozmezí 9 až 15 znaků")
    @NotNull(message = "Telefoní číslo nesmí být prázdné")
    @NotBlank(message = "Telefoní číslo nesmí být prázdné")
    private String phoneNumber;

    @NotNull(message = "Země nesmí být prázdná")
    @NotBlank(message = "Země nesmí být prázdná")
    private String country;

    @NotNull(message = "Město nesmí být prázdné")
    @NotBlank(message = "Město nesmí být prázdné")
    private String city;

    @NotNull(message = "Ulice nesmí být prázdná")
    @NotBlank(message = "Ulice nesmí být prázdná")
    private String street;

    @Size(min = 1, message = "Číslo popisné musí být celé kladné číslo")
    @NotNull(message = "Číslo popisné nesmí být prázdné")
    @NotBlank(message = "Číslo popisné nesmí být prázdné")
    private int describtionNumber;

    @Size(min = 1, message = "Číslo popisné musí být celé kladné číslo")
    @NotNull(message = "Orientační číslo nesmí být prázdné")
    private int orintationNumber;

    @Size(min = 10000, max = 79862, message = "PSČ musí být v rozmezí 10000 až 79862")
    @NotNull(message = "PSČ nesmí být prázdné")
    @NotBlank(message = "PSČ nesmí být prázdné")
    private int postCode;

}

