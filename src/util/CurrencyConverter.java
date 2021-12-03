package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double converter(double pDollarPrice, double pDollar) {
		double total = (pDollar * pDollarPrice);
		total *= IOF;
		return total;
	}
}
