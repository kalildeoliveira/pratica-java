package atividade07;
import java.util.*;
public class Atividade07 {	
	public static void main (String[] args) {
		
		/**
		 * EVOCANDO O M�TODO CONSTRUTOR
		 */
		Scanner entrada = new Scanner(System.in);
		Cone cone = new Cone();
		double altura=0, raio=0;
		System.out.println(cone);		// ToString
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		System.out.print("Raio: ");
		raio = entrada.nextDouble();
			
		// CALCULANDO A �REA
		double area = cone.calculaArea(altura, raio);		
		
		// MENU DE OP��ES DE TINTAS COM VALORES
		double valorDaTinta = cone.menuOpcoes();
		
		// LITROS, LATAS E VALOR TOTAL
		double litros = cone.litros(area);
		double latas = cone.latas(litros);
		double valorTotal = cone.valorTotal(valorDaTinta, latas);

		//RELAT�RIO FINAL
		cone.relatorio(area, litros, latas, valorTotal);
	}
}
