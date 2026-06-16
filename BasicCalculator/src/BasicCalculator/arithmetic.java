package BasicCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class arithmetic {
	public static void runArithmetic (Scanner uinp) {
		Functionality convertNums = new Functionality();
		int selection =0;
	try {
	
	 System.out.println("Please select the option you want to calculate(Please only write the number)");
	 System.out.println("Select one of the following \n"
			+ "1. Multiplication \n"
			+ "2. Sum \n"
			+ "3. Substraction \n"
			+ "4. Division \n"
			+ "5. Square Root \n"
			+ "6. Power \n"
			+ "7. Dot Product \n" +
			"8. Factorial");
	//uinp.next();
	
    	}
    	
    	catch(NumberFormatException ex) {
    		System.out.println("Please enter a valid number");
    		
    	}
	
		
	try{
		selection = uinp.nextInt();
		
	}
	 catch (NumberFormatException ex) {
		System.out.println("Please enter a valid number");
		return;
		
	}
	
	uinp.nextLine();
	BasicCalculatorFunctionality test = new BasicCalculatorFunctionality();
	
	//Using the convertInput function to return a ArrayList from the user input
	//This method is used by various mathematics operations
	
	if(selection == 1) {
		
		ArrayList<Integer> nums =convertNums.ConvertInput(uinp);
		
		int mult = test.multiplication(nums);
		System.out.println("The multiplication of: "+ nums.toString()+ "is: "+ mult);
	
	}
	// End of selection 1
	if(selection== 2) {
		ArrayList<Integer> nums =convertNums.ConvertInput(uinp);
		
		int sum = test.sum(nums);
		System.out.println("The sum of: "+ nums.toString()+ "is: "+ sum);

		
		
		
	}//End of selection two
	
	if(selection == 3) {
		
		ArrayList<Integer> nums =convertNums.ConvertInput(uinp);
		int sub = test.sub(nums);
		System.out.println("The substraction of: "+ nums.toString()+ "is: "+ sub);

	}//End of selection 3
	
	if(selection == 4) {
		int numerator =0;
		int denominator =1;
	 try {
		System.out.println("Please enter the numerator: " );
		numerator = uinp.nextInt();
		System.out.println("Please enter the denominator: " );
		denominator = uinp.nextInt();
		}
	catch(Exception e) {
		System.out.println("Please enter valid numbers only ");
		uinp.nextLine();
	}
		double div = test.div(numerator, denominator);
		System.out.println("The division of: "+ numerator +" div " + denominator+ " is: "+ div);
		
	}//End of selection 4
	
	if(selection ==5) {
		System.out.println("Please enter the number: " );
		int num = uinp.nextInt();
		double sqrtroot = test.squareRoot(num);
		
		System.out.println("The square root of: "+ num + " is: " + sqrtroot);
	}
	//End of 5
	
 if(selection == 6) {
	 System.out.println("Please enter the number: ");
	 int num = uinp.nextInt();
	 
	 System.out.println("Please enter the power you want to calculate: ");
	 int power = uinp.nextInt();
	 
	 int pow = test.power(num, power);
	 
	 System.out.println("The power of: "+ num + " elevated: " + power + " is: " + pow );
 }
 //End of 6
 
 if(selection == 7) {
	 System.out.println("To calculate the dot product:" );
	 System.out.println("1. Select number 1, If you have the angle");
	 System.out.println("2. Select number 2, If you only have the magnitude" );
	 
	 
	 int select = 0;
	 
	 //Manage exceptions in case of incorrect input
	 while(select != 1 && select != 2) {
	 
	 try {
		 select = uinp.nextInt();
	 }
	 catch(Exception e){
		 System.out.println("Invalid input. Please select a valid option 1 or 2");
		 uinp.nextLine();
		 
	 }
	 
	 if(select == 1) {
		 System.out.println("Please enter component i of vector a : ");
		 int ai = uinp.nextInt();
		 
		 System.out.println("Please enter component y of vector a : ");
		 int ay = uinp.nextInt();
		 
		 System.out.println("Please enter component i of  vector b : ");
		 int bi = uinp.nextInt();
		 
		 System.out.println("Please enter component y of vector b : ");
		 int by = uinp.nextInt();
		 
		 double dotcomp = test.doTproductSum(ai, ay, bi, by);
		 System.out.println("The dot product is: " + dotcomp);
		 
	 }
	 else if (select ==2){
		 System.out.println("Please enter the value of the angle : ");
		 int angle = uinp.nextInt();
		 System.out.println("Please enter component i of vector a : ");
		 int ai = uinp.nextInt();
		 
		 System.out.println("Please enter component y of vector a : ");
		 int ay = uinp.nextInt();
		 
		 System.out.println("Please enter component i of  vector b : ");
		 int bi = uinp.nextInt();
		 
		 System.out.println("Please enter component y of vector b : ");
		 int by = uinp.nextInt();
		 
		 double dotAngle = test.dotProductAngle(angle, ai, ay, bi, by);
		 
		 System.out.println("The dot product is: " + dotAngle);
		 
	 }
	 else {
	 System.out.println("That is not an option. Please select a valid number from the list.");
	 }
	 }
 }
 //End of 7
 if (selection == 8) {
	 System.out.println("Please enter the number: " );
	 int num = uinp.nextInt();
	 
	 int result = test.factorial(num);
	 
	 System.out.println("The factorial for: " + num + " is: "+ result );
	 
 }
 

    
}
}
