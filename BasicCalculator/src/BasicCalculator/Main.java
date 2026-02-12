package BasicCalculator;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String [] args) {
		int selection =0;
		Functionality convertNums = new Functionality();
		
		try (Scanner uinp = new Scanner(System.in)) {//Using try and catch to manage 
				
	    System.out.println("Welcome to Basic Calculator! ");
		
		 System.out.println("Please select the option you want to calculate(Please only write the number)");
		 System.out.println("Select one of the following \n"
				+ "1. Multiplication \n"
				+ "2. Sum \n"
				+ "3. Substraction \n"
				+ "4. Division \n"
				+ "5. Square Root \n"
				+ "6. Power \n"
				+ "7. Dot Product \n" +
				"8. Set \n" + "9. Intersection \n" + "10. Union \n" +"11. Factorial");
		//uinp.next();
		
		
		
			
		try{
			selection = uinp.nextInt();
			
		}
		 catch (Exception e) {
			System.out.println("Please enter a valid number");
			return;
			
		}
		
		uinp.nextLine();
		BasicCalculatorFunctionality test = new BasicCalculatorFunctionality();
		
		//Using the convertInput function to return a Arraylist from the user input
		//This method is used by varoius mathematic operations
		
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
			System.out.println("With a remainder of: " + numerator % denominator);
		}//End of selection 4
		
		
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}