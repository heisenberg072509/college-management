package com.example.college.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProperties {

    @Value("${app.defaultPageSize}")
    private int defaultPageSize;

    public int getDefaultPageSize() {
        return defaultPageSize;
    }
}
