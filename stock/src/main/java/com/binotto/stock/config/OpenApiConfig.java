package com.binotto.stock.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Stock Control API")
                        .description("REST API for stock management, providing endpoints to create, retrieve, update, and delete products, with data validation and error handling.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Pamella Binotto")
                                .email("pamellabinotto@gmail.com")
                        )
                );
    }
}