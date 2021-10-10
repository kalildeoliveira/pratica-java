import java.util.*;
import java.math.*;
public class pinturaCone {
	/**
	 * lê altura, raio e tipo de tinta e retorna a área, litros, latas e valor total com
	 * 
	 * 		a) valor da lata
	 * 			tipo 1) R$ 238,9
	 * 			tipo 2) R$ 467,98
	 * 			tipo 3) R$ 758,34
	 * 
	 * 		b) capacidade da lata
	 * 			volume: 18 litros
	 * 			rendimento: 3,45 litros/m² 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura=0, raio=0, area=0, geratriz=0, litros=0, latas=0, valor=0, valorTotal=0;
		String opcao="", tinta1="1", tinta2="2", tinta3="3";
		
		System.out.println("Informe a altura e o raio do cone.");
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		System.out.print("Raio: ");
		raio = entrada.nextDouble();
		System.out.println("Escolha o tipo de tinta.");
		System.out.println("\"1\" - Para tinta 1");
		System.out.println("\"2\" - Para tinta 2");
		System.out.println("\"3\" - Para tinta 3");
		System.out.print("Opção: ");
		opcao = entrada.next();
		
		// opção
		if (opcao.equals(tinta1)) { 
			valor=238.9;
		} else if (opcao.equals(tinta2)) {
			valor=467.98;
		} else if (opcao.equals(tinta3)) {
			valor=758.34;
		}
		
		// cálculo da área
		geratriz = (altura*altura)+(raio*raio);
		geratriz = Math.sqrt(geratriz);					// g² = h²+r²
		area = Math.PI*raio*(raio+geratriz);
		
		// cálculo da quantidade de latas e valor
		litros = area * 3.45;
		latas=litros/18;
		valorTotal = (int)latas*valor;
		
		// relatório
		System.out.println("\nA área é: "+Math.round(area));
		System.out.println("Litros de tinta: "+ Math.round(litros));
		System.out.println("Quantidade de latas: "+Math.ceil(latas));
		System.out.println("Total a pagar: R$ "+ valorTotal);
	}
}
