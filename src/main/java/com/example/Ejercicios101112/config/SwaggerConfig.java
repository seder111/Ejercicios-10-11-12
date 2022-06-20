package com.example.Ejercicios101112.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo("Documentación API REST de Laptops",
                "Esta es una descripción de la api de laptops para que puedas" +
                        "implementarla con tu front-end",
                "1.0",
                "https:www.sergiogonzalez.me/termsofservice",
                new Contact(
                        "Sergio González",
                        "https://sergiogonzalez.me",
                        "sergiogonzalezmerino@gmail.com"),
                "MIT",
                "https://sergiogonzalez.me/mitlicense",
                Collections.emptyList());
    }
}
