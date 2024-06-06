package com.model.in;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompanyRecord {
	@Id
	
	private Long id;
	private double latitude;
	private double longitude;
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "CompanyRecord [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", title=" + title
				+ ", getId()=" + getId() + ", getLatitude()=" + getLatitude() + ", getLongitude()=" + getLongitude()
				+ ", getTitle()=" + getTitle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
