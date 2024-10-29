package com.taskapp.TaskManagementApp.Controllers;

import com.taskapp.TaskManagementApp.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TaskController {
    @RequestMapping("/")
    public String home(Model model) {
        Task taskAppModel = new Task();
//        taskAppModel.setLoadingMessage("All your tasks being completed.");

        model.addAttribute("taskAppModel", taskAppModel);
        return "index"; // Assuming "index" is the name of your HTML template file
    }

}
