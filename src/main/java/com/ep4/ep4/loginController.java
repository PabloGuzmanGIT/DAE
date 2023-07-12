package com.ep4.ep4;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
@RequestMapping("/login")
public class loginController {

    @Autowired
    private final LoginService loginService;
    private LoginRepository loginRepository;

    @GetMapping("")
    public String logon(Model model) {
        model.addAttribute("logueados", loginService.mostrartodo());
        model.addAttribute("titulo", "LoginPage");
        return "Login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("nombre") String nombre, @RequestParam("password") String password, Model model) {
        if (loginService.validateLogin(nombre, password)) {
            // Login successful
            return "redirect:/visitas";
        } else {
            // Login failed
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}

