package com.api.service;

import com.api.entity.SX_Rocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class NetworkingService {

    private final WebClient webClient;

    @Autowired
    public NetworkingService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.spacexdata.com/v3/rockets").build();
    }

    public Flux<SX_Rocket> getRockets() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(SX_Rocket.class);
    }

    public Mono<SX_Rocket> getRocket(String rocketId) {
        return webClient.get()
                .uri("/{rocket_id}", rocketId)
                .retrieve()
                .bodyToMono(SX_Rocket.class);
    }
}
