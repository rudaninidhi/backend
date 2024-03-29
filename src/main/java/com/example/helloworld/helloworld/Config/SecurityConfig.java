//package com.example.helloworld.helloworld.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    DefaultSecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
//        return http
//                .authorizeHttpRequests(auth->{
//                    auth.requestMatchers("/").permitAll();
//                    auth.anyRequest().authenticated();
//                })
//                .oauth2Login(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }
//}
