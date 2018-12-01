package com.hzit.service;

import java.util.List;

import com.hzit.dao.StudentDao;
import com.hzit.entity.Student;

public class StudentService {


	public boolean save(Student currentUser) {
		return new StudentDao().save(currentUser);
	}

	public List<Student> getStudentList() {
		return new StudentDao().getStudentList(); 
	}

}
