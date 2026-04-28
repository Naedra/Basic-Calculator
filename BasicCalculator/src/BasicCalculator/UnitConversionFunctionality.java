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
}
