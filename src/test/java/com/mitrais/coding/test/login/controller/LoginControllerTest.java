package com.mitrais.coding.test.login.controller;

import com.mitrais.coding.test.login.Util.JsonUtil;
import com.mitrais.coding.test.login.entity.UserDto;
import com.mitrais.coding.test.login.service.LoginService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoginController.class)
@AutoConfigureMockMvc
public class LoginControllerTest extends TestCase {
    private String baseUrl = "/login";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LoginService loginService;

    @MockBean
    private JsonUtil jsonUtil;

    @Test
    public void checkEmail() throws Exception {
        mockMvc.perform(get(baseUrl + "/checkEmail?email=test@gmail.com").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void checkMobilePhone() throws Exception {
        mockMvc.perform(get(baseUrl + "/checkMobilePhone/6281010010").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void userRegistration() throws Exception {
        String request = "{}";
        mockMvc.perform(post(baseUrl +"/registration").content(request).contentType(MediaType.APPLICATION_JSON));
    }
}