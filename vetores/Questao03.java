package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {
	/**
	 * Fa�a um Programa que leia um vetor de N n�meros inteiros 
	 * e apresente as seguintes informa��es: soma, m�dia, maior, menor, 
	 * pares, �mpares, n�meros acima da m�dia e n�meros abaixo da m�dia.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/**
		 * Ao inv�s de guardar um limite em uma vari�vel, decidimos trabalhar com 
		 * um ARRAYLIST dentro de um while com uma condi��o para sair. Assim, � poss�vel digitar infinitos n�meros. 
		 * Sobre ARRAYLIST = Curso b�sico de java - ArrayList(Vetor din�mico) - https://www.youtube.com/watch?v=AVSN6aVtCkg&t=247s
		 * Outro v�deo = Aula 6 - Corre��o exerc�cios de lista (Array ArrayList) - https://www.youtube.com/watch?v=tZ6q2YmvilA
		 */		
		ArrayList<Integer>numero = new ArrayList<>();
		boolean loop=true;
		while (loop){			 
			System.out.printf("Digite um n�mero ou \"0\" para sair: ");
			int digitou = entrada.nextInt();			// guardamos em "digitou" e passamos por par�metro
			if (digitou!=0) {							// condi��o para ficar no loop
				numero.add(Integer.valueOf(digitou));	// Integer para n�meros inteiros	
			} else loop=false;								
		}
		for (int i=0; i<numero.size();i++) {		// numero.size() determina o tamanho do vetor
			System.out.println(numero.get(i));
		}
		
		/**
		 * SOMANDO OS N�MEROS DIGITADOS
		 */
		int soma=0;
		for (int i=0; i<numero.size();i++) {
			soma=soma+numero.get(i);
		}
		
		/**
		 * M�DIA DOS N�MEROS DIGITADOS
		 */
		double media = soma/numero.size();
		
		/**
		 * MAIOR E MENOR N�MEROS DIGITADOS
		 */
		int maior=0, menor=0;
		for (int i=0; i<numero.size();i++) {			
			if (maior==0) {
				maior=numero.get(i);
			} else if (numero.get(i)>maior) {
				maior=numero.get(i);
			}
			if (menor==0) {
				menor=maior;
			} else if (numero.get(i)<menor) {
				menor=numero.get(i);
			}
		}
		
		/** 
		 * SEPARANDO PARES E IMPARES
		 */
		int[]pares = new int[numero.size()];
		int[]impares = new int[numero.size()];
		for (int i=0; i<numero.size();i++) {
			if (numero.get(i)%2==0) {
				pares[i] = numero.get(i);
			} else {
				impares[i] = numero.get(i);
			}
		}
		
		/**
		 * NUMEROS ABAIXO E ACIMA DA M�DIA
		 */
		int[]acimaDaMedia = new int[numero.size()];
		int[]abaixoDaMedia = new int[numero.size()];
		for (int i=0; i<numero.size();i++) {
			if (numero.get(i)<media) {
				abaixoDaMedia [i] = numero.get(i);
			} else {
				acimaDaMedia[i] = numero.get(i);
			}
		}
		
		/** 
		 * RELAT�RIO FINAL
		 */
		System.out.println("-------------------------");
		System.out.println("Soma dos n�meros digitados: "+soma);
		System.out.printf("M�dia dos n�meros digitados: %.2f",media);
		System.out.println("\nMaior n�mero digitado: "+maior);
		System.out.println("Menor n�mero digitado: "+menor);
		System.out.print("N�meros pares: ");
			for (int i=0; i<=pares.length-1; i++) {
				if (pares[i]!=0) {				// condi��o !=0 para eliminar os intervalos n�o preenchidos, pois o vetor ficou menor
					System.out.print(pares[i]+" ");
				}
			}
		System.out.print("\nN�meros �mpares: ");
			for (int i=0; i<=impares.length-1; i++)  {
				if (impares[i]!=0) {
					System.out.print(impares[i]+" ");
				}
			}	
		System.out.print("\nN�meros acima da m�dia: ");
			for (int i=0; i<=acimaDaMedia.length-1; i++) {
				if (acimaDaMedia[i]!=0) {
					System.out.print(acimaDaMedia[i]+" ");
				}
			}
		System.out.print("\nN�meros abaixo da m�dia: ");
			for (int i=0; i<=abaixoDaMedia.length-1; i++)  {
			if (abaixoDaMedia[i]!=0) {
				System.out.print(abaixoDaMedia[i]+" ");
			}
		}	

	}

}
