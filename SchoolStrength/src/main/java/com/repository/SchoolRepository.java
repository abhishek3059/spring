package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.School;

public interface SchoolRepository extends JpaRepository<School,String > {
	public List<School> findAllByCity(String city);
	

}
