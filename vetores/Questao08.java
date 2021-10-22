package vetores;

import java.util.Scanner;

public class Questao08 {
	/**
	 * Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação 
	 * e os números.
	 */
	public static void main (String []args) {
		Scanner entrada = new Scanner(System.in);
		int[]numeros=new int[5];
		int soma=0; double multiplicacao=1;
		System.out.println("Digite 5 múneros inteiros.");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Número %d: ", i+1);
			soma+=numeros[i]=entrada.nextInt();			
		}
		for (int i=0; i<numeros.length; i++) {
			multiplicacao*=numeros[i];			
		}
		
		/**
		 * RELATÓRIO
		 */
		System.out.println("Soma: "+soma);
		System.out.printf("Multiplicação: %.0f", multiplicacao);
		System.out.print("\nOs números digitados foram: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(" | "+numeros[i]);			
		}
	}
}
