package com.api.service;

import com.api.config.RocketConfig;
import com.api.entity.SX_Rocket;
import com.api.utility.UriResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@Service
public class NetworkingService {

    private final WebClient webClient;
    private final RocketConfig rocketConfig;

    public NetworkingService(WebClient.Builder webClientBuilder, RocketConfig rocketConfig) {
        this.webClient = webClientBuilder.baseUrl(rocketConfig.getBaseUrl()).build();
        this.rocketConfig = rocketConfig;
    }

    public Flux<SX_Rocket> getRockets(Integer limit, Integer offset) {
        int usedLimit = (limit != null) ? limit : rocketConfig.getDefaultLimit();
        int usedOffset = (offset != null) ? offset : rocketConfig.getDefaultOffset();

        URI uri = UriResolver.buildUri(rocketConfig.getBaseUrl(), "/", Integer.toString(usedLimit), Integer.toString(usedOffset));
        return webClient.get()
                .uri(uri)
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
