package com.capgemini.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.trainee.beans.Trainee;
import com.capgemini.trainee.dao.TraineeDAO;
@Component(value="traineeService")
public class TraineeServiceImpl implements TraineeService {
@Autowired
TraineeDAO dao;

	@Override
	public Trainee AddTrainee(Trainee trainee) {
		return dao.save(trainee);
	}

	@Override
	public void DeleteTrainee(int id) {
		
		 dao.delete(id);
	}

	@Override
	public Trainee ModifyTrainee(Trainee trainee) {
		
		return dao.save(trainee);
	}

	@Override
	public Trainee RetrieveTrainee(int id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<Trainee> RetrieveAllTrainee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
