package sda.java6.simplejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sda.java6.simplejpa.entity.User;
import sda.java6.simplejpa.repository.UserRepository;

@Controller
public class HomeController {
    private final UserRepository userRepository;

    @Autowired
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String home(){
        User user = new User();
        user.setName("TESTOWY");
        userRepository.save(user);
        return "index";
    }
}
