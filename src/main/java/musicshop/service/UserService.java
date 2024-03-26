package musicshop.service;

import musicshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { // для security
    boolean save (UserDTO userdto);
}
