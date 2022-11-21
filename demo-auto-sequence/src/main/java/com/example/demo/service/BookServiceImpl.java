package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService{
   
	@Autowired
	private BookRepo bookrepo;

	@Autowired
	private SequenceGeneratorService service;
	
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	@Override
	public void addBooks(Book book) {
		// TODO Auto-generated method stub
		book.setId(service.getSequenceNumber(Book.SEQUENCE_NAME));
		bookrepo.save(book);
	}
	
}
