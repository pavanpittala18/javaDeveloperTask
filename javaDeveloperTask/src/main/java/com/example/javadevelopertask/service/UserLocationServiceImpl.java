package com.example.javadevelopertask.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javadevelopertask.dao.UserLocationRepo;
import com.example.javadevelopertask.entity.UserLocation;

@Service
public class UserLocationServiceImpl implements UserLocationService {
    
	@Autowired
	private UserLocationRepo userLocationRepo;
	
	public UserLocationServiceImpl(UserLocationRepo userLocationRepo) {
		super();
		this.userLocationRepo = userLocationRepo;
	}

	@Override
	public UserLocation createUser(UserLocation userLocation) {
		// TODO Auto-generated method stub
		return userLocationRepo.save(userLocation);
	}

	@Override
	public UserLocation updateUser(UserLocation userLocation) {
		// TODO Auto-generated method stub
		return userLocationRepo.save(userLocation);
	}

	@Override
	public List<UserLocation> getNearestUsers(int x) {
		List<UserLocation> allUsers=userLocationRepo.findAll();
		
		List<UserLocation> nearestUsers=allUsers.stream()
				.filter(user -> !user.isExcluded())
				.sorted(Comparator.comparingDouble(user -> Math.sqrt(Math.pow(user.getLatitude(), 2)+Math.pow(user.getLongitude(), 2))
				)).limit(x).collect(Collectors.toList());
		
		return nearestUsers;
		
	}
	
	
}
