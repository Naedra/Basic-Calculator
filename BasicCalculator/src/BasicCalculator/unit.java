package BasicCalculator;

import java.util.Scanner;

public class unit {
	
	public static void runUnitC(Scanner uinp) {
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
		// End of if a
	}


