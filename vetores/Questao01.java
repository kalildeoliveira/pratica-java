package vetores;

import java.util.Scanner;

public class Questao01 {
	/**
	 * Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os. 
	 */
	public static void main (String []args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARANDO O VETOR
		int [] vetor = new int[6];

		// RECEBENDO OS N�MEROS
		for (int i=1; i<=vetor.length-1;i++) {
			System.out.print("N�mero "+i+" : ");		
			vetor[i] = entrada.nextInt();
		}
		
		// MOSTRANDO OS N�MEROS
		System.out.println("Os n�meros digitados foram:");
		for (int i=1; i<=vetor.length-1; i++) {
			System.out.printf("N�mero"+i+" : "+vetor[i]+"\n");
		}
	}

}
