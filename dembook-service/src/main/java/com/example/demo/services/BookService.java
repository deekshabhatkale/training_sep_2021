package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {

	@Autowired
	private Book book;
	public Book getBookById(int id)
	{
		book.setBookId(202);
		book.setBookName("House of hollow");
		book.setAuthor("SJM");
		if(id==1)
		{

			book.setBookId(203);
			book.setBookName("Head First Java");
			book.setAuthor("unknown");
			
		}
		return this.book;
		
	}
}
