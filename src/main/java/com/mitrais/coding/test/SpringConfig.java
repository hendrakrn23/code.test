package com.mitrais.coding.test;

import com.mitrais.coding.test.login.Util.JsonUtil;
import com.mitrais.coding.test.login.service.LoginService;
import com.mitrais.coding.test.login.service.LoginServiceImpl;
import com.mitrais.coding.test.persistance.repository.UserDaoService;
import com.mitrais.coding.test.persistance.repository.UserDaoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public LoginService loginService(){
        return new LoginServiceImpl();
    }

    @Bean
    public UserDaoService userDaoService(){
        return new UserDaoServiceImpl();
    }

    @Bean
    public JsonUtil jsonUtil(){
        return new JsonUtil();
    }
}
