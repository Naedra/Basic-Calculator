package BasicCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Functionality {
	
	// This function reads the user input and stores the input separated by commas, into an arraylist 
 public ArrayList<Integer> ConvertInput(Scanner userinput){
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    System.out.println("Please enter the numbers you want to multiply separated by a comma (You can write up to 10 numbers)");
		String num = userinput.nextLine();
		
		String[] separatedNums = num.split(",");
		
		if(separatedNums.length > 10) {
			System.out.println("Please only write up to ten numbers");
			
		}

		
		for(int i =0; i < separatedNums.length; i++) {
			int val = Integer.parseInt(separatedNums[i].trim());
			numbers.add(val);
			
		}
	
	return numbers;
	 
 }
}
