package com.akysoft.todoapp.configurations;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@EnableWebSecurity
public class SecurityConfig implements SecurityFilterChain {

    @Override
    public boolean matches(HttpServletRequest request) {
        return false;
    }

    @Override
    public List<Filter> getFilters() {
        return null;
    }
}