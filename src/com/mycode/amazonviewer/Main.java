package com.mycode.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.mycode.amazonviewer.model.Movie;

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

	public static void showMovies(){
		
		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();		
		do{
			System.out.println();
			System.out.println("...::MOVIES::...");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + ". Viewed: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Read user response
			
			Scanner sc = new Scanner(System.in);			
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			
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
			
			
		}while(exit!=0);
		
	}
	
	public static void showShow(){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::SHOW::...");
			System.out.println();
		}while(exit!=0);
		
	}
	
	public static void showChapters(){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::CHAPTERS::...");
			System.out.println();
		}while(exit!=0);
		
	}
	
	public static void showBooks(){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::BOOKS::...");
			System.out.println();
		}while(exit!=0);
		
	}
	
	public static void showMagazines(){
		
		int exit = 1;
		do{
			System.out.println();
			System.out.println("...::MAGAZINES::...");
			System.out.println();
		}while(exit!=0);
		
	}
	
	public static void makeReport(){
		
	}
	
	public static void makeReport(Date date){
		
	}
	
}
