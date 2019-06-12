package com.pyl.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserService myUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/js/**","/assets/**", "/css/**","/layui/**", "/images/**").permitAll()
                .antMatchers("/randCode", "/login","login-error")
                .permitAll().anyRequest().authenticated()
                .and()
                .formLogin().usernameParameter("username")
                .passwordParameter("password").loginPage("/login").permitAll()
                .defaultSuccessUrl("/index")
                .and()
                .logout()
                .logoutSuccessUrl("/login")//退出之后跳转到注册页面
                .deleteCookies("JSESSIONID")
                .and().rememberMe()
                .tokenValiditySeconds(1209600);


    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserService).passwordEncoder(new MyPasswordEncoder());
    }

}
