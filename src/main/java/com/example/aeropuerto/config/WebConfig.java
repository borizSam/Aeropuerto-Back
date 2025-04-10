package com.example.aeropuerto.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:5173",
                        "https://master.d1lmhr370iz76f.amplifyapp.com/"
                )
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("*"); //Tests-Quitar cuando este en PROD
    }
}
