package programa;

import java.util.Scanner;

import objetos.ContaBancaria;

public class Banks {
 
	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		ContaBancaria cliente1 = new ContaBancaria(1); //instaciar
		ContaBancaria clientevip = new ContaBancaria(1000,55.55);
		ContaBancaria clienteespecial = new ContaBancaria(3);
		ContaBancaria clienteVic = new ContaBancaria(45,1955.45,2080.08);
	
		cliente1.setNumero(999);
		System.out.println("NUMERO DA CONTA"+cliente1.getNumero());
	}
}
