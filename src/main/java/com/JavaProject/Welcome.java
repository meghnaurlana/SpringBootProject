package com.JavaProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/Welcome")
    public String welcome(){
        return "Welcome Spring";
    }
}
