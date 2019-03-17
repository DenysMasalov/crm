package com.crmweb2.crm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String getTestPage(){
        return "test";


    }
}
