package com.sha.sparingbootproductseller.service;

import com.sha.sparingbootproductseller.model.Role;
import com.sha.sparingbootproductseller.model.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
