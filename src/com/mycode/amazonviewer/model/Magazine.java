package com.mycode.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication{

	private int id;
		
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	
	public String toString() {
		return "\n ..:: MAGAZINE ::.. " +
				"\n Title: " + getTitle() +
				"\n Editorual: " + getEditorial() +
				"\n Edition Date: " + getEdititionDate();
	}
	
}
