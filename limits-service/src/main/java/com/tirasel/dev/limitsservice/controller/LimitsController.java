package com.tirasel.dev.limitsservice.controller;

import com.tirasel.dev.limitsservice.bean.Limits;
import com.tirasel.dev.limitsservice.configerations.Configerations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configerations configerations;

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(configerations.getMinimum(), configerations.getMaximum());
    }

}
