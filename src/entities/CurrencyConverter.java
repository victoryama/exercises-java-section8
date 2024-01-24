package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double amount, double priceReais) {
		return amount*(1+IOF)*priceReais;
	}
	
}
