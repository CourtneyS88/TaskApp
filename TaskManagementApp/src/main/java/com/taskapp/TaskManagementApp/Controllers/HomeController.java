package com.taskapp.TaskManagementApp.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String landingpage(){
        return "landingpage";
    }

}
