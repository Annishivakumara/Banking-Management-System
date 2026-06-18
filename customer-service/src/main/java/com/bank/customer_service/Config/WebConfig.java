package com.bank.customer_service.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all API routes
                        .allowedOrigins("http://localhost:3000", "http://localhost:4200") // Add your allowed frontend URLs here
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH") // Permitted HTTP Methods
                        .allowedHeaders("*") // Allow all headers
                        .allowCredentials(true); // Allow sending session cookies/auth tokens if needed
            }
        };
    }
}