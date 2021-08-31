package com.scpractise.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scpractise.task.models.Parametres;

public interface ParameterRepository extends JpaRepository<Parametres, Integer>{

	Parametres getParameterByCode(int id);
  
}
