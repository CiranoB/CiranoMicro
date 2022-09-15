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

import com.gftstart.personservice.model.Person;
import com.gftstart.personservice.repository.PersonRepository;
import com.gftstart.personservice.service.PersonService;


@RestController
@RequestMapping("/person")
@CrossOrigin("*")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Person>> getAll(){
		return ResponseEntity.ok(personRepository.findAll());
	}
	
	
	@PostMapping("/")
	public Person savePerson(@RequestBody Person person) {
		System.out.println("Inside savePerson method of PersonController");
		return personService.savePerson(person);
	}
	
	@GetMapping("/{uuid}")
	public Person findPersonByUUID(@PathVariable("uuid") UUID uuidPerson) {
		System.out.println("Inside findPersonByUUID method of PersonController");
		return personService.findPersonByUUID(uuidPerson);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Person> update(@RequestBody Person oUsuario){
		return ResponseEntity.ok(personRepository.save(oUsuario));
	}
	
	
}
