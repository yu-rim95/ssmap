package com.chungrim.ssmap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("*")
public class HomeController {

    @ResponseBody
    @GetMapping("/thisHome")
    public String thisHome() {
        System.out.println("Hello World!");
        return "이러면 스트링 반환이지";
    }
}
