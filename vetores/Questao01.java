package vetores;

import java.util.Scanner;

public class Questao01 {
	/**
	 * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. 
	 */
	public static void main (String []args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARANDO O VETOR
		int [] vetor = new int[6];

		// RECEBENDO OS NÚMEROS
		for (int i=1; i<=vetor.length-1;i++) {
			System.out.print("Número "+i+" : ");		
			vetor[i] = entrada.nextInt();
		}
		
		// MOSTRANDO OS NÚMEROS
		System.out.println("Os números digitados foram:");
		for (int i=1; i<=vetor.length-1; i++) {
			System.out.printf("Número"+i+" : "+vetor[i]+"\n");
		}
	}

}
