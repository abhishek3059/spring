package com.bean;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private String studentRollNumber;
	private String studentName;
	private int studentAge;
	private String studentGender;
	private String studentGrade;
	private String studentSection;
	@ManyToOne
	@JoinColumn(name = "schoolid") // adding foreing key of school.
	private School school;

	public School getSchool() {
		return school;
	}

	
	public void setSchool(School school) {
		this.school = school;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}


	public Student(String studentRollNumber, String studentName, int studentAge, String studentGender,
			String studentGrade, String studentSection, School school) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentGrade = studentGrade;
		this.studentSection = studentSection;
		this.school = school;
	}


	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + ", studentAge="
				+ studentAge + ", studentGender=" + studentGender + ", studentGrade=" + studentGrade
				+ ", studentSection=" + studentSection + ", school=" + school + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(school, studentAge, studentGender, studentGrade, studentName, studentRollNumber,
				studentSection);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(school, other.school) && studentAge == other.studentAge
				&& Objects.equals(studentGender, other.studentGender)
				&& Objects.equals(studentGrade, other.studentGrade) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentRollNumber, other.studentRollNumber)
				&& Objects.equals(studentSection, other.studentSection);
	}
	
	

}
