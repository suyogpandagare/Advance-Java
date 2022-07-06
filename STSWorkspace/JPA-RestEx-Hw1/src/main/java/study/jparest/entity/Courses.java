package study.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")

public class Courses {

	@Id
	@Column
	private int id;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_desc")
	private String courseDesc;
	
	@Column(name = "duration_in_months")
	private int durationInMonths;
	
	@Column(name = "faculty_name")
	private String facultyName;
	
	public Courses() {  }

	public Courses(int id, String courseName, String courseDesc, int durationInMonths, String facultyName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.durationInMonths = durationInMonths;
		this.facultyName = facultyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", courseDesc=" + courseDesc + ", durationInMonths="
				+ durationInMonths + ", facultyName=" + facultyName + "]";
	}
	
	
	
}
