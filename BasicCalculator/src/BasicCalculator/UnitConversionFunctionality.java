package BasicCalculator;

public class UnitConversionFunctionality {
	public double FarenheittoCelsius(double F) {
		return ((F-32))/1.8;
	}
	
	public double CelsiustoFarenheit(double C) {
		return (1.8* C) +32;
	}
	public double FarenheittoKelvin(double F) {
		return (((F-32))/1.8) + 273.15;
	}
	
	public double CelsiustoKelvin(double C) {
		return C + 273.15;
	}
	
	public double KelvintoCelSius(double K) {
		return K - 273.15;
		
	}
	
	public double KelvintoFarenheit(double K) {
		return 1.8*(K-273.15) +32;
	}
	
	public double ConvertLenght(String origin, String  conversion, double value) {
		switch(origin) {
			case "km":
				switch(conversion) {
				 case "ft":
					 return value *3281;
				 case "yd":
					 return value * 1094;
				 case "m":
					 return value  * 1000;
				 case "cm":
					 return value * 100000;
				
				 case "mm":
					 return value * 1000000;
				
				 case "mi":
					 return value/1.609;
					 
				 case "in":
					 return value * 39370;
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
				}
		  case "cm":
			  switch(conversion) {
			     case "ft":
					 return value/30.48;
				 case "yd":
					 return value/91.44;
				 case "m":
					 return value/ 100;
				 case "km":
					 return value/100000;
				
				 case "mm":
					 return value * 10;
				
				 case "mi":
					 return value/160900;
					 
				 case "in":
					 return value/2.54;	 
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
					 
				}	
		  case "ft":
			  switch(conversion) {
			     case "cm":
					 return value*30.48;
				 case "yd":
					 return value/3;
				 case "m":
					 return value/ 3.281;
				 case "km":
					 return value/3281;
				
				 case "mm":
					 return value * 304.8;
				
				 case "mi":
					 return value/5280;
					 
				 case "in":
					 return value*12;	
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
					 
				}	
		  case "m":
			  switch(conversion) {
			     case "cm":
					 return value*100;
				 case "yd":
					 return value / 0.9144;
				 case "ft":
					 return value/ 3.281;
				 case "km":
					 return value/3281;
				
				 case "mm":
					 return value * 1000;
				
				 case "mi":
					 return value/1609;
					 
				 case "in":
					 return value*39.37;	
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
					 
				}	
		  case "yd":
			  switch(conversion) {
			     case "cm":
					 return value*91.44;
				 case "m":
					 return value *0.9144;
				 case "ft":
					 return value*3;
				 case "km":
					 return value/1094;
				
				 case "mm":
					 return value * 914.4;
				
				 case "mi":
					 return value/1760;
					 
				 case "in":
					 return value*36;	
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
					 
				}
		  case "in":
			  switch(conversion) {
			     case "cm":
					 return value*91.44;
				 case "m":
					 return value/39.37;
				 case "ft":
					 return value/12;
				 case "km":
					 return value/39370;
				
				 case "mm":
					 return value * 25.4;
				
				 case "mi":
					 return value/63360;
					 
				 case "yd":
					 return value/36;	 
					 
				 default:
					    throw new IllegalArgumentException("Invalid conversion");
					 
				}
		  default:
			    throw new IllegalArgumentException("Invalid conversion");
		}
	
	 
	}
}
