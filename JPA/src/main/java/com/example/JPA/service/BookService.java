package com.example.JPA.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.JPA.bean.Book;
import com.example.JPA.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(BookService.class);
	
	public Optional<Book> getBooksById(Long id) {
		return bookRepository.findById(id);
		
		//return bookRepository.findByAuthor(title);
	}

	/*
	 * public List<Book> getBooksByTitle(String title) { return
	 * bookRepository.findByTitle(title); //return
	 * bookRepository.findByAuthor(title); }
	 */

	public List<Book> saveBook(List<Book> books) {
		return bookRepository.saveAll(books);
	}
	
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	public String deleteBook(Long id) {
		bookRepository.deleteById(id);
		return "Success";
	}
	
	
	public List<Book> sortBooks() {
		
		//return bookRepository.findAll(Sort.by("title"));
		
		//return bookRepository.findAll(Sort.by(Sort.Direction.DESC, "title"));
		
		return bookRepository.findAll(Sort.by("id").and(Sort.by("title")));
		
	}
	
	public List<Book> pagination() {
		
		Pageable paging = PageRequest.of(0, 2, Sort.by("id"));
		
		
		Page<Book> pageBooks=bookRepository.findAll(paging);
		logger.info("Page information:",pageBooks.getContent());
		List<Book> pagebooks=pageBooks.getContent();
		return pagebooks;
	}

	/*
	 * public List<Book> specificTitle(String title){
	 * 
	 * return bookRepository.findBySpecificTitle(title); }
	 * 
	 * @Transactional public Optional<Book> transactionManagement(Long id){
	 * 
	 * bookRepository.deleteById(id); return bookRepository.findById(id); }
	 */
}
