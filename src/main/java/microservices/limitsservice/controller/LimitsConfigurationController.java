package microservices.limitsservice.controller;

import microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @GetMapping(path = "/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return limitsConfiguration;
    }
}
