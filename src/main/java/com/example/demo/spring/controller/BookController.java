package com.example.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.spring.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

}
