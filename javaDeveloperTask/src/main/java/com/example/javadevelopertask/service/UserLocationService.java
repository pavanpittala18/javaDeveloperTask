package com.example.javadevelopertask.service;

import java.util.List;

import com.example.javadevelopertask.entity.UserLocation;

public interface UserLocationService {
   
	public UserLocation createUser(UserLocation userLocation);
	
	public UserLocation updateUser(UserLocation userLocation);
    
	List<UserLocation> getNearestUsers(int x);
	
}
