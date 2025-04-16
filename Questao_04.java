package lista_LPA.Exemplos;

import java.util.Scanner;

public class Questao_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);// importa a biblioteca de captura de dados
		int num, result;// cria as variaveis

		System.out.println("informe um valor: ");
		num = ler.nextInt();
		result = 0;
		for(int i = 1; i <=10; i++) {
			result = result + num;
			System.out.println(result);
		}ler.close();	}
}
