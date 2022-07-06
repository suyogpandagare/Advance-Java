package study.SMS.service;

import java.util.List;

import study.SMS.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentId(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
