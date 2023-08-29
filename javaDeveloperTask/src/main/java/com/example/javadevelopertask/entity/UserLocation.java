package com.example.javadevelopertask.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private double latitude;
	private double longitude;
	@Column(columnDefinition = "BOOLEAN")
	private Boolean excluded;
	public UserLocation() {
		super();
	}
	public UserLocation(int id, String name, double latitude, double longitude, boolean excluded) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.excluded = excluded;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public boolean isExcluded() {
		return excluded;
	}
	public void setExcluded(boolean excluded) {
		this.excluded = excluded;
	}
	

}
