package study.jparest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.Courses;
import study.jparest.repository.Myrepository;

@RestController
@RequestMapping(path = "/jpaex")
public class MyrestController {

	@Autowired
	Myrepository repo;

	@GetMapping("/allCourses")
	public List<Courses> showAllCourses()
	{
		List<Courses> list = repo.findAll();

		return list;
	}

	@PostMapping("/addCourse")
	public String addCourse(@RequestBody Courses c)
	{
		Courses cs = new Courses(c.getId(), c.getCourseName(), c.getCourseDesc(), c.getDurationInMonths(), c.getFacultyName());
		repo.save(cs);

		return "Course Added Successfully";
	}

	@PutMapping("/change/{courseName}/{facultyName}")
	public String changeFacultyName(@PathVariable String courseName, @PathVariable String facultyName)
	{
		List<Courses> list = repo.findAll();
		
//		list.forEach((row)->{if(row.getCourseName().equals(courseName)) row.setFacultyName(facultyName);});
//		repo.saveAll(list);
		
		for (int i=0;i<list.size();i++) {
			
			if(list.get(i).getCourseName().equalsIgnoreCase(courseName))
			{
				list.get(i).setFacultyName(facultyName);
			}
		}
		

		return "Faculty Name Updated Successfully";
	}

	@DeleteMapping("/removecourse/{courseId}")
	public String deleteCourse(@PathVariable int courseId)
	{
		repo.deleteById(courseId);

		return "Course Deleted Successfully";
	}

}
