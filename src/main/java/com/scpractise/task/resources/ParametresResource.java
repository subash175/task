package com.scpractise.task.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scpractise.task.models.Parametres;
import com.scpractise.task.repository.ParameterRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/parametres")
public class ParametresResource 
{
	@Autowired
	ParameterRepository praRepo;
	
	@GetMapping(value="/all")
	public List<Parametres> getall()
	{
		return praRepo.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Parametres get(@PathVariable int id)
	{
		return praRepo.getParameterByCode(id);
	}

	@PostMapping(value="/save")
	public List<Parametres>saveParams(@RequestBody Parametres param)
	{
		praRepo.save(param);
		return praRepo.findAll();
		
	}
	
	@PutMapping(value="/save/{id}")
	public Parametres saveParams(@PathVariable int id,@RequestBody Parametres param)
	{
		Parametres para=praRepo.save(param);
		return para;
		
	}
	
	
	
	
	
}
