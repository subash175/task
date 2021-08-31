package com.scpractise.task.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scpractise.task.models.User;
import com.scpractise.task.repository.UsersRepository;

@RestController
@RequestMapping(value="/users")
public class UserResource 
{
	@Autowired
	UsersRepository userRepo;
	
	@GetMapping(value="/all")
	public List<User> getAllUsers()
	{
	  return userRepo.findAll();
	}
	

}
