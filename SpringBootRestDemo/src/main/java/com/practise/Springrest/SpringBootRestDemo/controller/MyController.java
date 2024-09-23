package com.practise.Springrest.SpringBootRestDemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.practise.Springrest.SpringBootRestDemo.entites.Course;
import com.practise.Springrest.SpringBootRestDemo.service.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	
	
public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
@GetMapping("/home") public String home() {return "This is Home page";}
@GetMapping("/courses") public List<Course> getAllCourses(){
//	List<Course> courses = List.of();
	return this.courseService.getCourses();
}

@GetMapping("/courses/{courseId}")
public Course getCourseById(@PathVariable int courseId) {
	return courseService.getCourse(courseId);
}
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) {
	return this.courseService.addCourse(course);
}
@PutMapping("/courses")
public Course updateCourse( @RequestBody Course course ) {
	return this.courseService.updateCourse(course);
	
}
@DeleteMapping("/courses/{courseId}")
public Course deleteCourse(@PathVariable int courseId) {
	return this.courseService.deleteCourse(courseId);
}
		
}
