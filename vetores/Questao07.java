package vetores;

import java.util.Scanner;

public class Questao07 {
	/**
	 * Fa�a um programa que pe�a as quatro notas de 10 alunos, calcule e armazene num vetor a 
	 * m�dia de cada aluno, imprima o n�mero de alunos com m�dia maior ou igual a 7.0
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[][]aluno = new double[5][11];
		double[]media = new double[11];
		double auxiliar=0; int k=0;
		for (int i=0; i<10;i++) {
			for (int j=0; j<4; j++) {
				System.out.printf("Nota %d do aluno %d : ", j+1, i+1);
				auxiliar+=aluno[j][i]=entrada.nextDouble();
				if (j==3) {
					k++;
					media[k]=auxiliar/4;
					auxiliar=0;					
				}
			}
		}
		
		/**
		 * CONTAR O N�MERO DE ALUNOS ACIMA DA M�DIA
		 */
		int contador=0;
		for (int i=0; i<10;i++) {
			if (media[i]>7) {
				contador++;
			}
		}
		
		/** 
		 * RELATORIO
		 */
		System.out.println("O n�mero de alunos acima da m�dia � "+contador);
		System.out.print("As m�dias registradas foram: ");
		for (double a:media) {
			System.out.print("- "+a);
		}
	}

}
