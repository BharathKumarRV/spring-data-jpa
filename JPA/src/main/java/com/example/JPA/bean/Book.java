package com.example.JPA.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String autho) {
		this.author = autho;
	}

  
}
