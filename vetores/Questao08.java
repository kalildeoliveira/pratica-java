package vetores;

import java.util.Scanner;

public class Questao08 {
	/**
	 * Fa�a um programa que leia um vetor de 5 n�meros inteiros, mostre a soma, a multiplica��o 
	 * e os n�meros.
	 */
	public static void main (String []args) {
		Scanner entrada = new Scanner(System.in);
		int[]numeros=new int[5];
		int soma=0; double multiplicacao=1;
		System.out.println("Digite 5 m�neros inteiros.");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("N�mero %d: ", i+1);
			soma+=numeros[i]=entrada.nextInt();			
		}
		for (int i=0; i<numeros.length; i++) {
			multiplicacao*=numeros[i];			
		}
		
		/**
		 * RELAT�RIO
		 */
		System.out.println("Soma: "+soma);
		System.out.printf("Multiplica��o: %.0f", multiplicacao);
		System.out.print("\nOs n�meros digitados foram: ");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(" | "+numeros[i]);			
		}
	}
}
