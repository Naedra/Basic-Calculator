package BasicCalculator;

import java.util.ArrayList;

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
	
}
