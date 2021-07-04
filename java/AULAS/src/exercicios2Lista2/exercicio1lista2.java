package exercicios2Lista2;

import java.util.Scanner;

public class exercicio1lista2 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);

		int inteiro1;
		int inteiro2;
		int inteiro3; 
		int comparar=0;
		
		
		System.out.println("Digite um numero inteiro");
		inteiro1=read.nextInt();
		System.out.println("Digite um numero inteiro");
		inteiro2=read.nextInt();
		System.out.println("Digite um numero inteiro");
		inteiro3=read.nextInt();
		
		if (inteiro1>inteiro2 && inteiro1>inteiro3){
			comparar=inteiro1;
		}
		 else if (inteiro2>inteiro1 && inteiro2>inteiro3){
			comparar=inteiro2;
		}
		 else if (inteiro3>inteiro1 && inteiro3>inteiro2){
			comparar=inteiro3;
		}
		 else {
			 System.out.println("Não há numero maior");
		 }
		System.out.println("O maior numero digitado é: "+comparar);
	}
	
		
	    
}
