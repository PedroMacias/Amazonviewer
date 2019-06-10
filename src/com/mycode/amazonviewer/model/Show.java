package com.mycode.amazonviewer.model;

public class Show extends Film{
		
	private int id;
	private int sessionsQuantity;
	private Chapter[] chapters;
	
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

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	
	
}
