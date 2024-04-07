package musicshop.controllers;

import musicshop.dto.UserDTO;
import musicshop.useraccsess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserControllerTest {
    private final UserService userService;

    @Autowired
    public UserControllerTest(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/new")
//    public String newUser(Model model){
//        model.addAttribute("user", new UserDTO());
//        return "user";
//    }
//    @PostMapping("/new")
//    public String saveUser (UserDTO dto, Model model){
//        if (userService.save(dto)) {
//            return "redirect:/";
//        } else {
//            model.addAttribute("user", dto);
//            return "user";
//        }
//    }
}
