package BasicCalculator;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		try (Scanner uinp = new Scanner(System.in)) {//Using try and catch to manage 
			
		
				
	    System.out.println("Welcome to Basic Calculator! ");
	    
	    System.out.println("Please select what type of calculation you want  to make today");
	    System.out.println("a. Arithmetic calculations");
	    System.out.println("b. Unit Conversion");
	    String s = uinp.next();
	    
	    if(s.equals("a")) {
	    	arithmetic.runArithmetic(uinp);
	    }
	    
	     //End of a
	   else if (s.equals("b")) {
		   unit.runUnitC(uinp);
	   }
	   }
		
 
	
	
	    catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}