package study.jparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
