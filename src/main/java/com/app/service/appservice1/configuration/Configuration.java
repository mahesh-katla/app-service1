package com.app.service.appservice1.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service1")
@org.springframework.context.annotation.Configuration
public class Configuration {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
