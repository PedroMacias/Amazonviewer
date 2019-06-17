package com.mycode.amazonviewer.model;

import java.util.ArrayList;

public class Show extends Film{
		
	private int id;
	private int sessionsQuantity;
	private ArrayList<Chapter> chapters;
	
	public Show(String title, String genre, String creator, int duration, int sessionsQuantity) {
		super(title, genre, creator, duration);
		this.sessionsQuantity = sessionsQuantity;
	}
	
	public int getId() {
		return id;
	}

	public int getSessionsQuantity() {
		return sessionsQuantity;
	}

	public void setSessionsQuantity(int sessionsQuantity) {
		this.sessionsQuantity = sessionsQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

	public String toString() {
		return "\n ..:: SHOW ::.. " +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear()+
				"\n Creator: " + getCreator()+
				"\n Duration: " + getDuration();
	}
	
	
	
}
