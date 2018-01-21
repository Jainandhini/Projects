package com.spendthrift.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.spendthrift.model.Profile;
@Path("/user")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class UserServiceImpl implements UserService {
	
	private static Map<String,Profile> users=new HashMap<String,Profile>();

	@Override
	@POST
    @Path("/add")
	public int addUser(Profile profile) {
		// TODO Auto-generated method stub
		int response=0;
		if(users.get(profile.getEmail()) != null){
			response=-1;
		}

		users.put(profile.getEmail(),profile);
		
		
		return response;
	}

	@Override
	public Profile getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUser(Profile profile) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
