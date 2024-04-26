import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_03 {

	public static void main(String[] args) {
		//Exercício nº 1
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		/*Scanner sc = new Scanner(System.in);
		int new_value;
		System.out.println("Digite um valor:");
		
		new_value = sc.nextInt();
		
		if (new_value < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}*/
	
		//Exercício nº 2
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		/*Scanner sc = new Scanner(System.in);
		int new_value;
		System.out.println("Digite um valor:");
		new_value = sc.nextInt();
		
		if (new_value % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		} */
		//Exercício nº 3
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/
		/*Scanner sc = new Scanner(System.in);
		int new_value, new_value2;
		System.out.println("Digite dois valor:");
		new_value = sc.nextInt();
		new_value2 = sc.nextInt();
		
		if (new_value % new_value2 == 0 || new_value2 % new_value == 0 ) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}*/
		
		//Exercício nº 4
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
		 *duração do jogo, sabendo que o mesmo pode
		 *começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		/*Scanner sc = new Scanner(System.in);
		int new_value, new_value2, result1, result2;
		System.out.println("Digite horário inicio e horário fim:");
		new_value = sc.nextInt();
		new_value2 = sc.nextInt();
		
		if (new_value >= 12) {
			result1 =  -(new_value) + 24 + new_value2;
			System.out.println("O JOGO DUROU " + Math.abs(result1) + " HORAS");			
		}
		else if (new_value == 0 && new_value2 == 0)
			System.out.println("O JOGO DUROU 24 HORAS");
		else {
			result2 = new_value - new_value2;
			System.out.println("O JOGO DUROU " + Math.abs(result2) + " HORAS");
		}*/
		//Exercício nº 4
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		/*Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int operator;
		double new_value, total;
		System.out.println("1 - Cachorro Quente \n2 - X-Salada \n3 - X-Bacon"
				+ "\n4 - Torrada Simples \n5 - Refrigerante \n\nDigite dois códigos:");
		new_value = sc.nextInt();
		operator = sc.nextInt();
		
		if (new_value == 1) {
			new_value = 4.00;

		}
		else if (new_value == 2) {
			new_value = 4.50;
		}
		else if (new_value == 3) {
			new_value = 5;
		}
		else if (new_value == 4) {
			new_value = 2;
		}
		else if (new_value == 5) {
			new_value = 1.50;
		}
		else if (new_value == 0) {
			new_value = 0;
		}
		else {
			System.out.println("Código Inválido");
			new_value = 0;
		}
		
		total = new_value * operator;
		System.out.printf("Total: R$ %.2f", total);*/
	
		//Exercício nº 6
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double entrada;
		
		System.out.println("Digite um valor:");
		entrada = sc.nextDouble();
		
		
		if (entrada < 0 || entrada > 100) {
			System.out.println("Fora de intervalo");
		}
		else if (entrada <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (entrada <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (entrada <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (entrada <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		} */
		
		//Exercício nº 7
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
			de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
			ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
			Se o ponto estiver na origem, escreva a mensagem “Origem”.
			Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
			situação.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double x,y;
		
		System.out.println("Digite um valor para x e outro valor para y:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else {
			System.out.println("Q4");
		}
		
	}
	
}
