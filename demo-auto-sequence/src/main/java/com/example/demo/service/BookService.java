package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;

@Service
public interface BookService {
	public List<Book> getBooks();
	public void addBooks(Book book);
}
