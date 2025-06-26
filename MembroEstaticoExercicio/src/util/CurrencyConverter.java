package util;

public class CurrencyConverter {
	
	public static double tax = 0.06;
	
	public static double converter (double dollarPrice, double amount) {
		double total = dollarPrice * amount;
		total += total * tax;
		return total;
	}
	
}
