package vetores;
import java.util.Scanner;
public class Questao12 {
	/**
	 * Fa�a um programa que tenha como entrada v�rias palavras separadas por; 
	 * (rodrigo;curvello;antonio;...) separe as palavras e coloque cada uma em uma posi��o do
	 * vetor  
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String [] palavras = new String[5];
		String pegaPalavras = new String();
		
		/**
		 * ENTRADA DAS PALAVRAS
		 */
		System.out.println("Digite palavras separadas por \";\".");
		System.out.print("Palavra: ");
		pegaPalavras=entrada.next();
		
		/**
		 * SEPERAR AS PALAVRAS
		 */
		palavras = pegaPalavras.split(";"); //  https://www.guj.com.br/t/colocar-uma-frase-em-um-array/44903/2
		
		
		/**
		 * IMPRIMIR PALAVRAS SEPARADAS
		 */
		
		for (int i=0; i<palavras.length; i++) {
			System.out.print(" | "+ palavras[i]);			
		}
		
		
	}
}
