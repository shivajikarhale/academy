package com.success.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.academy.LoginRepo;
import com.success.models.Login;

@Service
public class LoginService {
	
    @Autowired
	LoginRepo loginRepo;
    
	public void addUserLoginDetails(Login login) {
		loginRepo.save(login);
	}

}
