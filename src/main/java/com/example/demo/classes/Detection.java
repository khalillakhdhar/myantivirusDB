package com.example.demo.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Detection {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
private String malware;
@NotNull
private String date;
private String action;
private String description;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMalware() {
	return malware;
}
public void setMalware(String malware) {
	this.malware = malware;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
