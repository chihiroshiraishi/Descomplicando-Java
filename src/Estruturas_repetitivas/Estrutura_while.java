package Estruturas_repetitivas;

import java.util.Scanner;

public class Estrutura_while {

	public static void main(String[] args) {
		/*É uma estrutura de controle que repete um bloco de comandos enquanto
		uma condição for verdadeira.
		
		Obs: Não usar quando não se sabe previamente a quantidade de repetições
		que será realizada */
		
		/* while (<condição1>) {
		 * 		<comando1>
		 * 		<comando2>
		 * } 
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		
		sc.close();
	}

}
