package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.SequenceGeneratorService;


@RestController
@RequestMapping("/Books")
public class BookController {
	@Autowired
	BookService bookservices; 
		
	
	@GetMapping("/")
	public List<Book> getBooks() {
          return bookservices.getBooks();
	}

	@PostMapping("/addbooks")
	public void addBooks(@RequestBody Book book) {
		
		bookservices.addBooks(book);
	}
}
