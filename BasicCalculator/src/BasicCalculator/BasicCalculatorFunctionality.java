package BasicCalculator;

import java.util.ArrayList;
import java.util.Set;

public class BasicCalculatorFunctionality {
	
	public int multiplication(ArrayList<Integer> numbers) {
		int mult = 1;
		
		for(int i =0; i < numbers.size(); i++) {
			
			mult *=numbers.get(i);
		}
		
		
		
		return mult;
		
	}
	
	public int sum(ArrayList<Integer> numbers) {
		int sum =0;
		
		for (int i =0; i < numbers.size(); i++) {
			sum+= numbers.get(i);
		}
		
		return sum;
	}
	
	
	public int sub (ArrayList<Integer> numbers) {
		int sub=numbers.get(0);
		for (int i =1; i < numbers.size(); i++) {
			sub-= numbers.get(i);
		}
		
		return sub;
		
	}
	public double div ( int numerator, int denominator) {
	  double division =0; 
	  
	  division = (double)numerator/denominator;
	  
	  return division;
	}
	//Calculation for square Root
	public double squareRoot(int number) {
		
		return  Math.sqrt(number);
	}
	// Power option 6
	public int power( int num,  int power) {
		int calc =1;
		for(int i =0; i < power; i++) {
			calc *= num;
		}
		return calc;
	}
 //Dot product option 7. This option divides into two sub-options to calculate the dot product
	// OPTION 1: Calculate the dot product using the angle
	//OPTION 2: Calculate the dot product by Sum
	//**NOTE: For now the dot product will only accept a vector with two components
	public double doTproductSum(int ai,int  ay, int bi, int by) {
		int dotPod = ai*bi + ay*by;
		return dotPod;
	}
	
	//OPTION 1 for option 7, Calculate the Dot product using the angle
	
	public double dotProductAngle(double angle, int ai, int ay, int bi, int by) {
		double AMagnitude = Math.sqrt(ai*ai+ ay*ay);
		double BMagnitude = Math.sqrt(bi*bi + by*by);
		
		double dot = AMagnitude * BMagnitude * Math.cos(Math.toRadians(angle));
		return dot;
	}
	
//Option 8 Factorial using recursion
	public int factorial(int n) {
		if (n ==1 || n ==0) {
			return 1;
		}
		return factorial(n-1) * n;
	}
	
		
	}
	

