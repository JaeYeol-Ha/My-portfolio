package com.creativity.board.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserTestController {
 
    @GetMapping("/test")
    public String test(Model model) {
        return "index";
    }
    
    @GetMapping("/thymeleaf-test")
    public String getUser(Model model) {
        User2 user = new User2("kkaok", "테스트", "web") ;
        model.addAttribute("user", user);
        return "thymeleaf-test";
    }
}
