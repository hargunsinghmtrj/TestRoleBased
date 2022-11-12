package at.spengergasse.vorstudiearbeit.Controller;


import at.spengergasse.vorstudiearbeit.entities.User;
import at.spengergasse.vorstudiearbeit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired private UserService service;

    @GetMapping("/userhome")
    public String showUserList(Model model){ //userlist wird ins model einghängt
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers",listUsers);

        return "userhome";

    }
}
