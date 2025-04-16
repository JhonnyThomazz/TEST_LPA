package lista_LPA.Exemplos;

import java.util.Scanner;

public class IF_ELSE_Exemplo01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("informe um número para realizar a comparação:");
		int num = ler.nextInt();// Entrada de dados

		if (num >= 10) {// Estrutura de decisão
			System.out.println("Seu número é maior ou igual a dez");
			} else {
				System.out.println("seu número é menor que dez");
			}
		ler.close();
		}

	}


