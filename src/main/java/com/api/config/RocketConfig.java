package com.api.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConfigurationProperties(prefix = "rocket.api")
@Getter
@Setter
public class RocketConfig {

    private String baseUrl;
    private int defaultLimit;
    private int defaultOffset;

    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}
