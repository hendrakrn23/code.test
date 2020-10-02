package com.mitrais.coding.test.persistance.repository;

import com.mitrais.coding.test.SpringConfig;
import com.mitrais.coding.test.login.service.LoginService;
import com.mitrais.coding.test.persistance.entity.User;
import junit.framework.TestCase;
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
@SpringBootTest(classes = UserDaoService.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class UserDaoServiceTest extends TestCase {
    @Autowired
    private UserDaoService userDaoService;

    @MockBean
    private UserRepository repository;

    @Test
    public void findByMobilePhone(){
        userDaoService.findByMobilePhone("628912134");
    }

    @Test
    public void findByEmail(){
        userDaoService.findByEmail("test@gmail.com");
    }

    @Test
    public void save(){
        User user = new User();
        user.setId("123456789");
        Mockito.when(repository.save(any())).thenReturn(user);
        userDaoService.save(any());
    }

}