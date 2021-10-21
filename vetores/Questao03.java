package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {
	/**
	 * Faça um Programa que leia um vetor de N números inteiros 
	 * e apresente as seguintes informações: soma, média, maior, menor, 
	 * pares, ímpares, números acima da média e números abaixo da média.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/**
		 * Ao invés de guardar um limite em uma variável, decidimos trabalhar com 
		 * um ARRAYLIST dentro de um while com uma condição para sair. Assim, é possível digitar infinitos números. 
		 * Sobre ARRAYLIST = Curso básico de java - ArrayList(Vetor dinâmico) - https://www.youtube.com/watch?v=AVSN6aVtCkg&t=247s
		 * Outro vídeo = Aula 6 - Correção exercícios de lista (Array ArrayList) - https://www.youtube.com/watch?v=tZ6q2YmvilA
		 */		
		ArrayList<Integer>numero = new ArrayList<>();
		boolean loop=true;
		while (loop){			 
			System.out.printf("Digite um número ou \"0\" para sair: ");
			int digitou = entrada.nextInt();			// guardamos em "digitou" e passamos por parâmetro
			if (digitou!=0) {							// condição para ficar no loop
				numero.add(Integer.valueOf(digitou));	// Integer para números inteiros	
			} else loop=false;								
		}
		for (int i=0; i<numero.size();i++) {		// numero.size() determina o tamanho do vetor
			System.out.println(numero.get(i));
		}
		
		/**
		 * SOMANDO OS NÚMEROS DIGITADOS
		 */
		int soma=0;
		for (int i=0; i<numero.size();i++) {
			soma=soma+numero.get(i);
		}
		
		/**
		 * MÉDIA DOS NÚMEROS DIGITADOS
		 */
		double media = soma/numero.size();
		
		/**
		 * MAIOR E MENOR NÚMEROS DIGITADOS
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
		 * NUMEROS ABAIXO E ACIMA DA MÉDIA
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
		 * RELATÓRIO FINAL
		 */
		System.out.println("-------------------------");
		System.out.println("Soma dos números digitados: "+soma);
		System.out.printf("Média dos números digitados: %.2f",media);
		System.out.println("\nMaior número digitado: "+maior);
		System.out.println("Menor número digitado: "+menor);
		System.out.print("Números pares: ");
			for (int i=0; i<=pares.length-1; i++) {
				if (pares[i]!=0) {				// condição !=0 para eliminar os intervalos não preenchidos, pois o vetor ficou menor
					System.out.print(pares[i]+" ");
				}
			}
		System.out.print("\nNúmeros ímpares: ");
			for (int i=0; i<=impares.length-1; i++)  {
				if (impares[i]!=0) {
					System.out.print(impares[i]+" ");
				}
			}	
		System.out.print("\nNúmeros acima da média: ");
			for (int i=0; i<=acimaDaMedia.length-1; i++) {
				if (acimaDaMedia[i]!=0) {
					System.out.print(acimaDaMedia[i]+" ");
				}
			}
		System.out.print("\nNúmeros abaixo da média: ");
			for (int i=0; i<=abaixoDaMedia.length-1; i++)  {
			if (abaixoDaMedia[i]!=0) {
				System.out.print(abaixoDaMedia[i]+" ");
			}
		}	

	}

}
