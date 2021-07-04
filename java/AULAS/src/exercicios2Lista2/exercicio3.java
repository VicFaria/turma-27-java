package exercicios2Lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade=read.nextInt();
		
		if (idade >=10 && idade <= 14) {
			System.out.println("CATEGORIA INFANTIL");
		}
		else if (idade >= 15 && idade <=17) {
			System.out.println("CATEGORIA JUVENIL");
		}
		else if (idade >= 18 && idade <=25){
			System.out.println("CATEGORIA ADULTO");
		}
		else {
			System.out.println("FORA DE CATEGORIA");
		}
	}

}
