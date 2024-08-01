package com.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pagination")
public class PaginationProperties {

    private Integer defaultLimit;
    private Integer defaultOffset;

    public Integer getDefaultLimit() {
        return defaultLimit;
    }

    public void setDefaultLimit(Integer defaultLimit) {
        this.defaultLimit = defaultLimit;
    }

    public Integer getDefaultOffset() {
        return defaultOffset;
    }

    public void setDefaultOffset(Integer defaultOffset) {
        this.defaultOffset = defaultOffset;
    }
}
