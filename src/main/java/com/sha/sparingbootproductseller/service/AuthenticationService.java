package com.sha.sparingbootproductseller.service;

import com.sha.sparingbootproductseller.model.User;
import org.springframework.stereotype.Service;


public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
