package com.example.buysell.configurations;

import com.example.buysell.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends SecurityConfigurerAdapter {

}
