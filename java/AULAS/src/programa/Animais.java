package programa;

import java.util.Scanner;

import objetos.Cachorro;
import objetos.Cavalo;
import objetos.Preguiça;

public class Animais {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		Cachorro cachorro1= new Cachorro("Spartacus", 7);
		Cavalo cavalo1=new Cavalo ("Spirity", 5);
		Preguiça preguiça1=new Preguiça ("Soneca", 3);
		
		System.out.println("Nome do cachorro: " + cachorro1.getNome());
		System.out.println("A idade do cachorro é: " + cachorro1.getIdade() + " anos");
		System.out.print(cachorro1.getNome() + " ");
		cachorro1.emitirSom();
		System.out.println("------------------------");
		System.out.println("O nome do cavalo é: " + cavalo1.getNome());
		System.out.println("A idade do cavalo é: " + cavalo1.getIdade() + " anos");
		System.out.print(cavalo1.getNome() + " ");
		cavalo1.emitirSom();
		System.out.println("------------------------");
		System.out.println("O nome da preguiça é: " + preguiça1.getNome());
		System.out.println("A idade da preguiça é: " + preguiça1.getIdade() + " anos");
		System.out.print(preguiça1.getNome() + " ");
		preguiça1.emitirSom();
	}

}
