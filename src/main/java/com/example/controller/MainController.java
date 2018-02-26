package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 05-Jul-17.
 */
@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "/sm")
    public String welcome(){
        return "index";
    }

}
