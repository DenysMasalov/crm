package com.crmweb2.crm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/test")
    public String getTestPage(){
        return "test";

    }

    @GetMapping("/first")
    public String getFirstSite(){

        return "first";
    }

    @GetMapping("/second")
    public String getSecondSite(){

        return "second";
    }

    @PostMapping("/zoho")
    public String postZohoSite(@RequestParam String company,
                               @RequestParam String lname,
                               @RequestParam String city,
                               @RequestParam String email,
                               @RequestParam String type, Model model){

        model.addAttribute("company", company);
        model.addAttribute("lname", lname);
        model.addAttribute("city", city);
        model.addAttribute("email", email);
        model.addAttribute("type", type);

        return "zoho";
    }
}
