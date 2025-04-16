package lista_LPA.Exemplos;

import java.util.Scanner;

public class Questao_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //importa a biblioteca de captura de dados
		int dia; // cria a variavel
		// entrada
		System.out.println("informe um número referente ao dia da semana, de 1 a 7: "); // solicita o valor ao user
		dia = ler.nextInt(); // captura o valor e define a variavel "dia"
	//processamento	
	if(dia == 1) { // compara o valor inserido com o definido pelo código, vendo se são iguais
		// saida
		System.out.println("o dia é domingo");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 2) { // compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é segunda");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 3) {// compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é terça");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 4) {// compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é quarta");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 5) {// compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é quinta");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 6) {// compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é sexta");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else if (dia == 7) {// compara o valor inserido com o definido pelo código, vendo se são iguais, caso o valor anterior não atender a condição de igualdade
		// saida
		System.out.println("o dia é sábado");// exibe a mensagem se os valores comparados atingam o critério de igualdade
	}
	else { // caso nenhum outro valor anterior atingir a condição de igualdade, exibe a mensagem com o comando: "System.out.print"
		// saida
		System.out.println("Dia inválido!");
	}
	ler.close();// encera a biblioteca de captura de dados
	}

}
