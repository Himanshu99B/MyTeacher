package com.mySchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mySchool.entities.MyTeacher;
import com.mySchool.service.MyTeacherService;

@RestController
@RequestMapping("/api/myschool")
public class MyTeacherController {
	
	@Autowired
	private MyTeacherService service;
	
	@PostMapping
	public String createTeacher(@RequestBody MyTeacher teacher) {
		service.addTeacher(teacher);
		return "Record is saved!";
	}

}
