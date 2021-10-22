package vetores;

import java.util.Scanner;

public class Questao09 {
	/**
	 * Dado um vetor contendo todas as letras do nosso alfabeto(minúsculas), gere
	 * uma senha para o usuário. Para isto o usuário deve informar o tamanho da
	 * senha que deseja e este tamanho deve ser menor que a quantidade de letras no
	 * vetor. A senha gerada deve seguir o padrão consoante+vogal para tamanhos
	 * pares e consoante+vogal e terminada em consoante para tamanhos ímpares
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char[]alfabeto= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String senha=""; int quantidade=0, auxiliar=0; boolean loop = true;
		while (loop) {
			System.out.println("Informe quantos dígitos pretende gerar a senha. Ex.: 10");
			System.out.print("Quantidade: ");
			quantidade=entrada.nextInt();
			if (quantidade < 26) {
				loop = false;
			} else {
				System.out.println("A senha não pode ter mais de 26 caracteres");
			}
		}
		
		for (int i=0; i<quantidade; i++) {
			auxiliar = (int) (Math.random()*alfabeto.length);	// https://www.guj.com.br/t/gerador-de-senha-alfanumerico/40241
			senha+=alfabeto[auxiliar];
		}
		
		System.out.println("Senha : "+senha);
	}

}
