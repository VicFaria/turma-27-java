package exerciciosLista3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
	
		int numero=0, impar=0, par=0;
		
		for (numero=1; numero<=10;numero++) {
			System.out.println("Digite um numero de 0 a 10: ");
			numero=read.nextInt();
			
			if (numero>0) {
				if(numero%2==0) {
					par++;
					
				}else {
					impar++;
				}
			}
			
			System.out.println("Numeros pares: " + par);
			System.out.println("Numeros impares: " + impar);
		}
		
	}

}
