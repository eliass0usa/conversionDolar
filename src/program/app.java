package program;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class app {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is the dolar price?");
	double dollarPrice= sc.nextDouble();
	
	System.out.println("How many dollars will be bought?");
	double amount = sc.nextDouble();
	
	double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
	sc.close();
		
	System.out.printf("Amount to be paid in reais = %.2f%n", result);
	}

}
