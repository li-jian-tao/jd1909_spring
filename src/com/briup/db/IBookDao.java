package com.briup.db;

import java.util.List;


public interface IBookDao {
	
	public List<Book> findBook();
	
	public void save(Book book);
	 
}
