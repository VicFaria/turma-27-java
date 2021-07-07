package exerciciosLista4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner read= new Scanner (System.in);
		
		int lancamentoDado[]=new int [10], somaDados=0, maiorNumero=0, ocorrencia=0;
		double mediaLancamentos=0.00;
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite o valor"+ (i+1) + "dado: ");
			lancamentoDado[i]=read.nextInt();
			somaDados=somaDados + lancamentoDado[i];
			mediaLancamentos=somaDados / 10.0;
			
			if (lancamentoDado[i] > maiorNumero){
		
				maiorNumero = lancamentoDado[i];
				
			} 
					
		}
		for (int i =0; i<10;i++) {
			if(lancamentoDado[i] == lancamentoDado[i]) {
			ocorrencia=lancamentoDado[i];
			
		}
	
		}
		
		System.out.println("\n");
		System.out.println("Informações sobre o lançamento dos dados: \n");
		System.out.println("A soma total é:" + somaDados + "\n");
		System.out.println("A média é:" + mediaLancamentos + "\n");
		System.out.println("o numero:" + ocorrencia + "apareceu mais vezes, com um total de:");
}
	
	
}