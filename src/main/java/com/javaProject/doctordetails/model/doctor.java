package com.javaProject.doctordetails.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="doctors")
@EntityListeners(AuditingEntityListener.class)
public class doctor {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="ID")
int ID;

@Column(name="Name")
String name;


@Column(name="specialised")
String special;


@Column(name="salary")
int salary;

@Column(name="room_no")
int room;


@Column(name="degree")
String degree;


public int getID() {
	return ID;
}


public void setID(int iD) {
	ID = iD;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getSpecial() {
	return special;
}


public void setSpecial(String special) {
	this.special = special;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


public int getRoom() {
	return room;
}


public void setRoom(int room) {
	this.room = room;
}


public String getDegree() {
	return degree;
}


public void setDegree(String deg) {
	this.degree = deg;
}


}
