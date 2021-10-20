package atividade07;
import java.util.Scanner;
public class Cone {
	private double altura=0, raio=0;	
	
	/**
	 *  METODO CONSTRUTOR (QUANDO O MAIN ENVOCAR COM NEW)	  
	 */
	public Cone() { 		    			
	}
	
	/**
	 *  SOBRECARGA DO METODO CONSTRUTOR (PRECISA TER O MESMO NOME
	 *  	E NESTE CASO PASSA UM PARÂMETRO A MAIS) 
	 */

	public Cone(double altura, double raio) {						
		setAltura(altura);    
		setRaio(raio);		
	}
	
	/**
	 * MÉTODOS GET E SET (FAZ PARTE DO ENCAPSULAMENTO, OU SEJA,
	 * 		UMA FORMA INDIRETA DE ACESSAR OS ATRIBUTOS DA CLASSE
	 * 		QUE FORAM DECLARADOS COMO PRIVATE)
	 */
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	/**
	 * MÉTODO PARA CALCULAR A AREA A PARTIR DA ALTURA E RAIO
	 */
	
	public double calculaArea(double altura, double raio) {
		double geratriz = (altura*altura)+(raio*raio);
		geratriz = Math.sqrt(geratriz);					// g² = h²+r²
		double area = Math.PI*raio*(raio+geratriz);
		return area;
	}
	
	/**
	 * MÉTODO PARA COLETAR O TIPO DE TINTA
	 */
	
	public double menuOpcoes() {
		String opcao = "", tinta1="1", tinta2="2", tinta3="3";		
		double valor=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha o tipo de tinta.");
		System.out.println("\"1\" - Para tinta 1");
		System.out.println("\"2\" - Para tinta 2");
		System.out.println("\"3\" - Para tinta 3");
		System.out.print("Opção: ");
		opcao = entrada.next();
		if (opcao.equals(tinta1)) { 
			valor=238.9;
		} else if (opcao.equals(tinta2)) {
			valor=467.98;
		} else if (opcao.equals(tinta3)) {
			valor=758.34;
		}
		return valor;		
	}
	
	public double litros (double area ) {
		double litros=area*3.45;
		return litros;
	}
	
	public double latas (double litros) {
		double latas=litros/18;
		return latas;
	}
	
	public double valorTotal (double valorDaTinta, double latas) {
		double valorTotal=latas*valorDaTinta;			
		return valorTotal;
	}
	
	public void relatorio(double area, double litros, double latas, double valorTotal) {
		System.out.println("\nA área é: "+Math.round(area));
		System.out.println("Litros de tinta: "+ Math.round(litros));
		System.out.printf("Quantidade de latas: %.0f", Math.ceil(latas));
		System.out.printf("\nTotal a pagar: R$ %.2f", valorTotal);
	}
	
	
	@Override
	public String toString() {
		StringBuilder imprimir = new StringBuilder();
		imprimir.append("Informe a altura e o raio do cone.");		
		return imprimir.toString();
	}
}

