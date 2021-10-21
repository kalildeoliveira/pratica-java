package vetores;

import java.util.Scanner;

public class Questao04 {
	
	/**
	 * Faça um programa que leia 4 notas, mostre as notas e a média na tela.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[4];
		double soma=0;
		
		/**
		 * RECEBENDO AS NOTAS E SOMANDO
		 */		
		System.out.println("Digite 4 notas.");
		for (int i=0; i<notas.length; i++) {
			System.out.printf ("Nota %d: ", i+1);
			notas[i] = entrada.nextDouble();
			soma+=notas[i];			// "+=" é equivalente a "=soma+"
		}
		
		/**
		 * CÁLCULO DA MÉDIA
		 */
		double media = soma/notas.length;
		
		/**
		 * RELATÓRIO
		 */
		System.out.print("Notas digitadas: ");
		for (int i=0; i<notas.length; i++) {
			if (i<notas.length-2) {
				System.out.print(notas[i]+", ");
			} else if (i<notas.length-1) {
				System.out.print(notas[i]+" e ");
			} else {
				System.out.print(notas[i]);
			}
		}
		System.out.printf("\nMédia: %.1f\n", media);		
	}

}
