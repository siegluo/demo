package com.example.demo.spring.controller;

import com.example.demo.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

}
