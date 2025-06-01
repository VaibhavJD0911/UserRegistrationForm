package com.example.user.UserRegistrationForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    
    @Autowired
    private RegistrationService service;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "register";  // your HTML form template
    }
    
    @GetMapping("/clear")
    public String clearForm(Model model) {
        model.addAttribute("registration", new Registration());  // empty form object
        return "register";  // same form view name here
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Registration registration, Model model) {
        String result = service.register(registration);

        if ("success".equals(result)) {
            model.addAttribute("message", "Your response has been recorded.");
            model.addAttribute("status", "success");
        } else {
            model.addAttribute("message", result);
            model.addAttribute("status", "error");
        }

        return "response";  // response view after registration
    }
}
