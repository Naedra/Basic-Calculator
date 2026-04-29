package BasicCalculator;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String [] args) {
		int selection =0;
		Functionality convertNums = new Functionality();
		
		try (Scanner uinp = new Scanner(System.in)) {//Using try and catch to manage 
			
		
				
	    System.out.println("Welcome to Basic Calculator! ");
	    
	    System.out.println("Please select what type of calculation you want  to make today");
	    System.out.println("a. Arithmetic calculations");
	    System.out.println("b. Unit Conversion");
	    String s = uinp.next();
	    
	    if(s.equals("a")) {
		
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
		
		
		
			
		try{
			selection = uinp.nextInt();
			
		}
		 catch (Exception e) {
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
	 
	
	    
	} //End of a
	   else if (s.equals("b")) {
		   UnitConversionFunctionality unitConversion  = new UnitConversionFunctionality();
		   System.out.println("Please select the number of the unit you want to convert: ");
		   System.out.println("1. Temperature (F, C, K)");
		   System.out.println("2. Lenght (cm, km, m, etc.)");
		   System.out.println("3 .Weight (lb, kg )");
		   int unit = uinp.nextInt();
		   if(unit == 1) {
			   
			   System.out.println("Please select the conversion you want to make ");
			   System.out.println("a. Farenheit to Celcius (F to C) ");
			   System.out.println("b. Celcius to Farenheit (C to F) ");
			   System.out.println("c. Farenheit to Kelvin (F to K) ");
			   System.out.println("d. Celcius to Kelvin (C to K) ");
			   System.out.println("e. Kelvin to Celcius  (K to C) ");
			   System.out.println("f. Farenheit to Kelvin (F to K) ");
			   String temp = uinp.next();
			   
			   
			   if( temp.equals("a")) {
				   System.out.println("Please enter the Farenheit temperature : ");
				   double tF = uinp.nextInt();
				   double FtC = unitConversion.FarenheittoCelsius(tF);
				   
				   System.out.println(tF + " Farenheit to Celsius is: " + String.format("%.2f",FtC));
				  
				   
			   }
			   else if(temp.equals("b")) {
				   System.out.println("Please enter the Celsius temperature : ");
				   double tC = uinp.nextInt();
				   double CtF = unitConversion.CelsiustoFarenheit(tC);
				   
				   System.out.println(tC + " Celcius  to Farenheit is: " + String.format("%.2f",CtF));
			   }
			   
			   else if(temp.equals("c")) {
				   System.out.println("Please enter the Farenheit temperature : ");
				   double tFK = uinp.nextInt();
				   double FtK = unitConversion.FarenheittoKelvin(tFK);
				   
				   System.out.println(tFK + " Farenheit  to Kelvin is: " + String.format("%.2f",FtK));
			   }
			   
			   else if(temp.equals("d")) {
				   System.out.println("Please enter the Celsius temperature : ");
				   double tCK = uinp.nextInt();
				   double CtK = unitConversion.CelsiustoKelvin(tCK);
				   
				   System.out.println(tCK + " Celsius  to Kelvin is: " + String.format("%.2f",CtK));
			   }
			   else if(temp.equals("e")) {
				   System.out.println("Please enter the Kelvin temperature : ");
				   double tKC = uinp.nextInt();
				   double KtC = unitConversion.KelvintoCelSius(tKC);
				   
				   System.out.println(tKC + " Celsius  to Kelvin is: " + String.format("%.2f",KtC));
			   }
			   else if(temp.equals("f")) {
				   System.out.println("Please enter the Kelvin temperature : ");
				   double tKF = uinp.nextInt();
				   double KtF = unitConversion.KelvintoFarenheit(tKF);
				   
				   System.out.println(tKF + " Celsius  to Kelvin is: " + String.format("%.2f",KtF));
			   }			  
		   }//End of 1
		   
		   else if(unit ==2) {
			   System.out.println("Please enter the unit you have (cm, km, mm, m, in, ft, yd, mi)");
			   String origin = uinp.next();
			   origin = origin.toLowerCase();
			   
			   System.out.println("Please enter the unit you want (cm, km, mm, m, in, ft, yd, mi)");
			   String conversion = uinp.next();
			   conversion = conversion.toLowerCase();
			   
			   System.out.println("Please enter the numeric value you want to convert");
			   double value = uinp.nextInt();
			   
			   Double convert = unitConversion.ConvertLenght(origin, conversion, value);
			   
			   System.out.println(value +"" + origin + " is " + convert + ""+ conversion );
			   
			   
			   
		   }
	   } 
		}// End of if a
		
 
	
	
	    catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}