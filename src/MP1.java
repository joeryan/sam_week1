import java.util.*;


public class MP1 {
//Samantha Ryan
//COSC 111
//Assignment 1
//January 17, 2015
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int box = 0, gondola = 0, passenger = 0, totalRC = 0;
		final double BOX_W = 53.0, BOX_L = 45.0, GONDOLA_W = 65.0, GONDOLA_L = 70.0, PASSENGER_W = 70.0, PASSENGER_L = 80.5;
		final double ENGINE_W = 55.0, ENGINE_L = 52.0, ENGINE_PP = 1000; 
		double totalBW = 0.0, totalBL = 0.0, totalGW = 0.0, totalGL = 0.0, totalPW = 0.0, totalPL = 0.0, totalEngine = 0.0, totalEW = 0.0, totalEL = 0.0; 
		double totalTW_NoE = 0.0, totalTW = 0.0, totalTL = 0.0; 
		Scanner scr = null; 
		
		//Input
		scr = new Scanner(System.in);
		System.out.println("This program is written by Samantha Ryan");

		System.out.println("Enter number of Box Cars: ");
		box = scr.nextInt();
		
		System.out.println("Enter number of Gondola Cars: ");
		gondola = scr.nextInt();
		
		System.out.println("Enter number of Passenger Cars: ");
		passenger = scr.nextInt();
		
		//Processing
		totalRC = box + gondola + passenger; 
		totalBW = box * BOX_W; 
		totalGW = gondola * GONDOLA_W;
		totalPW = passenger * PASSENGER_W; 
		totalTW_NoE = totalBW + totalGW + totalPW; 
		totalEngine = totalTW_NoE / ENGINE_PP;
		totalEW = totalEngine * ENGINE_W; 
		totalTW = totalEW +totalTW_NoE; 
		totalBL = box * BOX_L; 
		totalGL = gondola * GONDOLA_L;
		totalPL = passenger * PASSENGER_L;
		totalEL = totalEngine * ENGINE_L;
		totalTL = totalBL + totalGL + totalPL + totalEL; 
		
		//Output
		Math.ceil(totalEngine); 

		System.out.printf("The train is%4dcars long and consists of:%n", totalRC);
		System.out.printf("%3dBox Cars%n", box); 
		System.out.printf("%3dGondola Cars%n", gondola);
		System.out.printf("%3dPassenger Cars%n", passenger);
		System.out.println(" ");
		
		System.out.printf("The total weight of the cars is%5f tons.%n", totalTW_NoE);
		System.out.printf("The number of engines required is%3d.%n", Math.ceil(totalEngine));
		System.out.printf("The weight of the entire train is%5f tons.%n", totalTW);
		System.out.printf("The total train is%5f feet long.%n", totalTL);
		
		
		
		
	}

}
