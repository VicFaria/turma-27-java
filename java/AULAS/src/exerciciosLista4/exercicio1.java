package exerciciosLista4;

import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int pontuacaoAtividade[]= new int [5];
		int maiorNumero=0;
		
		for(int i=0; i<=4; i++) {
			System.out.println("Digite o valor da pontuação: ");
			pontuacaoAtividade[i]=read.nextInt();
			
			if(maiorNumero<pontuacaoAtividade[i]) {
				maiorNumero=pontuacaoAtividade[i];
			}
	}
			System.out.println("O maior numero digitado é: " +maiorNumero);
}
}