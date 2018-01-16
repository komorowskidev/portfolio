package com.herokuapp.komorowskidev.portfolio.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * konfiguracja aplikacji
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("data.properties")
@ComponentScan("com.herokuapp.komorowskidev.portfolio")
public class ApplicationConfig {

}
