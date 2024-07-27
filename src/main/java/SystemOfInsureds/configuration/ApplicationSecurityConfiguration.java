package SystemOfInsureds.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationSecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests()
                .requestMatchers(
                        "/manager/register", "/manager/delete/**", "/manager/edit/**", "/manager/display"
                )
                .authenticated() // Require authentication for these pages
                .requestMatchers(
                        "/menu", "/account/register-user"
                )
                .permitAll() // Allow all visitors to access this page
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/account/login-user") // Přihlašovací URL adresa
                .loginProcessingUrl("/account/login-user") // Přihlašovací URL adresa
                .defaultSuccessUrl("/manager/display", true) // Nastavení přesměrování po úspěšném přihlášení
                .usernameParameter("email") // Chceme se přihlašovat pomocí emailu
                .permitAll() // Povolit vstup na `/account/login` i nepřihlášeným uživatelům
                .and()
                .logout()
                .logoutUrl("/account/logout") // Odhlašovací URL adresa
                .and()
                .build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}