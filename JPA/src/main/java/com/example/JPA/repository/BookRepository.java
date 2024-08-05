package com.example.JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.JPA.bean.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	/*
	 * List<Book> findByTitle(String title);
	 * 
	 * List<Book> findByAuthor(String title);
	 * 
	 * List<Book> countByTitle(String title);
	 * 
	 * List<Book> findByTitleAndId(String title,String id);
	 * 
	 * 
	 * List<Book> findByTitleOrderByIdDesc(String title);
	 * 
	 * void deleteByTitle(String title);
	 * 
	 * 
	 * @Query("select b from Book b where title like %:title%") List<Book>
	 * findBySpecificTitle(@Param("title") String title);
	 * 
	 * 
	 * @Query(value="select * from Book where title like %:title%",nativeQuery=true)
	 * List<Book> findBySpecificTitle(String title);
	 */

}