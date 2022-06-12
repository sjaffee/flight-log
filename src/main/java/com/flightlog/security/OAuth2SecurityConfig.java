package com.flightlog.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/*
 * Security settings
 * 	- HTTP GET calls to /** requires fakebookapi.read scope
 * 	- tokens come in as JWT 
 * 	- No sessions created during requests (No JSESSIONID Cookie created)
 */
@Configuration
public class OAuth2SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests(authz -> authz
            .antMatchers(HttpMethod.GET, "/**").hasAuthority("SCOPE_flightlog.read")
            .anyRequest().authenticated())
          .oauth2ResourceServer(oauth2 -> oauth2.jwt())
          .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
