package com.api.utility;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class UriResolver {

    public static URI buildUri(String basePath, String path, String limit, String offset) {
        UriComponentsBuilder componentsBuilder = UriComponentsBuilder.fromHttpUrl(basePath).path(path);

        if(limit != null) {
            componentsBuilder.queryParam("limit", limit);
        }

        if(offset != null) {
            componentsBuilder.queryParam("offset", offset);
        }
        return componentsBuilder.build().toUri();
    }
}
