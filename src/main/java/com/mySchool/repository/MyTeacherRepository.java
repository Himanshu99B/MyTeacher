package com.mySchool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mySchool.entities.MyTeacher;

public interface MyTeacherRepository extends JpaRepository<MyTeacher, Integer> {

}
