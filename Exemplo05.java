package lista_LPA.Exemplos;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Informe uma nota de 0 a 10 para o atendente:");
		int nota = ler.nextInt();
		
		if(nota == 10) {
			System.out.println("Ótimo!");
		}else if(nota >= 5) {
			System.out.println("Bom!");
		}else {
			System.out.println("Regular...");
		}
		ler.close();
	}

}
