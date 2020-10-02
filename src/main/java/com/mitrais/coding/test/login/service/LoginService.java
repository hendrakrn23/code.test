package com.mitrais.coding.test.login.service;

import com.mitrais.coding.test.login.entity.CommonResponse;
import com.mitrais.coding.test.login.entity.UserDto;
import com.mitrais.coding.test.persistance.entity.User;

public interface LoginService {

    public CommonResponse userRegistration(UserDto userDto) throws Exception;
    public User checkEmail(String email);
    public User checkMobilePhone(String mobilePhone);
}
