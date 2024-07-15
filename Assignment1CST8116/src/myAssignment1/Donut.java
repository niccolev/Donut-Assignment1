package myAssignment1;
import java.lang.Math; // import Math to use "in the power of" (pow) and pi (PI)

// This is the class file called Donut.java
// This files stores all variables, getters and setters and methods. 
// The purpose of the variables is to hold values that will come from the user's input from Main.java file
// The purpose of the getters is to get access to the private variables that are in Donut.java from Main.java
// The setters will take the input from the user from Main.java and set in inside of the variable thats in Donut.java
// And then by calling the calcDonutVolume() and calcGrandDonutVolume() methods, we will use the formulas in them to calculate the volume of a torus
// using the input from the user.

public class Donut { 
	
private double donutInnerRadius ; // declaring a variable (value will come from user's input in Main.java)
private double donutOuterRadius ; // declaring a variable (value will come from user's input in Main.java)
private double donutGrandVolume; // will be calculated and returned to this variable - in the calcGrandVolumeOfDonut method (being called in Main.java), using the user's inputs from Main.java
//private double donutVolume; // will be calculated and returned to this variable - in the calcVolumeOfDonut method (being called in Main.java), using the user's inputs from Main.java


// constructor model. used in Main.java to set variables in the donuts variables
public Donut (double donutInnerRadius, double donutOuterRadius) {
	this.donutInnerRadius = donutInnerRadius;
	this.donutOuterRadius = donutOuterRadius;
} // end of constructor

// getting donutInnerRadius so it can be used in Main class, because donutInnerRadius is private - we need to get it first. (not being used)
public double getDonutInnerRadius () {
	return donutInnerRadius ;
} // end of getDonutInnerRadius getter

// setting users input value in donutInnerRadius, with a condition that will not let user input an inner radius that is higher than the outer radius. (not being used)
public void setDonutInnerRaiud(double donutInnerRadius) {
	if (donutInnerRadius > donutOuterRadius) {
		this.donutInnerRadius = donutInnerRadius; 
	}
} // end of setDonutInnerRadius setter

// getting donutOuterRadius so it can be used in Main class, because donutOuterRadius is private - we need to get it first.
public double getDonutOuterRadius() {
	return donutOuterRadius;
}// end of getDonutRadius getter


//setting users input value in donutOuterRadius, with a condition that will not let user input an outer radius that is lower than the inner radius.
public void setDonutOuterRadius (double donutOuterRadius) {
	if (donutOuterRadius < donutInnerRadius) {
		System.out.println("The outer radius cannot be lower than the inner radius, The results are shown below but will not make sense");
	} else {
		this.donutOuterRadius = donutOuterRadius; 
	}
} // end of setDonutOuterRadius setter

// getting donutGrandVolume to be used in Main - because its private we need to get it with a getter
public double getDonutGrandVolume () {
	return donutGrandVolume;
} // end of getDonutGrandVolume


// getting donutVolume to be used in Main - because its private we need to get it with a getter
//public double getDonutVolume () {
//	return donutVolume;
//} // end of getDonutVolume

public String toString() {
	return "Total volume of donut is: " + donutGrandVolume;
}


// method which calculates volume of donut using a formula, with user's inputs that are received in Main.java. Formula was taken from https://www.omnicalculator.com/math/torus-volume
public double  calcGrandVolumeOfDonut (double donutOuterRadius, double donutInnerRadius ) {
	donutGrandVolume = 2 * Math.pow(Math.PI, 2) * donutOuterRadius * Math.pow(donutInnerRadius , 2);
	return donutGrandVolume ;
} // end of calVolumeOfDonut method

// method which calculates the volume of the donut using users inputs (from Main). Formula was taken from https://www.omnicalculator.com/math/torus-volume
//public void calcVolumeOfDonut() {
//	donutVolume = 0.25 * Math.pow(Math.PI, 2) * Math.pow((donutOuterRadius - donutInnerRadius), 2) * (donutOuterRadius + donutInnerRadius);
//	return;
} // end of calcVolumeOfDonut method
 // end of Donut class
