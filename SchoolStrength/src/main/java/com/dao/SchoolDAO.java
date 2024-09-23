 package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.School;
import com.bean.Student;
import com.repository.SchoolRepository;
import com.repository.StudentRepository;

@Repository
public class SchoolDAO {

	@Autowired
	private SchoolRepository schoolRepo;
	@Autowired
	private StudentRepository studentRepo;

	public void addSchool(School school) {
		schoolRepo.save(school);
		
	}

	public void registerStudentToSchool(String schoolId, List<Student> student) {
		School school = schoolRepo.findById(schoolId).orElse(null);
		student.forEach(e -> e.setSchool(school));
		studentRepo.saveAll(student);

	}

	public List<School> schoolWithMaximumStudents(String city) {
		List<School> schoolsByCity = schoolRepo.findAll().stream().filter(school -> school.getCity().equals(city)).toList();
		Map<School,Long> schoolAndStudentCount = schoolsByCity.stream().collect(Collectors.toMap(s -> s, s-> (long)s.getStudentList().size()));
	    long MaximumStudents = schoolAndStudentCount.entrySet().stream().map(entry -> entry.getValue()).max(Long::compare).get();
	    List<School> result = new ArrayList<>();
	    for(Map.Entry<School, Long> value : schoolAndStudentCount.entrySet()) {
	    	if(value.getValue() == MaximumStudents) {
	    		result.add(value.getKey());
	    	}
	    }
	    return result;
		
	

	}

	public SchoolRepository getSchoolRepo() {
		return schoolRepo;
	}

	public void setSchoolRepo(SchoolRepository schoolRepo) {
		this.schoolRepo = schoolRepo;
	}

	public StudentRepository getStudentRepo() {
		return studentRepo;
	}

	public void setStudentRepo(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}
}
