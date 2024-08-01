package com.api.service;

import com.api.entity.SxRocket;
import com.api.utility.UriResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.util.List;

@Service
@PropertySource("classpath:application.properties")
public class NetworkingService {

    @Value("${rocket.api.base-url}")
    private String baseUrl;

    @Value("${rocket.api.path}")
    private String getPath;

    @Value("${rocket.api.default-limit}")
    private int getDefaultLimit;

    @Value("${rocket.api.default-offset}")
    private int getDefaultOffset;

    private final WebClient webClient;

    public NetworkingService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<SxRocket> getRockets(Integer limit, Integer offset) {

        int usedLimit = (limit != null) ? limit : getDefaultLimit;
        int usedOffset = (offset != null) ? offset : getDefaultOffset;

        URI uri = UriResolver.buildUri(getPath, Integer.toString(usedLimit), Integer.toString(usedOffset));

        return webClient.get()
                .uri(baseUrl + uri)
                .retrieve()
                .bodyToFlux(SxRocket.class)
                .collectList()
                .block();
    }

    public SxRocket getRocket(String rocketId) {
        return webClient.get()
                .uri("/{rocket_id}", rocketId)
                .retrieve()
                .bodyToMono(SxRocket.class)
                .block();
    }
}
