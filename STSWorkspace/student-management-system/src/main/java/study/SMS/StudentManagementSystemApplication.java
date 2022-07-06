package study.SMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import study.SMS.entity.Student;
import study.SMS.repository.StudentRepsitory;

@SpringBootApplication    //commandline runner to add to database from here itself
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepsitory studentRepoRepsitory;
	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student student1 = new Student("suyog", "pandagare", "suyog@gmail.com");
		 * studentRepoRepsitory.save(student1);
		 * 
		 * Student student2 = new Student("sanket", "wight", "sanket@gmail.com");
		 * studentRepoRepsitory.save(student2);
		 * 
		 * Student student3 = new Student("rakhi", "pandagare", "rakhi@gmail.com");
		 * studentRepoRepsitory.save(student3);
		 */
		
	
	
	
	
	
	
	}

}
