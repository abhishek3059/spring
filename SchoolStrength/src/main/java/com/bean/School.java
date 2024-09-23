package com.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class School {
	@Id 
	private String schoolId;
	private String schoolName;
	private String schoolType;
	private String city;
	
	@OneToMany(mappedBy = "school")
	private List<Student> studentList = new ArrayList<Student>();

	public String getSchoolId() {
		return schoolId;
	}

	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public School(String schoolId, String schoolName, String schoolType, String city, List<Student> studentList) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolType = schoolType;
		this.city = city;
		this.studentList = studentList;
	}

	public School() {
		super();
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolType=" + schoolType + ", city="
				+ city + ", studentList=" + studentList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, schoolId, schoolName, schoolType, studentList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(city, other.city) && Objects.equals(schoolId, other.schoolId)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolType, other.schoolType)
				&& Objects.equals(studentList, other.studentList);
	}
	

}
