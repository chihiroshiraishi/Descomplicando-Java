import java.util.Scanner;

public class Entrada_de_dados_Scanner_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teste String até a quebra de linha");

		int b;
		String a1, a2, a3,b1;
		/* Quando usa um comando de leitura diferente do nextLine() e dá alguma quebra
		  de linha, essa linha fica "pendente" na entrada padrão. Se você então fizer
		  um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine() 
		  
		  
		  A maior diferença entre o comando sc.next() e sc.nextLine() é que, quando usamos o sc.next() ele só captura a primeira
		  palavra da frase, já com o sc.nextLine() ele captura toda a frase.


		  Para a solução do comentário acima, faça um nextLine() extra antes de fazer o
		  nextLine() do seu interesse */
		
		
		System.out.println("Digite na seguinte sequencia para melhor entendimento:\n"
							+ "Qualquer número\n"
							+ "Bom dia (teste de nextLine)\n"
							+ "Boa tarde (teste de next)\n"
							+ "Boa noite (teste de nextLine)\n");
		
		b = sc.nextInt();
		sc.nextLine(); // Limpa buffer de leitura
		a1 = sc.nextLine();
		a2 = sc.next();
		sc.nextLine(); // Limpa buffer de leitura
		a3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(b);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		sc.close();
	}

}
