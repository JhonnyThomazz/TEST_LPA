package lista_LPA.Exemplos;

import java.util.Scanner;

public class Questao_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);// importa a biblioteca de captura de dados
		int num, result;// cria as variaveis

		System.out.println("informe um valor: ");// pede ao user um valor qualquer
		num = ler.nextInt();// captura e atribui o valor a variavel "num"
		result = 0; //define o valor da variavel
		for(int i = 1; i <=10; i++) {// deixa em loop as informações entre as chaves
			result = result + num;// define a variavel "result" somando a mesma com a variavel "num"
			System.out.println(result);// projeta o resultado até chegar na quantidade de repetições pedidas(10)
		}ler.close();// fecha a biblioteca de captura de dados	
	}
}
