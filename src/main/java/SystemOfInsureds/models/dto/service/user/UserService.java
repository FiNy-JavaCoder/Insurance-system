package SystemOfInsureds.models.dto.service.user;

import SystemOfInsureds.models.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    void create(UserDTO user, boolean isAdmin);

}