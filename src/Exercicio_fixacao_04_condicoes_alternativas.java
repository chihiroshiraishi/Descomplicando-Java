import java.util.Scanner;

public class Exercicio_fixacao_04_condicoes_alternativas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Exercicio 01
/*		
		System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
		String x = (sc.nextInt() >= 0) ? "Não Negativo" : "Negativo";
		System.out.println(x);
*/
/*		
		//Exercicio 02
		
		System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");
		String y = (sc.nextInt() % 2 == 0) ? "Par" : "Impar";
		System.out.println(y);
*/
/*		
		//Exercicio 03
		
		System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\r\n"
				+ "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\r\n"
				+ "ordem crescente ou decrescente.");
		int z1 = sc.nextInt();
		int z2 = sc.nextInt();
		String resultZ = (z2 % z1 == 0 || z1 % z2 == 0) ? "São Multiplos" : "Não são multiplos";
		System.out.println(resultZ);
*/		
/*		
		//Exercicio 04
		
		System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\r\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int resultA;
		if (a1 > 12) {
			resultA = (24 - a1) + 02;
		}
		else if (a2 > 12) {
			resultA = -(a1 - a2);
		}
		else if (a1 == 0 && a2 == 0) {
			resultA = 24;
		}
		else {
			resultA = a1 + a2;
		}
		System.out.printf("O jogo durou: %d horas",resultA);
*/		
/*		
		//Exercicio 05
		
		System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\r\n"
				+ "seguir, calcule e mostre o valor da conta a pagar");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		double valorB;
		switch (b1) {
		case 1:
			valorB = 4.00 * b2;
			break;
		case 2:
			valorB = 4.50 * b2;
			break;
		case 3:
			valorB = 5.00 * b2;
			break;
		case 4:
			valorB = 2.00 * b2;
			break;
		case 5:
			valorB = 1.50 * b2;
			break;
		default:
			valorB = 0.00;
		}
		System.out.println("Total R$ "+ valorB);
*/
/*		
		//Exercicio 06
		System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\r\n"
				+ "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\r\n"
				+ "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");
		double c = sc.nextDouble();
		String intervalo;
		if (c >= 0 && c <= 25) {
			intervalo = "Intervalo (0,25)";
		}
		else if (c > 25 && c <= 50) {
			intervalo = "Intervalo (25,50)";
		}
		else if (c > 50 && c <= 75) {
			intervalo = "Intervalo (50,75)";
		}
		else if (c > 75 && c <= 100) {
			intervalo = "Intervalo (75,100)";
		}
		else {
			intervalo = "Fora de intervalo";
		}
		System.out.println(intervalo);
*/
/*	
		//Exercicio 07
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\r\n"
				+ "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\r\n"
				+ "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\r\n"
				+ "Se o ponto estiver na origem, escreva a mensagem “Origem”.\r\n"
				+ "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\r\n"
				+ "situação.");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		String saidaD;
		if (d1 > 0 && d2 > 0) {
			saidaD = "Q1";
		}
		else if (d1 < 0 && d2 > 0) {
			saidaD = "Q2";
		}
		else if (d1 < 0 && d2 < 0) {
			saidaD = "Q3";
		}
		else if (d1 > 0 && d2 < 0) {
			saidaD = "Q4";
		}
		else {
			saidaD = "Origem";
		}
		System.out.println(saidaD);
*/
		
		//Exercicio 08
		System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem\r\n"
				+ "que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem\r\n"
				+ "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\r\n"
				+ "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e\r\n"
				+ "mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.\n\n"
				+ "De R$0.00 a R$2000.00 = isento \n"
				+ "De R$2000.01 a R$3000.00 = 8% \n"
				+ "De R$3000.01 a R$4500.00 = 18% \n"
				+ "Acima de R$4500.01 = 28%\n");
		double valorAPagar;
		double salario = sc.nextDouble();
		if (salario <= 2000.00) {
			valorAPagar = 0;
		}
		else if (salario >= 2000.01 && salario <= 3000.00) {
			valorAPagar = (salario - 2000) * 0.08;
		}
		else if (salario >= 3000.01 && salario <= 4500.00) {
			valorAPagar = 1000 * 0.08 + (salario - 3000) * 0.18;
		}
		else {
			valorAPagar = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
		}
		System.out.printf(valorAPagar == 0 ? "Isento" : "R$ %.2f%n", valorAPagar);
	}
}
