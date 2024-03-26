package musicshop.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import musicshop.dto.UserDTO;
import musicshop.model.Role;
import musicshop.model.User;
import musicshop.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean save(UserDTO userDTO) {
        if (!Objects.equals(userDTO.getUsername(), userDTO.getMatchingPassword())) {
            throw new RuntimeException("Passwords are not equal");
        }
        User user = User.builder()
                .name(userDTO.getUsername())
                .password(userDTO.getPassword())
                .email(userDTO.getEmail())
                .role(Role.CLIENT)
                .build();
        return true;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.FindFirstByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Can't find this username like: " + username);
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRole().name()));
        return new org.springframework.security.core.userdetails.User(
                user.getName(),
                user.getPassword(),
                roles
        ) ;
    }
}
