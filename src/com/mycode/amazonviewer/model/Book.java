package com.mycode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable{

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isReaded() {
		return readed;
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}	
	
	
	public String toString() {
		String detailBook = 
				"\n ..:: BOOK ::.. " +
				"\n Title: " + getTitle() +
				"\n Editorual: " + getEditorial() +
				"\n Edition Date: " + getEdititionDate()+
				"\n Authors: ";
//		for(int i = 0; i < getAuthors().length; i++){
//			detailBook += "\t" + getAuthors()[i];
//		}
		return detailBook;
		
	}

	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()){
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else{
			setTimeReaded(0);
		}		
	}
	
	public static ArrayList<Book> makeBooksList(){
		ArrayList<Book> books = new ArrayList();
				
		for (int i = 1; i <= 5 ; i++) {					
			books.add(new Book("Book " + i, new Date() , "Editorial "+i));	
		}
		
		return books;
	}
	
	
}
