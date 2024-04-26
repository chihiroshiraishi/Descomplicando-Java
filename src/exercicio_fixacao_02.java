import java.util.Locale;
import java.util.Scanner;

public class exercicio_fixacao_02 {

	public static void main(String[] args) {
		//(1)
		/*Scanner sc = new Scanner(System.in);	
		int a, b, resultado;
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();		
		resultado = a + b;		
		System.out.println("Soma = " + resultado);
		sc.close(); */
		
		//(2)
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		double a, pi, resultado;		
		pi = 3.14159;
		System.out.println("Digite o numero de entrada: ");
		a = sc.nextDouble();		
		resultado = pi * a * a;
		System.out.printf("A = %.4f \n", resultado);
		sc.close();
		*/
		
		//(3)
		/*
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, resultado;		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		resultado = a * b - c * d;		
		System.out.println("DIFERENÇA = " + resultado);
		sc.close();
		*/
		
		//(4)
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id, hour;
		double salary, total;
		System.out.println("Enter your ID: ");
		id = sc.nextInt();
		System.out.println("Now enter minutes spend at work: ");
		hour = sc.nextInt();
		System.out.println("Enter your salary per hour: ");
		salary = sc.nextDouble();
		total = hour * salary;
		System.out.println("Number = " + id);
		System.out.printf("Salary = U$%.2f \n", total);
		sc.close();
		*/
		
		//(5)
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id1, id2, qtd1, qtd2;
		double value1, value2, total;
		System.out.println("Digite o codigo, quantidade e valor do item 1:");
		id1 = sc.nextInt();
		qtd1 = sc.nextInt();
		value1 = sc.nextDouble();
		System.out.println("Digite o codigo, quantidade e valor do item 2:");
		id2 = sc.nextInt();
		qtd2 = sc.nextInt();
		value2 = sc.nextDouble();
		total = (qtd1 * value1) + (qtd2 * value2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);		
		sc.close();
		*/
	}

}
