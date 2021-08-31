package com.scpractise.task.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.scpractise.task.models.User;

public interface UsersRepository extends JpaRepository<User,Integer>
{
 
}
