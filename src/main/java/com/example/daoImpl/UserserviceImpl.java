package com.example.daoImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
@Service
public class UserserviceImpl  {
	
   @Autowired
	private UserRepository userrepo;
	
	public String save(@Valid User p){
		User user= userrepo.save(p);
		 return "user has saved in system" ;
			
		} 
	
	
	
	

}