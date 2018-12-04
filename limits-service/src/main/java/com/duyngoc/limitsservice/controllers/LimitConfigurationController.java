package com.duyngoc.limitsservice.controllers;

import com.duyngoc.limitsservice.config.Configuration;
import com.duyngoc.limitsservice.models.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retreiveLimitsFromConfigurations() {
    return new LimitConfiguration(configuration.getMax(), configuration.getMin());
    }
}
