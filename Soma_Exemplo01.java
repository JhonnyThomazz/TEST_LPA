package lista_LPA.Exemplos;

import java.util.Scanner;

public class Soma_Exemplo01 {

	public static void main(String[] args) {
		double a, b, soma;

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor 1: ");
		a = ler.nextDouble();

		System.out.print("Informe o valor 2: ");
		b = ler.nextDouble();

		soma = a + b;
		System.out.println("O resultado é " + soma);
		ler.close();
	}

}
