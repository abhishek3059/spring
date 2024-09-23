package com.practise.Springrest.SpringBootRestDemo.service;

import java.util.List;

import com.practise.Springrest.SpringBootRestDemo.entites.Course;

public interface CourseService {
 public List<Course> getCourses();

public Course getCourse(int id);

public Course addCourse(Course course);

public Course updateCourse(Course course);

public Course deleteCourse(int courseId);
}
