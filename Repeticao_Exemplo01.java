package lista_LPA.Exemplos;

import java.util.Scanner;

public class Repeticao_Exemplo01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int n, result;

		System.out.print("Informe um número para fazer a tabuada: ");
		n = ler.nextInt();

		for (int i = 1; i <= 10; i++) {
			result = n * i;
			System.out.println(result);
		}
		ler.close();

	}

}
