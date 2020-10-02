package com.mitrais.coding.test.login.service;

import com.mitrais.coding.test.SpringConfig;
import com.mitrais.coding.test.login.Constant;
import com.mitrais.coding.test.login.entity.CommonResponse;
import com.mitrais.coding.test.login.entity.UserDto;
import com.mitrais.coding.test.persistance.entity.User;
import com.mitrais.coding.test.persistance.repository.UserDaoService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Matchers.any;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoginService.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class LoginServiceImplTest extends TestCase {

    @Autowired
    private LoginService loginService;


    @MockBean
    private UserDaoService userDaoServiceMock;


    @Test
    public void checkEmail_success(){
        User user = new User();
        user.setEmail("test@gmail.com");
        Mockito.when(userDaoServiceMock.findByEmail(any())).thenReturn(user);
        User userFromDb = loginService.checkEmail("test@gmail.com");
        Assert.assertEquals("test@gmail.com", userFromDb.getEmail() );
    }

    @Test
    public void checkMobilePhone_success(){
        User user = new User();
        user.setMobilePhone("62812345678");
        Mockito.when(userDaoServiceMock.findByMobilePhone(any())).thenReturn(user);
        User userFromDb = loginService.checkMobilePhone("62812345678");
        Assert.assertEquals("62812345678", userFromDb.getMobilePhone() );
    }

    @Test
    public void userRegistration_success() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setFirstName("Budi");
        userDto.setLastName("Susilo");
        userDto.setGender('M');
        userDto.setEmail("budisusilo@gmail.com");
        userDto.setMobilePhone("628123456");
        userDto.setDateBirth("11/10/1990");
        CommonResponse response = loginService.userRegistration(userDto);
        Assert.assertEquals("00",response.getResponseCode());
    }

    @Test
    public void userRegistration_error() throws Exception {
        UserDto userDto = new UserDto();

        CommonResponse response = loginService.userRegistration(userDto);
        Assert.assertEquals("99",response.getResponseCode());
    }
}