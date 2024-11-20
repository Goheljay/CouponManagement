package com.cupon.cuponsmanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI openAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Coupons")
                .description("Coupons")
                .version("0.0.1"));
    }

    @Bean
    public GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("backend")
                .packagesToScan("com.cupon.cuponsmanagement.controller")
                .build();
    }
}