package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio 01
		/*
		 * System.out.
		 * println("Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha\r\n"
		 * +
		 * "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser\r\n"
		 * +
		 * "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta é o valor 2002."
		 * );
		 * 
		 * int senha = sc.nextInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha Invalida"); senha =
		 * sc.nextInt(); } System.out.println("Acesso Permitido");
		 sc.close();
		 */
/*
// Exercicio 02

		System.out.println(
				"Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\r\n"
						+ "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo\r\n"
						+ "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		} 
		sc.close(); */
/*		
// Exercicio 03
		
		System.out.println("Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\r\n"
				+ "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\r\n"
				+ "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até\r\n"
				+ "que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a\r\n"
				+ "mensagem: 'MUITO OBRIGADO' e a quantidade de clientes que abasteceram cada tipo de combustível, conforme\r\n"
				+ "exemplo.");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo_posto = sc.nextInt();
		
		while (codigo_posto != 4) {
			switch (codigo_posto) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
			codigo_posto = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO %nAlcool %d %nGasolina: %d %nDiesel: %d",alcool,gasolina,diesel); 
		sc.close();
		*/
	} 

}
