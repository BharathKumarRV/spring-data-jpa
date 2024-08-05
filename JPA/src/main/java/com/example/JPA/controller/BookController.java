package com.example.JPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.bean.Book;
import com.example.JPA.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public Optional<Book> getBooks(@RequestParam Long id) {

		return bookService.getBooksById(id);
	}

	@PostMapping("/createBook")
	public List<Book> createBook(@RequestBody List<Book> books) {
		return bookService.saveBook(books);
	}

	@PostMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@GetMapping("/deleteBook")
	public String deleteBook(@RequestParam Long id) {
		return bookService.deleteBook(id);
	}

	@GetMapping("/sortBooks")
	public List<Book> sortBooks() {
		return bookService.sortBooks();
	}

	@GetMapping("/pagination")
	public List<Book> pageBooks() {
		return bookService.pagination();
	}

	/*
	 * @GetMapping("/containsTitle") public List<Book> findBySpecificTitle(String
	 * title) { return bookService.specificTitle(title); }
	 * 
	 * @GetMapping("/transactions") public Optional<Book>
	 * getBooksByTransaction(@RequestParam Long id) { return
	 * bookService.transactionManagement(id); }
	 */
	
	
}