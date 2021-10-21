package vetores;

import java.util.Scanner;

public class Questao04 {
	
	/**
	 * Fa�a um programa que leia 4 notas, mostre as notas e a m�dia na tela.
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
			soma+=notas[i];			// "+=" � equivalente a "=soma+"
		}
		
		/**
		 * C�LCULO DA M�DIA
		 */
		double media = soma/notas.length;
		
		/**
		 * RELAT�RIO
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
		System.out.printf("\nM�dia: %.1f\n", media);		
	}

}
