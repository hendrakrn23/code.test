package com.mitrais.coding.test.login.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mitrais.coding.test.login.Util.JsonUtil;
import com.mitrais.coding.test.login.entity.CommonResponse;
import com.mitrais.coding.test.login.entity.UserDto;
import com.mitrais.coding.test.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private JsonUtil jsonUtil;

    @GetMapping(path = "/checkEmail")
    public String checkEmail(@RequestParam String email) throws JsonProcessingException {
        return  jsonUtil.generateJson(new CommonResponse(loginService.checkEmail(email)));
    }

    @GetMapping(path = "/checkMobilePhone/{mobilePhone}")
    public String checkMobilePhone(@PathVariable("mobilePhone") String mobilePhone) throws JsonProcessingException {
        return jsonUtil.generateJson(new CommonResponse(loginService.checkMobilePhone(mobilePhone))) ;
    }


    @PostMapping(path = "/registration", produces = MediaType.APPLICATION_JSON_VALUE)
    public String userRegistration(@RequestBody UserDto userDto) throws Exception {
        return jsonUtil.generateJson(loginService.userRegistration(userDto));
    }

}
