package com.mitrais.coding.test.persistance.repository;
import com.mitrais.coding.test.persistance.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, String> {
    public User findByMobilePhone(String mobilePhone);
    public User findByEmail(String email);

}
