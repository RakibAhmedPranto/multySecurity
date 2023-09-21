package com.rakib.multySecurity.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/api/test")
    public String test() {
//        this.logger.warn("This is working message");
        return "Testing message";
    }
}
