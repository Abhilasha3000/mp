package com.capgemini.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.trainee.beans.Trainee;

public interface TraineeDAO extends JpaRepository<Trainee,Integer> {

}
