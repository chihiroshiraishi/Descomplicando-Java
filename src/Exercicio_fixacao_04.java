import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
/*
		//Exercicio 01
		System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não");
		int input1;
		input1 = sc.nextInt();
		if (input1 >= 0) {
				System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		sc.close();
		}  */
		
/*
		//Exercicio 02
		System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");
		int input2;
		input2 = sc.nextInt();
		if (input2 % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		} */
		
/*	
		//Exercicio 03
		System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente.");
		int input3,input4;
		input3 = sc.nextInt();
		input4 = sc.nextInt();
		if (input3 % input4 == 0) {
			System.out.println("São Multiplos");
		}
		else if (input4 % input3 == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		} */
		
/*		
		//Exercicio 04
		System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\r\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");
		int input5,input6,result1;
		input5 = sc.nextInt();
		input6 = sc.nextInt();
		result1 = input5 + input6;
		if (input5 > 12) {
			result1 = -(input5) + 24 + input6;
			System.out.printf("O jogo durou: %d horas",result1);
		}
		else if (input6 > 12) {
			result1 = input6 - input5;
			System.out.printf("O jogo durou: %d horas",result1);
		}
		else if (input5 == 0) {
			result1 = 24;
			System.out.printf("O jogo durou: %d horas",result1);
		} */
		
/*		
		//Exercicio 05
		System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\r\n"
				+ "seguir, calcule e mostre o valor da conta a pagar.");
		int input7,input8;
		double valor1,result3;
		input7 = sc.nextInt();
		input8 = sc.nextInt();
		
		if (input7 == 1) {
			valor1 = 4.00;
			result3 = (double) valor1 *  input8;
			System.out.printf("Total: R$ %.2f%n", result3);
		}
		else if (input7 == 2) {
			valor1 = 4.50;
			result3 = (double) valor1 *  input8;
			System.out.printf("Total: R$ %.2f%n", result3);
		}
		else if (input7 == 3) {
			valor1 = 5.00;
			result3 = (double) valor1 * input8;
			System.out.printf("Total: R$ %.2f%n", result3);
		}
		else if (input7 == 4) {
			valor1 = 2.00;
			result3 = (double) valor1 * input8;
			System.out.printf("Total: R$ %.2f%n", result3);
		}
		else if (input7 == 5) {
			valor1 = 1.50;
			result3 = (double) valor1 * input8;
			System.out.printf("Total: R$ %.2f%n", result3);
		}
		else {
			System.out.println("Código não encontrado");
		} */
		
/*		
		//Exercicio 06
		System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\r\n"
				+ "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\r\n"
				+ "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");
		double input9;
		input9 = sc.nextDouble();
		
		if (input9 >= 0.0 && input9 <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (input9 > 25 && input9 <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (input9 > 50 && input9 <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (input9 > 75 && input9 <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		} */
		
/*
		//Exercicio 07
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\r\n"
				+ "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\r\n"
				+ "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\r\n"
				+ "Se o ponto estiver na origem, escreva a mensagem “Origem”.\r\n"
				+ "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\r\n"
				+ "situação.");
		double x,y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		} */
		
		
		//Exercicio 08
		System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem\r\n"
				+ "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem\r\n"
				+ "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\r\n"
				+ "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\r\n"
				+ "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.\n\n"
				+ "De R$0.00 a R$2000.00 = isento \n"
				+ "De R$2000.01 a R$3000.00 = 8% \n"
				+ "De R$3000.01 a R$4500.00 = 18% \n"
				+ "Acima de R$4500.01 = 28%\n\n");
		double salario,imposto1,imposto2,imposto3,valorAPagar;
		salario = sc.nextDouble();
		imposto1 = 0.08;
		imposto2 = 0.18;
		imposto3 = 0.28;
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario >= 2000.01 && salario <= 3000.00) {
			valorAPagar = ((salario - 2000) * imposto1 );
			System.out.printf("R$ %.2f%n", valorAPagar);
		}
		else if (salario >= 3000.01 && salario <= 4500.00) {
			valorAPagar = ((1000 * imposto1) + ((salario - 3000) * imposto2));
			System.out.printf("R$ %.2f%n", valorAPagar);
		}
		else {
			valorAPagar = ((1000 * imposto1) + (1500 * imposto2) + ((salario - 4500) * imposto3));
			System.out.printf("R$ %.2f%n"+ valorAPagar);
		}
	}
}
