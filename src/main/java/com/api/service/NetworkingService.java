package com.api.service;

import com.api.entity.SX_Rocket;
import com.api.utility.UriResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@Service
@PropertySource("classpath:application.properties")
public class NetworkingService {

    @Value("${rocket.api.base-url}")
    private String getBaseUrl;

    @Value("${rocket.api.default-limit}")
    private int getDefaultLimit;

    @Value("${rocket.api.default-offset}")
    private int getDefaultOffset;

    private final WebClient webClient;

    public NetworkingService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(getBaseUrl).build();
    }

    public Flux<SX_Rocket> getRockets(Integer limit, Integer offset) {
        int usedLimit = (limit != null) ? limit : getDefaultLimit;
        int usedOffset = (offset != null) ? offset : getDefaultOffset;

        URI uri = UriResolver.buildUri(getBaseUrl, "/", Integer.toString(usedLimit), Integer.toString(usedOffset));
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
