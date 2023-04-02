package com.app.service.appservice1.controller;

import com.app.service.appservice1.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller {
    @GetMapping("/service1/data")
    public ResponseEntity<String> getData(){
      return ResponseEntity.ok("service1");
    }

    @Autowired
    Configuration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        System.out.println(configuration.getValue());
        return configuration.getValue();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/server-location")
    public String serverLocation() {
        return this.restTemplate.getForObject(
                "http://web2", String.class);
    }
}
