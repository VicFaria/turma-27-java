package programa;

import java.util.Scanner;

import objetos.Cachorro;
import objetos.Cavalo;
import objetos.Pregui�a;

public class Animais {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		Cachorro cachorro1= new Cachorro("Spartacus", 7);
		Cavalo cavalo1=new Cavalo ("Spirity", 5);
		Pregui�a pregui�a1=new Pregui�a ("Soneca", 3);
		
		System.out.println("Nome do cachorro: " + cachorro1.getNome());
		System.out.println("A idade do cachorro �: " + cachorro1.getIdade() + " anos");
		System.out.print(cachorro1.getNome() + " ");
		cachorro1.emitirSom();
		System.out.println("------------------------");
		System.out.println("O nome do cavalo �: " + cavalo1.getNome());
		System.out.println("A idade do cavalo �: " + cavalo1.getIdade() + " anos");
		System.out.print(cavalo1.getNome() + " ");
		cavalo1.emitirSom();
		System.out.println("------------------------");
		System.out.println("O nome da pregui�a �: " + pregui�a1.getNome());
		System.out.println("A idade da pregui�a �: " + pregui�a1.getIdade() + " anos");
		System.out.print(pregui�a1.getNome() + " ");
		pregui�a1.emitirSom();
	}

}
