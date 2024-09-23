package com.practise.Springrest.SpringBootRestDemo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private int courseId;
	private String courseTitle;
	private String description;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Course(int courseId, String courseTitle, String description) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", description=" + description + "]";
	}
	

}
