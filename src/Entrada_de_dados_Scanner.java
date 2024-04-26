import java.util.Scanner;
import java.util.Locale;

public class Entrada_de_dados_Scanner {

	public static void main(String[] args) {
		Locale PtBR = new Locale("pt","br");
		Scanner sc = new Scanner(System.in);
		sc.useLocale(PtBR);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Teste String");
		String x;

		// Permite a entrada de dado e é armazenado na variável
		x = sc2.next();

		System.out.printf("Você digitou: %s \n\n", x);

// -----------------------------------------------------------------------------------------------------		
		System.out.println("Teste Inteiro");

		int y;
		y = sc2.nextInt();

		System.out.printf("Você digitou: %s \n\n", y);

//-------------------------------------------------------------------------------------------------------
		System.out.println("Teste Double");
		/* Para considerar o separador de decimais como pontos, ANTES da declaração do
		 scanner precisa
		 usar o comando de Locale + país */
		double  z;
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
		System.out.println("Full Teste \nDigite o Nome, Idade e Altura(Padrão BR) e Altura(Padrão US):");

		String a;
		int b;
		double c;
		double d;

		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc2.nextDouble();

		System.out.printf("%nOs dados digitados foram: %nNome: %s%nIdade: %d%nAltura decimal BR: %.2f%nAltura decimal US: %.2f",a,b,c,d);

		// Sempre fechar o Scanner quando não for utilizar mais a função
		sc.close();
	}

}
