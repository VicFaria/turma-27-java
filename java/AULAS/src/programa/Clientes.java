package programa;

import java.util.Scanner;

import objetos.Cliente;

public class Clientes {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
			
		Cliente cliente = new Cliente();
		
		System.out.println("Digite seu nome: ");
		cliente.informarNome(read.next());
		
		System.out.println("Digite seu ano de nascimento: ");
		cliente.setAnoNascimento(read.nextInt());
		
		cliente.informarSexo();
		cliente.setSexo(read.next().charAt(0));
		
		System.out.println("Voc� � nosso cliente a mais de 5 anos? (s/n): ");
		cliente.informarFidelidade(read.next().charAt(0));
		
		System.out.print("Ol�," + cliente.getNome() + " voc� tem ");
		cliente.informarAnoNascimento();
		
		if (cliente.isFidelidade()) {
			System.out.println("Voc� � um(a) cliente fidelidade.");
		}else {
			System.out.println("Voc� ainda n�o � nosso cliente fidelidade");
		}
		
		} 
	
	

	}


