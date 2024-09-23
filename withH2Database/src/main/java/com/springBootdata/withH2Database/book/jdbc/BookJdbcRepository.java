package com.springBootdata.withH2Database.book.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springBootdata.withH2Database.book.jdbc.entity.Book;

@Repository
public class BookJdbcRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String Insert_Query = """
			INSERT INTO book (title, author, genre)
			VALUES 
			(?,?,?);
	
			
		 """;
	private static String Delete_Query = """ 
			Delete from book where id = ?
			""";
	public void Insert(Book book) {
		jdbcTemplate.update(Insert_Query, book.getTitle(),book.getAuthor(),book.getGenre());
	}
	
	public void delete(long id) {
		
		jdbcTemplate.update(Delete_Query,id);
	}
	
}
