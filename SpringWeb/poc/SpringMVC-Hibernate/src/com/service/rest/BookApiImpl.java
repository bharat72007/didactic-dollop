package com.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.techzoo.springmvc.dao.BookDao;
import org.techzoo.springmvc.form.Book;
import org.techzoo.springmvc.service.BookService;

public class BookApiImpl implements BookApi {

	@Autowired
	private BookDao bookDao;

	
	public BookApiImpl(BookDao bookDao){
		this.bookDao = bookDao;
	}
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.addBook(book);
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.updateBook(book);
	}

	@Override
	public Book getBookById(Integer bookId) {
		// TODO Auto-generated method stub
		return this.bookDao.getBookById(bookId);
		 
	}

	@Override
	public void removeBook(Integer id) {
		// TODO Auto-generated method stub
		this.bookDao.removeBook(id);
	}
	
	
}
