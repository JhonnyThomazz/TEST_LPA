package lista_LPA.Exemplos;

import java.util.Scanner;

public class Questão_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); // importa e definir a biblioteca de captura de informações.
		int base, altura, area; // cria as variáveis.
		
		//entrada de dados
		System.out.println("informe o valor da base:"); // solicita o valor ao user
		base = ler.nextInt(); // captura o valor inserido e define a variavel "base"
		System.out.println("informe o valor da altura:"); // solicita o valor ao user
		altura = ler.nextInt(); // captura o valor inserido e define a variavel"altura"
		
		//processamento
		area = (base*altura)/2; // realiza a conta do valor da área com os valores indicados pelo user e define a variavel "area"
		
		//saída
		System.out.println("o valor da área é: " + area);// exibe o resultado da conta feita anteriormente
	ler.close(); //encerra a biblioteca de captura de dados
	}
	

}
