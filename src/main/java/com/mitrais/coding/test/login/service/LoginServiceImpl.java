package com.mitrais.coding.test.login.service;

import com.mitrais.coding.test.login.Constant;
import com.mitrais.coding.test.login.entity.CommonResponse;
import com.mitrais.coding.test.login.entity.UserDto;
import com.mitrais.coding.test.persistance.entity.User;
import com.mitrais.coding.test.persistance.repository.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDaoService userDaoService;

    @Override
    public User checkEmail(String email) {
        return userDaoService.findByEmail(email);
    }

    @Override
    public User checkMobilePhone(String mobilePhone) {
        return userDaoService.findByMobilePhone(mobilePhone);
    }

    @Override
    public CommonResponse userRegistration(UserDto userDto) throws Exception {
        User user = new User();
        try {
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setGender(userDto.getGender());
            if (!Constant.EMPTY.equals(userDto.getDateBirth())) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(Constant.DATE_FORMAT);
                user.setDateBirth(dateFormat.parse(userDto.getDateBirth()));
            }
            user.setMobilePhone(userDto.getMobilePhone());
            user.setEmail(userDto.getEmail());
            user.setCreatedDate(new Date());
            user.setModifiedDate(new Date());
            // save to db
            userDaoService.save(user);
        } catch (Exception e) {
            return new CommonResponse(Constant.ERROR_SAVE_DB_CODE, Constant.ERROR_SAVE_DB_DESC);
        }
        return new CommonResponse(user);
    }


}
