package com.photoappaccountms.photoappaccountservice.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@ComponentScan
public class accountManagementController {

    @GetMapping("/status")
    public String getAccount() {
        return "working";
    }
}
