package com.mySchool.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_Info")
public class MyTeacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String t_Name;
	
	private String t_Subject;
	
	private String t_Email;
	
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_Name() {
		return t_Name;
	}
	public void setT_Name(String t_Name) {
		this.t_Name = t_Name;
	}
	public String getT_Subject() {
		return t_Subject;
	}
	public void setT_Subject(String t_Subject) {
		this.t_Subject = t_Subject;
	}
	public String getT_Email() {
		return t_Email;
	}
	public void setT_Email(String t_Email) {
		this.t_Email = t_Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MyTeacher() {
	
	}
	public MyTeacher(int id, String t_Name, String t_Subject, String t_Email, String password) {
		super();
		this.id = id;
		this.t_Name = t_Name;
		this.t_Subject = t_Subject;
		this.t_Email = t_Email;
		this.password = password;
	}
	
	

}
