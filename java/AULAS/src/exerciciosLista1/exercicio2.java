package exerciciosLista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		
		int ano;
		int mes;
		int dia;
		int diasVida;
				
		System.out.println("Informe quantos dias de vida voc� tem: ");
		dia=read.nextInt();
		
		ano=dia/365;
		mes=(dia%365) / 30;
		diasVida=(dia%365) % 30;
		
		System.out.println("Voc� tem: " + ano + " anos de vida");
		System.out.println("Voc� tem: " + mes + " meses de vida");
		System.out.println("Voc� tem: " + diasVida + " dias de vida");
		
	}
	
	
}
