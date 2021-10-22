package vetores;

import java.util.Scanner;

public class Questao13 {
	/**
	 * Faça um Programa que peça a idade e altura de 5 pessoas, armazene cada informação no
	 * seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
	 * também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
	 * altura de quem está abaixo e acima da média de idade e altura.  
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int[] idade = new int[5];
		double [] altura = new double[5];
		
		/**
		 * PEGAR OS DADOS E GUARDAR NOS VETORES
		 */
		System.out.println("Digite idade e altura de 5 pessoas.");
		for (int i=0; i<=4; i++) {
			System.out.print("Idade: ");
			idade[i]=entrada.nextInt();
			System.out.print("Altura: ");
			altura[i]=entrada.nextDouble();
		}
		
		/**
		 * IMPRIMIR IDADE E ALTURA NA ORDEM INVERSA
		 */
		for (int i=4; i>=0; i--) {			
			System.out.print("\nIdade: "+idade[i]+" | ");			
			System.out.print("Altura: "+altura[i]+" ");			
		}
		
		/**
		 * SEPARAR MAIS VELHO, MAIS NOVO, MAIS BAIXO E MAIS ALTO
		 */
		int maisVelho=0, maisNovo=0; double maisAlto=0, maisBaixo=0;
		int idadeMaisAlto=0, idadeMaisBaixo=0;
		for (int i=0; i<=4; i++) {
			if (maisVelho==0) {
				maisVelho=idade[i];
			} else if (idade[i]>maisVelho){
				maisVelho = idade[i];
			}
			if (maisNovo==0) {
				maisNovo=maisVelho;
			} else if (idade[i]<maisNovo) {
				maisNovo=idade[i];
			}
			if (maisAlto==0) {
				maisAlto=altura[i];
				idadeMaisAlto = idade[i];
			} else if (altura[i]>maisAlto){
				maisAlto=altura[i];
				idadeMaisAlto = idade[i];
			}
			if (maisBaixo==0) {
				maisBaixo=maisAlto;
				idadeMaisBaixo = idade[i];
			} else if (altura[i]<maisBaixo) {
				maisBaixo=altura[i];
				idadeMaisBaixo = idade[i];
			}
		}
		System.out.print("\nA idade do meis velho é "+ maisVelho);
		System.out.print("\nA idade do mais novo é "+maisNovo);
		System.out.print("\nA idade do mais alto é "+idadeMaisAlto);
		System.out.print("\nA idade do mais baixo é "+idadeMaisBaixo);
		
		/**
		 * CALCULAR A MÉDIA E DEFINIR QUEM ESTÁ ACIMA E ABAIXO DELA
		 */
		double mediaIdade=0, mediaAltura=0;
		for (int i=0; i<=4; i++) {
			mediaIdade+=idade[i]/idade.length;
			mediaAltura+=altura[i]/altura.length;			
		}
		
		/**
		 * ALTURA DE QUEM ESTÁ ABAIXO E ACIMA DA MÉDIA DE IDADE E ALTURA
		 */
		System.out.print("\nA altura de quem está acima da média de Idade e Altura é: ");
		for (int i=0; i<=4; i++) {
			if (idade[i]>mediaIdade && altura[i]>mediaAltura) {
				System.out.print(" | "+altura[i]);
			} 		
		}
		
		System.out.print("\nA altura de quem está abaixo da média de Idade e Altura é: ");
		for (int i=0; i<=4; i++) {
			if (idade[i]<mediaIdade && altura[i]<mediaAltura) {
				System.out.print(" | "+altura[i]);
			} 		
		}

	}
}
