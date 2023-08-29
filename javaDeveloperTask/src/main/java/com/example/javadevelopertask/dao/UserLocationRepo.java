package com.example.javadevelopertask.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javadevelopertask.entity.UserLocation;

public interface UserLocationRepo extends JpaRepository<UserLocation, Integer> {

	
}
