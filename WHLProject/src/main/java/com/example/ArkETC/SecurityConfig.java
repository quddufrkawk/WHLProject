package com.example.ArkETC;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        // 정적 자원에 스프링 시큐리티 필터 규칙을 적용하지 않도록 설정
        return (web) -> web.httpFirewall(defaultHttpFirewall()).ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
        
    }
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();
	
        http.authorizeHttpRequests()
                .anyRequest().permitAll()
                .and()
                .formLogin()
	                .loginPage("/homeLogin").permitAll()
	                .loginProcessingUrl("/homeLogin")
	                .defaultSuccessUrl("/productHome")
                .and()
                .logout()
	                .logoutUrl("/productLogout")
	                .logoutSuccessUrl("/homeLogin")
                .permitAll();        
        
        return http.build();
    }
	
	@Bean
	public HttpFirewall defaultHttpFirewall() {
	    return new DefaultHttpFirewall();
	}

	
	public SecurityConfig() {
		// TODO Auto-generated constructor stub
	}

}
