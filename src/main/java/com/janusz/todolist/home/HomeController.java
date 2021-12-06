package com.janusz.todolist.home;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Hello " + SecurityContextHolder.getContext().getAuthentication().getName() + "!";
    }
}