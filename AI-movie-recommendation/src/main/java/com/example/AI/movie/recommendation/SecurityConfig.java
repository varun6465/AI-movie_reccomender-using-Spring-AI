package com.example.AI.movie.recommendation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import com.example.AI.movie.recommendation.movieservice;
import com.example.AI.movie.recommendation.AiMovieRecommendationApplication;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/**").permitAll()  // Allow all requests without authentication
                .anyRequest().authenticated()  // Require authentication for other requests
                .and()
                .csrf().disable();  // Disable CSRF for development purposes

        return http.build();
    }
}
