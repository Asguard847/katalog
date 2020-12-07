package com.otto.katalog.dao;

import com.otto.katalog.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    void deleteByUsername(String username);
}
