package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Dollar price: ");
		double priceReais = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double finalPrice = CurrencyConverter.converter(amount, priceReais);
		System.out.printf("Amount to be paid R$ %.2f", finalPrice);
		sc.close();

	}

}
