package com.learn.microservices.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Data
@Component
public class Configuration {

    private  int minimum;
    private  int maximum;
}
