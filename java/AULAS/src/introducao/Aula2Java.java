package introducao;

import java.util.Scanner;

public class Aula2Java {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero inteiro escolhido: ");
		numero=read.nextInt();
		
		if(numero % 2 == 0) {
			
			System.out.println("O numero escolhido é par");
		}
		else {
		    System.out.println("O numero escolhido é impar");
		}
				
	}

}
