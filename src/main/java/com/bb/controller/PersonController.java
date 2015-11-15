package com.bb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bb.model.Person;

@RestController
public class PersonController {

	@RequestMapping("/person")
	public Person getPerson(@RequestParam(value = "name", defaultValue = "Chiku") String name,
			@RequestParam(value = "age", defaultValue = "24") Integer age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		return person;
	}
}
