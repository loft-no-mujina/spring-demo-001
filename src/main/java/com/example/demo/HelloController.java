package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "index";
    }
}
