package SystemOfInsureds.models.dto.service.user;

import SystemOfInsureds.models.dto.UserDTO;

public interface UserService {

    void create(UserDTO user, boolean isAdmin);
}
