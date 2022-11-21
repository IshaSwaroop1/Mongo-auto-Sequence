package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Book;

public interface BookRepo extends MongoRepository<Book,Integer>{

}
