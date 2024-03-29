package com.mycode.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.mycode.amazonviewer.model.Book;
import com.mycode.amazonviewer.model.Chapter;
import com.mycode.amazonviewer.model.Movie;
import com.mycode.amazonviewer.model.Show;
import com.mycode.makereport.Report;

public class Main {

	public static void main(String[] args) {
		
		showMenu();
	}

	public static void showMenu(){
		
int exit = 0;
		
		do{
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Select your option");
			System.out.println("1. Movies");
			System.out.println("2. Show");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
		
			//Read user response
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			switch (response) {
			case 0:
				//Exit
				exit = 0;
				break;
			
			case 1:
				//Movies
				showMovies();
				break;
				
			case 2:
				//Show
				showShow();
				break;
			
			case 3:
				//Books
				showBooks();
				break;
			
			case 4:
				//Magazines
				showMagazines();
				break;
				
			case 5:
				//Report
				makeReport();
				break;
				
			case 6:
				//Report today
				makeReport(new Date());
				break;

			default:
				
				System.out.println();
				System.out.println(".....Select a valid option.....");
				System.out.println();
				
				break;
			}
			
			
		}while(exit!=0);
		
	}
	
	static ArrayList<Movie> movies = Movie.makeMoviesList();	
	public static void showMovies(){
		
		int exit = 1;
				
		do{
			System.out.println();
			System.out.println("...::MOVIES::...");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + ". Viewed: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Back to main Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			if (response > 0) {
				Movie movieSelected = movies.get(response - 1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i < 10000; i++) {
					System.out.println("............");
				}
				
				//Finish Watching it
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("You just watched: " + movieSelected);
				System.out.println("For: " + movieSelected.getTimeViewed() + " time");
			}
			
			
			
		}while(exit!=0);
		
	}
	
	static ArrayList<Show> shows = Show.makeShowList();
	public static void showShow(){
		
		int exit = 1;		
		do{
			System.out.println();
			System.out.println("...::SHOW::...");
			System.out.println();
			
			for (int i = 0; i < shows.size(); i++) {
				System.out.println(i+1 + ". " + shows.get(i).getTitle() + ". Viewed: " + shows.get(i).isViewed());
			}
			
			System.out.println("0. Back to main Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			showChapters(shows.get(response -1).getChapters());
			
		}while(exit!=0);
		
	}
	
	public static void showChapters(ArrayList<Chapter> cahpterOfShowSelected){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::CHAPTERS::...");
			System.out.println();
			
			for (int i = 0; i < cahpterOfShowSelected.size(); i++) {
				System.out.println(i+1 + ". "+ cahpterOfShowSelected.get(i).getTitle() + ". Viewed: " + cahpterOfShowSelected.get(i).isViewed());
			}
			
			System.out.println("0. Back to main Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			
			Chapter chapterSelected = cahpterOfShowSelected.get(response-1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("............");
			}
			
			//Finish watching it
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("You just watched: " + chapterSelected);
			System.out.println("For: " + chapterSelected.getTimeViewed() + " time");
			
			
		}while(exit!=0);
		
	}
	
	static ArrayList<Book> books = Book.makeBooksList();
	public static void showBooks(){
		
		int exit = 1;
		
		do{
			System.out.println();
			System.out.println("...::BOOKS::...");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i+1 + ". " + books.get(i).getTitle() + ". Viewed: " + books.get(i).isReaded());
			}
			
			System.out.println("0. Back to main Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}	
					
						
			//Finish Reading it
			
			Book bookSelected = books.get(response - 1);
			bookSelected.setReaded(true);
			Date dateI = bookSelected.startToSee(new Date());
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("............");
			}
			
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("You just readed: " + bookSelected);
			System.out.println("For: " + bookSelected.getTimeReaded() + " time");
			
			
			
		}while(exit!=0);
		
	}
	
	public static void showMagazines(){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::MAGAZINES::...");
			System.out.println();
			
			System.out.println("0. Back to main Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			
		}while(exit!=0);
		
	}
	
	public static void makeReport(){
		
		Report report = new Report();
		report.setNameFile("Report");
		report.setExtension("txt");
		report.setTitle("Vewed");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString();
			}
		}
		
		for (Show show : shows) {
			ArrayList<Chapter> chapters = show.getChapters();
			for (Chapter chapter : chapters) {
				contentReport += chapter.toString() + "\n";
			}
		}
		
		for (Book book : books) {
			if (book.getIsReaded()) {
				contentReport += book.toString() + "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
		
	}
	
	public static void makeReport(Date date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("Report" + dateString);
		report.setExtension("txt");
		report.setTitle("..::VIEWED::..");
		
		SimpleDateFormat dfNameDays = new SimpleDateFormat("E, W MMM Y");
		dateString = dfNameDays.format(date);
		String contentReport = "Date: " + dateString + "\n\n\n";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString();
			}
		}
		
		for (Show show : shows) {
			ArrayList<Chapter> chapters = show.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString();
				}
			}
		}
		
		for (Book book : books) {
			if (book.getIsReaded()) {
				contentReport += book.toString()+ "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
		
	}
	
}
