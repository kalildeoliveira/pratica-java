package vetores;

import java.util.Scanner;

public class Questao05 {
	/**
	 * Faça um programa que leia um vetor de 10 caracteres e diga quantas consoantes foram lidas.
	 * Imprima as consoantes. 
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char[] consoantes={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'}; 
		char[] vetor = new char[10];
		System.out.println("Digite 10 caracteres.");
		for (int i=0; i<vetor.length; i++) {
			System.out.printf("Caracter %d : ", i+1);
			vetor[i] = entrada.nextLine().charAt(0);		// https://www.youtube.com/watch?v=-Hmzi-mhThc aos 24min01seg
		}
		/**
		 * COMPARAR O ARRAY DIGITADO COM AS VOGAIS. 
		 * Usaremos um for dentro do outro para varrer os dois arrays 
		 * e guardar as consoantes em um terceiro.
		 */
		char[]pegaConsoante=new char[vetor.length];
		int contador=0;
		for (int i=0; i<vetor.length; i++) {
			for (int j=0; j<consoantes.length; j++) {
				if (vetor[i]==consoantes[j]) {
					pegaConsoante[i]=vetor[i];
					contador++;
				}
			}
		}
		
		
		/**
		 * RELATÓRIO
		*/		
		System.out.print("As consoantes digitadas foram: ");
		for (char n:pegaConsoante) {				// https://www.youtube.com/watch?v=d5Kl1hAs_A8 aos 3min38			
			System.out.printf("%c -", n);			
		}
		System.out.println("\nTotal de consoantes digitadas: "+contador);
	}

}
