package com.example.javadevelopertask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.javadevelopertask.entity.UserLocation;
import com.example.javadevelopertask.service.UserLocationService;

@RestController
@RequestMapping("/api")
public class UserLocationController {
   
	private UserLocationService userLocationService;
    @Autowired
	public UserLocationController(UserLocationService userLocationService) {
		super();
		this.userLocationService = userLocationService;
	}
    @PostMapping("/add")
    public UserLocation addUser(@RequestBody UserLocation userLocation) {
    	userLocation.setId(0);
    	userLocationService.createUser(userLocation);
    	return userLocation;
    }
    @PutMapping("/update")
    public UserLocation updateUser(@RequestBody UserLocation userLocation) {
    	userLocationService.updateUser(userLocation);
    	return userLocation;
    }
    @GetMapping("/user/{userId}")
    public List<UserLocation> getById(@PathVariable int userId) {
    	return userLocationService.getNearestUsers(userId);
    }
    
}
