package com.examplo.academia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AcademiaConfig {

    @Bean
    public Academia academia() {
        return Academia.getInstance();
    }

    @Bean
    public Membro membro1() {
        return new Membro("João Silva", 1);
    }

    @Bean
    public Membro membro2() {
        return new Membro("Maria Santos", 2);
    }
}

