package com.storagenergy.website;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {
    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("message", "Hello World!");
        return "index";
    }
    @GetMapping("/assets/logos/{logo}")
    public String getLogo(Model model){
        return "test";
    }
}
