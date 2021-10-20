package vetores;

import java.util.Scanner;

public class Questao02 {
	
	/**
	 * Fa�a um Programa que leia um vetor de 10 n�meros reais 
	 * e mostre-os na ordem inversa a ordem lida.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARANDO O VETOR
		int [] vetor = new int[11];

		// RECEBENDO OS N�MEROS
		for (int i=1; i<=vetor.length-1;i++) {
			System.out.print("N�mero "+i+" : ");		
			vetor[i] = entrada.nextInt();
		}
		
		// MOSTRANDO OS N�MEROS
		System.out.println("\nOs n�meros digitados foram:");
		for (int i=10; i>0; i--) {
			System.out.printf("N�mero"+i+" : "+vetor[i]+"\n");
		}

	}

}
