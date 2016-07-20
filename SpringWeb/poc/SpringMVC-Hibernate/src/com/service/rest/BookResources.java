package com.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.techzoo.springmvc.dao.BookDao;
import org.techzoo.springmvc.dao.BookDaoImpl;
import org.techzoo.springmvc.form.Book;
import org.techzoo.springmvc.service.BookService;
import org.techzoo.springmvc.service.BookServiceImpl;

//REST Resources

@Path("/Books")

public class BookResources {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("id/{bookId}")
	public String sayPlainTextHello(@PathParam("bookId") Integer bookId) {
	
	//	Logger.getLogger("Restdblogger").debug("Start Message");
		BookDao bookDao = new BookDaoImpl();
	//	BookService bookServiceImpl = new BookServiceImpl();
		BookApi bookSer  = new BookApiImpl(bookDao);
	//	Logger.getLogger("Restdblogger").debug("Intermediate Message");
	//	Employee e = new Employee();
		Book book = bookSer.getBookById(bookId);
		
	    return book.toString();
	}

	
}
