package com.mycode.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable{

	private int id;
	private int timeViewed;
			
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}

	public void showData(){
//		System.out.println("Title: " + this.title);
//		System.out.println("Genre: " + this.genre);
//		System.out.println("Year: " + this.year);
	}
	
	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	public String toString() {
		return "\n ..:: MOVIE ::.. " +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear()+
				"\n Creator: " + getCreator()+
				"\n Duration: " + getDuration();
	}

	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		
		return dateI;
	}

	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds()){
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}else{
			setTimeViewed(0);
		}
	}
	
	
}
