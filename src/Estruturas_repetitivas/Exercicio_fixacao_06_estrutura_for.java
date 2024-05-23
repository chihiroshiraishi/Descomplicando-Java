package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_06_estrutura_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/* Exercicio 01
		System.out.println("Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o\r\n"
				+ "X, se for o caso.");
			int x = sc.nextInt();
			int soma = -1;
			
			for (int i = 0; i < x; i += 2) {
				soma += 2;
				System.out.println(soma);
			}
			sc.close(); */
	
	/* Exercicio 02
		System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\r\n"
				+ "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\r\n"
				+ "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");
		
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < x; i++) {
			int x1 = sc.nextInt();
			if (x1 >= 10 && x1 <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in+ " in \n" + out + " out");
		sc.close();
	*/
		
	/* Exercicio 04
		System.out.println("\r\n"
				+ "Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste \r\n"
				+ "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes \r\n"
				+ "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem \r\n"
				+ "peso 5. ");
		Locale.setDefault(Locale.US);
		int inicial = sc.nextInt();
		double x1, x2, x3, total;
		
		for (int i = 0; i < inicial; i++) {
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			total = (2.0*x1 + 3.0*x2 + 5.0*x3) / 10.0;
			System.out.printf("%.1f %n", total);
		}
		sc.close();
		*/
		 
		/* Exercicio 05
		System.out.println("\r\n"
				+ "Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo \r\n"
				+ "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\".");
		Locale.setDefault(Locale.US);
		int x = sc.nextInt();
		for (int i = 0; 1 < x; i++) {
			int y = sc.nextInt();
			int y2 = sc.nextInt();
			if ( y2 == 0) {
				System.out.println("divisao impossivel");
				}
			else {
				double divisao = (double) y / y2;
				System.out.println(divisao);
			} 
		} */
		
		/* Exercicio 06
		System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. \r\n"
				+ "Lembrando que, por definição, fatorial de 0 é 1. ");
		int x = sc.nextInt();
		int fatorial = x;
		
		for (int i = 0; i < x; i++) {
			int x1 = x - 1;
			x = x1;
			fatorial *= x1;
		}
		if (x == 0) {
			fatorial = 1;
		}
		System.out.println(fatorial);*/
		
		/* Exercicio 07
		System.out.println("Ler um número inteiro N e calcular todos os seus divisores.");
		int x = sc.nextInt();
		int divisor = 0;
		
		for (int i = 1; i <= x; i++) {
			divisor = x % i;
			
			if (divisor == 0) {
				System.out.println(i);
			}
		} */
		
		/* Exercicio 08
		System.out.println("Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, \r\n"
				+ "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme \r\n"
				+ "exemplo. ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int n1 = n - (n - i);
			System.out.println(n1 + " " + (int)Math.pow(n1,2) + " " + (int)Math.pow(n1,3));
		} */
		
	} 
}
