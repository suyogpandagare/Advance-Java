package study.SMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import study.SMS.entity.Student;
import study.SMS.repository.StudentRepsitory;
import study.SMS.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepsitory studentRepository;
	
	public StudentServiceImpl(StudentRepsitory studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentId(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
