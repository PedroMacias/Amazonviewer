package com.mycode.amazonviewer.model;

public class Chapter extends Movie{	

	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration,year);
		this.sessionNumber = sessionNumber;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	public String toString() {
		return "\n ..:: CHAPTER ::.. " +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear()+
				"\n Creator: " + getCreator()+
				"\n Duration: " + getDuration();
	}
	
}
