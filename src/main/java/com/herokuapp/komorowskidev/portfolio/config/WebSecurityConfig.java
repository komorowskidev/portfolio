package com.herokuapp.komorowskidev.portfolio.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * konfiguracja dostępu do podstron
 * dane dostępowe do strony administracyjnej w zmiennych systemowych
 * JAVA_PORTFOLIO_ADMIN_NAME, JAVA_PORTFOLIO_ADMIN_PASSWORD
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .antMatchers("/", "/psychoterapia", "/programowanie", "/pszczelarstwo").permitAll()
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login").permitAll()
            .and()
        .logout().permitAll();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser(System.getenv("JAVA_PORTFOLIO_ADMIN_NAME"))
                .password(System.getenv("JAVA_PORTFOLIO_ADMIN_PASSWORD"))
                .roles("ADMIN");
    }

}
