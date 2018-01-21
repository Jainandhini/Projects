package com.spendthrift.db;

import com.spendthrift.model.Profile;

public interface UserProfileDB {
	//returns userid or error -1
	public int addProfile(Profile p);
	public Profile viewProfile(String userid);
	
	/* 
	public int deleteProfile(Profile p);
	
	public int addCategory(String category,float limit);
	public int deleteCategory(String category);
	
	public int addPayMethod(String method,float limit);
	public int deletePayMethod(String method);
	*/
}
