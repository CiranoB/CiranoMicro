package com.gftstart.personservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gftstart.personservice.model.User;
import com.gftstart.personservice.repository.UserRepository;
import com.gftstart.personservice.service.UserService;


@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		System.out.println("Inside saveUser method of UserController");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{uuid}")
	public User findUserByUUID(@PathVariable("uuid") UUID uuidPerson) {
		System.out.println("Inside findPersonByUUID method of PersonController");
		return userService.findUserByUUID(uuidPerson);
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> update(@RequestBody User user){
		return ResponseEntity.ok(userService.saveUser(user));
	}

	
	
}
