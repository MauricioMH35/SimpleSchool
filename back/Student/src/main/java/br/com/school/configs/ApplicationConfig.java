package br.com.school.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.ZoneId;

@Configuration
public class ApplicationConfig {

    @Bean
    public Clock clock() {
        return Clock.system(ZoneId.of("America/Sao_Paulo"));
    }

}
