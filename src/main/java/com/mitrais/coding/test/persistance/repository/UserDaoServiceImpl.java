package com.mitrais.coding.test.persistance.repository;

import com.mitrais.coding.test.persistance.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoServiceImpl implements UserDaoService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public User findByMobilePhone(String mobilePhone) {
        return repository.findByMobilePhone(mobilePhone);
    }

    @Override
    public String save(User user) {
        return repository.save(user).getId();
    }
}
