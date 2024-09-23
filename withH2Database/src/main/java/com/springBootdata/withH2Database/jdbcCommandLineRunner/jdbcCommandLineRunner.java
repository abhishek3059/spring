package com.springBootdata.withH2Database.jdbcCommandLineRunner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBootdata.withH2Database.book.jdbc.BookJdbcRepository;
import com.springBootdata.withH2Database.book.jdbc.entity.Book;
@Component
public class jdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
   private BookJdbcRepository bookJdbcRepository;
	

	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		 bookJdbcRepository.Insert(new Book("The Enigma", "John Doe", "Fantasy"));
		 bookJdbcRepository.Insert(new Book("Shadow Dancer", "Jane Smith", "Thriller"));
		 bookJdbcRepository.Insert(new Book("Crimson Sky", "Arthur Doyle", "Romance"));
		 bookJdbcRepository.Insert(new Book("Phoenix Rise", "Emily Brontë", "Sci-Fi"));
		 bookJdbcRepository.Insert(new Book("Starlight Whisper", "J.K. Rowling", "Mystery"));
		 bookJdbcRepository.Insert(new Book("Moonlit Path", "Agatha Christie", "Mystery"));
		 bookJdbcRepository.Insert(new Book("Shadows of Time", "George Orwell", "Dystopian"));
		 bookJdbcRepository.Insert(new Book("Whispers of the Wind", "H.G. Wells", "Sci-Fi"));
		 bookJdbcRepository.delete(4);
		
	}

}
