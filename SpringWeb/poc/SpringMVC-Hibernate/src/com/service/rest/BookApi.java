package com.service.rest;

import org.techzoo.springmvc.form.Book;

/*
 * Services Exposed as Rest
 */
public interface BookApi {

	public void addBook(Book book);
	public void updateBook(Book book);
	public Book getBookById(Integer bookId);
	public void removeBook(Integer id);
	
}
