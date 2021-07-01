package exerciciosLista1;

import java.util.Scanner;

public class exercicio8 {
 public static void main (String[] args){	
	 Scanner read=new Scanner(System.in);
	 
	 double custoFabrica;
	 double porcentagemDistribuidor;
	 double porcentagemImpostos;
	 double valorVendaCarro;
	 
	 System.out.println("Informe qual o valor do carro: ");
		custoFabrica=read.nextDouble();
		
		porcentagemDistribuidor= custoFabrica * 0.25;
		porcentagemImpostos= custoFabrica * 0.45;
		valorVendaCarro = custoFabrica + porcentagemDistribuidor+porcentagemImpostos;
		
		System.out.printf("O valor final de venda do carro é: %.2f. \nA porcentagem de impostos é %.2f. \nA porcentagem da distribuidora é %.2f.", valorVendaCarro , porcentagemImpostos , porcentagemDistribuidor);
		
	}
}
