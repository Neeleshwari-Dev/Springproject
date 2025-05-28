package com.example.demo.Controller;


import com.example.demo.Modules.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web")
public class Controllers {

    @GetMapping("/home")
    public String dis(Model model)
    {
        List<User> data= Arrays.asList(new User(1,"kumar","Kumar@gmail.com"),
        new User(2,"suresh","suresh@gmail.com"),
        new User(3,"ganesh","ganesh@gmail.com"));

        model.addAttribute("users",data);
        return "view";
    }


}
