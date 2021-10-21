package vetores;

import java.util.Scanner;

public class Questao06 {
	/**
	 * Fa�a um programa que leia 20 n�meros inteiros e armazene-os num vetor. Armazene os 
	 * n�meros pares no vetor PAR e os n�meros IMPARES no vetor impar. Imprima os tr�s vetores.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[]numeros=new int[20];
		System.out.println("Digite 20 n�meros inteiros.");
		for (int i=0; i<numeros.length;i++) {
			System.out.printf("N�mero %d : ", i+1);
			numeros[i]=entrada.nextInt();
		}
		
		/**
		 * SEPARANDO OS PARES E IMPARES
		 */
		int[]pares=new int[numeros.length];
		int[]impares=new int[numeros.length];
		for (int i=0; i<numeros.length;i++) {
			if (numeros[i]%2==0) {
				pares[i]=numeros[i];
			} else {
				impares[i]=numeros[i];
			}
		}
		
		/**
		 * IMPRIMINDO OS TR�S VETORES
		 */
		System.out.print("\nN�meros digitados: ");
		for (int a:numeros) {
			System.out.printf("%d - ", a);
		}
		System.out.print("\nN�meros pares: ");
		for (int b:pares) {
			if (b!=0) {
				System.out.printf("%d - ", b);
			}
		}
		System.out.print("\nN�meros impares: ");
		for (int c:impares) {
			if (c!=0) {
				System.out.printf("%d - ", c);
			}
		}
	}

}
