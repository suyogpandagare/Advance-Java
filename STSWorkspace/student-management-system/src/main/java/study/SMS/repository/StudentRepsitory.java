package study.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.SMS.entity.Student;


public interface StudentRepsitory extends JpaRepository<Student, Long>{

	
}
