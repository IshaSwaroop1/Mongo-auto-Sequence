package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="books")
public class Book {
	@Transient
	public static final String SEQUENCE_NAME="users_sequence";
	@Id
	private int id;
	private String name;
	private double price;
}
