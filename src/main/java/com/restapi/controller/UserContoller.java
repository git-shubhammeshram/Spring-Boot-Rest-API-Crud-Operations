package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.User;
import com.restapi.serviceimp.UserServiceImp;

@RestController
public class UserContoller {
	
	@Autowired
	private UserServiceImp usi;
	
	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		String upsert = usi.upsert(user);
		
		return new ResponseEntity<>(upsert,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
		User userById = usi.getUserById(id);
		
		return new ResponseEntity<>(userById,HttpStatus.OK);
		
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = usi.getAllUser();
		return new ResponseEntity<>(allUser,HttpStatus.OK);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		String upsert = usi.upsert(user);
		return new ResponseEntity<>(upsert,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id){
		
		String deleteById = usi.deleteById(id);
		return new ResponseEntity<>(deleteById,HttpStatus.OK);
		
	}

}
