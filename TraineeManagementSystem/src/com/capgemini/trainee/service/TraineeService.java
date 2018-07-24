package com.capgemini.trainee.service;

import java.util.List;

import com.capgemini.trainee.beans.Trainee;

public interface TraineeService {
	public Trainee AddTrainee(Trainee trainee);
	public void DeleteTrainee(int id);
	public Trainee ModifyTrainee(Trainee trainee);
	public Trainee RetrieveTrainee(int id);
	public List<Trainee> RetrieveAllTrainee();
	

}
