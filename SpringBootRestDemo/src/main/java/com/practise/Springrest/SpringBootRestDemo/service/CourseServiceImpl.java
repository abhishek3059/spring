package com.practise.Springrest.SpringBootRestDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practise.Springrest.SpringBootRestDemo.entites.Course;

//List.of(new Course(23,"Java Core","Basics of class and Object in Java")
//		,new Course(34,"Java Spring Core","Basics of Spring Framework")
//		,new Course(45,"Java Spring MVC","Basics of web MVC design in Spring framework ")
//	,new Course(56,"Java Spring Boot","Enterprise level highly scalable");

@Service
public class CourseServiceImpl implements CourseService{
	private List<Course> coursedetails ;




	public CourseServiceImpl () {
			coursedetails = new ArrayList<>();
			coursedetails.add(new Course(23,"Java Core","Basics of class and Object in Java"));
			coursedetails.add(new Course(34,"Java Spring Core","Basics of Spring Framework"));
			coursedetails.add(new Course(45,"Java Spring MVC","Basics of web MVC design in Spring framework "));
			coursedetails.add(new Course(56,"Java Spring Boot","Enterprise level highly scalable"));
	}
	public List<Course> getCoursedetails() {
		return coursedetails;
	}
	 

	@Override
	public List<Course> getCourses() {
		return coursedetails;
}

 
	@Override
	public Course getCourse(int id) {
		for(int i  = 0; i < coursedetails.size(); i++) {
			Course course = coursedetails.get(i);
			if(course.getCourseId() == id) {return course;}
			
		}
		return null;
	}
	@Override
	public Course addCourse(Course course) {
		this.coursedetails.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
			Course c = null;
			for(Course c1 : coursedetails) {
				if(c1.getCourseId() == course.getCourseId()) {
					c1.setCourseTitle(course.getCourseTitle());
					c1.setDescription(course.getDescription());
					c = c1;
				}
			}
		return c;
	}
	@Override
	public Course deleteCourse(int courseId) {
				Course p = coursedetails.stream()
									.filter(course -> course.getCourseId() == courseId)
											.findFirst()
													.orElse(null);
		
		
		coursedetails.remove(p);
		return p;
		
	}
}
