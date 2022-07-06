package study.jparest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.Courses;

@Repository
public interface Myrepository extends JpaRepository<Courses, Integer>{

	
}
