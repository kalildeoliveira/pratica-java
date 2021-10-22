package vetores;

import java.util.Date;
import java.util.Scanner;

public class Questao11 {
	/**
	 * Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data e coloque
	 * cada item em uma posição de um vetor de inteiros de tamanho 3.  
	 * @throws ParseException 
	 */
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Date data = new Date();
    	String guardaData = new String();
    	
    	/** 
    	 * ENTRADA DA DATA NO FORMATO TEXTO
    	 */
    	
    	System.out.println("Informe uma data no formato dia/mes/ano.");
    	System.out.print("Data: ");
    	guardaData = entrada.next();
    	
    	/** 
    	 * VALIDAÇÃO DA DATA
    	 */
    	
    	
    	/**
    	 * EXIBE A DATA COM CADA ITEM EM UMA POSICAO DO VETOR
    	 */
    	char[] vetorData = new char[11];
    	vetorData = guardaData.toCharArray();
    	
    	for (int i=0; i<vetorData.length; i++) {
			System.out.println(vetorData[i]);
		}
		
	}

}
