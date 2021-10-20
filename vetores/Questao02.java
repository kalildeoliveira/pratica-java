package vetores;

import java.util.Scanner;

public class Questao02 {
	
	/**
	 * Faça um Programa que leia um vetor de 10 números reais 
	 * e mostre-os na ordem inversa a ordem lida.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARANDO O VETOR
		int [] vetor = new int[11];

		// RECEBENDO OS NÚMEROS
		for (int i=1; i<=vetor.length-1;i++) {
			System.out.print("Número "+i+" : ");		
			vetor[i] = entrada.nextInt();
		}
		
		// MOSTRANDO OS NÚMEROS
		System.out.println("\nOs números digitados foram:");
		for (int i=10; i>0; i--) {
			System.out.printf("Número"+i+" : "+vetor[i]+"\n");
		}

	}

}
