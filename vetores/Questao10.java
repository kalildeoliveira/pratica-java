package vetores;

import java.util.Scanner;

public class Questao10 {
	/**
	 * Fa�a um programa que pe�a um texto e coloque-o em um vetor onde cada caracter ocupar�
	 * uma posi��o do vetor. 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String auxiliar=new String();
		char[]guardaTexto=new char[100];
		
		System.out.println("Digite um pequeno texto para ser guardado no vetor.");
		System.out.print("Texto: ");
		auxiliar=entrada.next();
		
		/**
		 * TRANSFORMAR STRING EM CHAR
		 */
		guardaTexto = auxiliar.toCharArray();	// https://www.delftstack.com/pt/howto/java/how-to-convert-a-string-to-char-in-java/
				
		for (int i=0; i<guardaTexto.length; i++) {
			System.out.println(guardaTexto[i]);
		}

	}

}
