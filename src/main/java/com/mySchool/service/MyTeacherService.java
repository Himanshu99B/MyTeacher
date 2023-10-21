package com.mySchool.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mySchool.entities.MyTeacher;

public interface MyTeacherService {
	
	public MyTeacher addTeacher(MyTeacher teacher);

}
