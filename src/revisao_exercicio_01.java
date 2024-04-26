import java.util.Locale;
import java.util.Scanner;

public class revisao_exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/*
		//Exercicio 01
		System.out.println("Digite dois valores e o resultado será a soma entre eles:");
		Scanner sc = new Scanner(System.in);
		
		int a,b,result;
		
		a = sc.nextInt();
		b = sc.nextInt();
		result = a + b;
		System.out.println("Resultado é: "+ result);
*/
/*
		//Exercicio 02
		System.out.print("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro "
				+ "casas decimais conforme exemplos\n");
		
	
		double pi, raio, result;
		pi = 3.14159;
		raio = sc.nextDouble();
		result = pi * Math.pow(raio,2.0);
		
		System.out.printf("Saída = %.4f%n",result);
*/
/*		
		//Exercicio 03
		System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");
		
		int A,B,C,D,result;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		result = (A * B - C * D);
		
		System.out.println("Saída =" + result);
*/
/*		
		//Exercicio 04
		System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\r\n"
				+ "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\r\n"
				+ "decimais");
		int number,hour;
		double salary,result;
		Locale.setDefault(Locale.US);
		
		number = sc.nextInt();
		hour = sc.nextInt();
		salary = sc.nextDouble();
		result = (double) salary * hour;
		System.out.printf("Number: %d%nSalary = $ %.2f%n",number,result);
*/		
/*
		//Exercicio 05
		System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\r\n"
				+ "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
		int codigo1,codigo2,qtd1,qtd2;
		double valor1,valor2,result;
		Locale.setDefault(Locale.US);
		
		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		result = (valor1 * qtd1) + (valor2 * qtd2);
		System.out.printf("VALOR A SE PAGAR: R$ %.2f%n", result);
*/		
		//Exercicio 06
		System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\r\n"
				+ "mostre:\r\n"
				+ "a) a área do triângulo retângulo que tem A por base e C por altura.\r\n"
				+ "b) a área do círculo de raio C. (pi = 3.14159)\r\n"
				+ "c) a área do trapézio que tem A e B por bases e C por altura.\r\n"
				+ "d) a área do quadrado que tem lado B.\r\n"
				+ "e) a área do retângulo que tem lados A e B.");
		double A,B,C,pi,triangulo,circulo,trapezio,quadrado,retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi =  3.14159;
		triangulo = (A * C) / 2;
		circulo = pi * (Math.pow(C,2.0));
		trapezio = ((A + B) * C) / 2;
		quadrado = Math.pow(B,2.0);
		retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapézio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n",triangulo,circulo,trapezio,quadrado,retangulo);
		
	}

}
