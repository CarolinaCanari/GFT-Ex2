package GFT_Ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 1;
		
	System.out.println("Insira um numero" + i);
	int numero = sc.nextInt();
	int maior = numero;
	int menor = numero;

	for (i = 2; i <= 10; i++) {
		System.out.print("Numero " + i + ": " );
		numero = sc .nextInt();
		if (numero > maior) {
			maior = numero;
		}
		
		else if (numero < menor) {
			menor = numero;
			
		}
	}
			
			System.out.println("Maior numero é: " + maior);
			System.out.println("Maior numero é: " + menor);

	
	}

}
