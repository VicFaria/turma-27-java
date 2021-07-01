package exerciciosLista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
				
	int ano;
	int mes;
	int dia;
	int anoAtual=2021;
	int mesAtual=7;
	int diaAtual=1;
	int somaDias;
	
	
	System.out.println("Digite o dia do seu nascimento: ");
	dia=read.nextInt();
	System.out.println("Digite o mês do seu nascimento: ");
	mes=read.nextInt();
	System.out.println("Digite o ano do seu nascimento: ");
	ano=read.nextInt();
			
	somaDias= ((diaAtual-dia) + ((mesAtual-mes) *30)  + ((anoAtual-ano)*365));
	System.out.println("Sua idade em dias é: "+somaDias);
	
	}

}
