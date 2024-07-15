package myAssignment1;
import java.util.Scanner; // importing Scanner to get user's inputs

// This is the Main.java class file.
// this is the main file of which the program will run from/by.
// This Main class uses variables and methods from the Donut class (Donut.java) by using getters and setters (for the private variables)
// This program asks the user for the inner and the radius of a donut\torus and by calling the calculation methods from Donut.java, 
// it calculates the volume of the torus\donut and displays 2 results.
// first result is the donutGrandVolume which is the volume of the donut using the PI square formula. this formula calculates the volume from the center 
// of the donut\torus, whereas the second formula\result is a formula that calculates the volume of just the body of the donut\torus.

public class Main {
 
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in); // initializing a Scanner
//		Donut donut1 = new Donut(innerRadius, outerRadius) ; // creating an object donut1 of Donut class
		
		System.out.println("Created by Niccole Vorobiov (student number 041141159)");
		System.out.println("Enter the inner radius : "); // asks user to enter inner radius
		double usersInnerRadius = keyboard.nextDouble(); // storing the user's input in a new variable usersInnerRadius and then being set in donut1.donutInnerRadius
//		donut1.setDonutInnerRaiud(usersInnerRadius); // user enters input and input is initialized in donut1.donutInnerRadius (in Donut.java) 
		
		
		System.out.println("Enter the outer radius: "); // asks user to enter outer radius
		double usersOuterRadius = keyboard.nextDouble(); // storing the user's input in a new variable usersOuterRadius and then being set in donut1.donutOuterRadius
//		donut1.setDonutOuterRadius(usersOuterRadius); // user enters input and input is initialized in donut1.donutOuterRadius (in Donut.java)
		
		Donut donut1 = new Donut(usersInnerRadius, usersOuterRadius) ; // creating an object donut1 of Donut class using the constructor
		donut1.setDonutInnerRaiud(usersInnerRadius); // setting user's inputs values in the donut1 properties
		donut1.setDonutOuterRadius(usersOuterRadius); // same here as above ^^
		
		donut1.calcGrandVolumeOfDonut(usersOuterRadius,usersInnerRadius); //calling the method from Donut.java file to calculate the volume of the torus with the user's inputs
//		donut1.calcVolumeOfDonut(); // calling the calcVolumeOfDonut method on donut1 stored values that came from user's input
		
		
		System.out.printf("Volume Of Donut using Pi square formula is: %.2f", donut1.getDonutGrandVolume());
		System.out.println(" CM cube");//displaying the calculated Grand volume with %.2f to show 2 decimal places
//		System.out.printf("Volume of Donut using cross sections formula  is: %.2f", donut1.getDonutVolume()); // Displaying Volume of donut
		
		System.out.println(donut1.toString());
		
		keyboard.close(); // closing the Scanner

	} // end of main

} // end of Main class
