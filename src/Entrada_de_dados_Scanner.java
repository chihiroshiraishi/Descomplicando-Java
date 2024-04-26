import java.util.Scanner;

public class Entrada_de_dados_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teste String");
		String x;

		// Permite a entrada de dado e é armazenado na variável
		x = sc.next();

		System.out.printf("Você digitou: %s \nt\n", x);

// -----------------------------------------------------------------------------------------------------		
		System.out.println("Teste Inteiro");

		int y;
		y = sc.nextInt();

		System.out.printf("Você digitou: %s \n\n", y);

//-------------------------------------------------------------------------------------------------------
		System.out.println("Teste Double");
		// Para considerar o separador de decimais como pontos, ANTES da declaração do
		// scanner precisa
		// usar o comando de Locale + país
		double z;
		z = sc.nextDouble();

		System.out.printf("Você digitou: %.2f \n\n", z);

//-------------------------------------------------------------------------------------------------------
		System.out.println("Teste Char");

		char k;
		// Comando charArt seleciona no parenteses qual caractere deve selecionar
		k = sc.next().charAt(0);

		System.out.printf("Você digitou: %s \n\n", k);

		// sempre usar o close quando Scanner não for mais usado

//--------------------------------------------------------------------------------------------------------
		System.out.println("Full Teste");
		System.out.println("Digite o nome, idade e altura:");

		String a;
		int b;
		double c;

		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();

		System.out.println("Os dados digitados foram: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// Sempre fechar o Scanner quando não for utilizar mais a função
		sc.close();
	}

}
