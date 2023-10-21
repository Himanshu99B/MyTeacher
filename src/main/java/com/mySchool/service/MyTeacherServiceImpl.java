package com.mySchool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySchool.entities.MyTeacher;
import com.mySchool.repository.MyTeacherRepository;

@Service
public class MyTeacherServiceImpl implements MyTeacherService {

	@Autowired
	private MyTeacherRepository repo;
	
	@Override
	public MyTeacher addTeacher(MyTeacher teacher) {
		MyTeacher saveTeacher = repo.save(teacher);
		return saveTeacher;
	}

}
