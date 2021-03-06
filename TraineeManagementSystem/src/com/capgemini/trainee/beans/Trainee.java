package com.capgemini.trainee.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainee")
public class Trainee {
	
@Id
private int traineeId;
private String traineeName;
private String traineeDomain;
private String traineeLocation;
public Trainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
	super();
	this.traineeId = traineeId;
	this.traineeName = traineeName;
	this.traineeDomain = traineeDomain;
	this.traineeLocation = traineeLocation;
}
public Trainee() {
	super();
}
public int getTraineeId() {
	return traineeId;
}
public void setTraineeId(int traineeId) {
	this.traineeId = traineeId;
}
public String getTraineeName() {
	return traineeName;
}
public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}
public String getTraineeDomain() {
	return traineeDomain;
}
public void setTraineeDomain(String traineeDomain) {
	this.traineeDomain = traineeDomain;
}
public String getTraineeLocation() {
	return traineeLocation;
}
public void setTraineeLocation(String traineeLocation) {
	this.traineeLocation = traineeLocation;
}


}
