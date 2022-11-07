package ru.milovtim.springsample;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
