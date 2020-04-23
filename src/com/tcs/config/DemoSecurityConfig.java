package com.tcs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		UserBuilder users=User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().
		withUser(users.username("nandan").password("pass@123").roles("EMPLOYEE"))
		.withUser(users.username("divya").password("pass@123").roles("MANAGER"))
		.withUser(users.username("pradeep").password("pass@123").roles("ADMIN"));
	
	}

	
}
