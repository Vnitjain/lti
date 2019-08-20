package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository repository;
	
	public BookController(BookRepository repository)
	{
		this.repository=repository;
	}
	
	@PostMapping("/saveBook")
	public String storeBook(@RequestBody Book b)
	{
		repository.save(b);
		if(b!=null)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
		
	}
	
	@PostMapping("/bookById")
	public Book getBook(@RequestParam Integer id)
	{
	return repository.findById(id).get();
	}
	
	@PostMapping("/bookByName")
	public Book getBookByName(@RequestParam String name)
	{
		return repository.findByName(name);
	}
	
	@PostMapping("/allBooks")
	public Iterable<Book> getAllBooks()
	{
		return repository.findAll();
	}
	
	
	

}
