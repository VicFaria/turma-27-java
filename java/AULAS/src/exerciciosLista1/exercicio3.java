package exerciciosLista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);

		int tempoEvento;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Informe quantos segundos tem seu evento: ");
		tempoEvento=read.nextInt();
		
		horas=tempoEvento/3600;
		minutos=(tempoEvento%3600)/60;
		segundos=(tempoEvento%3600) %60;
		
		System.out.println("Seu evento tem: " + horas + " horas de duração.");
		System.out.println("Seu evento tem: " + minutos + " minutos de duração.");
		System.out.println("Seu evento tem: " + segundos + " segundos de duração.");
	}

}
