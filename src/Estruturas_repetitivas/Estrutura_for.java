package Estruturas_repetitivas;

import java.util.Scanner;

public class Estrutura_for {

	public static void main(String[] args) {
		// É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores. 
		// Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
		
		/* for (<início> ; <condição> ; <incremento>) {
		 * 		<comando 1>
		 * 		<comando 2>
		 * }
		 */
		
		/* Exemplo 1
		

			Scanner sc = new Scanner (System.in);
				int n = sc.nextInt();
				int soma = 0;
				
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				soma += x;
			}
			
			System.out.println(soma);			
			
			sc.close();
	 */
		
	/*	Exemplo 2
		for (int i = 0; i <= 5; i ++) {
			System.out.println("Valor de i = " + i);
		}
	*/
		
	/* Exemplo 3
	 	for (int i = 5; i >= 0; i --){
	 	System.out.println("Valor de i = " + i);
	 	}
	 */

	}

}
