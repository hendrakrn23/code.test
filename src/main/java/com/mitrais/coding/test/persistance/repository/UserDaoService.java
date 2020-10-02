package com.mitrais.coding.test.persistance.repository;

import com.mitrais.coding.test.persistance.entity.User;

public interface UserDaoService {
    public User findByEmail(String email);
    public User findByMobilePhone(String mobilePhone);
    public String save(User user);

}
