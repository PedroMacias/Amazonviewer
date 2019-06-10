package com.mycode.amazonviewer;

import java.util.Date;

import com.mycode.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		Movie movie = new Movie("Coco", "Animation", "Pixar", 120, (short)2017);
		System.out.println(movie);
		//showMenu();
	}

	public static void showMenu(){
		
int exit = 0;
		
		do{
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Select your option");
			System.out.println("1, Movies");
			System.out.println("2. Show");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
		
			//Read user response
			int response = 1;
			
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
		do{
			System.out.println();
			System.out.println("...::MOVIES::...");
			System.out.println();
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
