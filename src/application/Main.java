package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {
	/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por 
	uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda 
	que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
	para ser respons�vel pelos c�lculos.*/

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		
		double dollarPrice = input.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		
		double dollarAmount = input.nextDouble();
		
		Locale.setDefault(Locale.US);
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollarPrice, dollarAmount));
		
		input.close();

	}

}
