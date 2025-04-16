package lista_LPA.Exemplos;

import java.util.Scanner;

public class Questao_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // importa e definir a biblioteca de captura de informações.
		int num1, num2, result; // cria as variáveis.

		// entrada de dados
		System.out.print("infome o primeiro valor: "); // solicita o primeiro valor ao user
		num1 = ler.nextInt(); // captura o primeiro valor e define a variavel "num1"
		System.out.print("informe o segundo valor: "); // solicita o segundo valor ao user
		num2 = ler.nextInt(); // captura o segundo valor e define a variavel "num2"

		// processamento
		result = num1 + num2; // soma dos valores informados pelo user.

		// saída
		System.out.println("O resultado da operação: " + result);// informa o resultado obtido da soma.

		ler.close(); // encerra a biblioteca de captura de informações.
	}

}
