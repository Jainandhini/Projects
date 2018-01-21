package com.spendthrift.service;

import com.spendthrift.model.Profile;

public interface UserService {

	int addUser(Profile profile);
	
	Profile getUser();
	
	int updateUser(Profile profile);
}
