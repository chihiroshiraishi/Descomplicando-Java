import java.util.Scanner;

public class Entrada_de_dados_Scanner_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teste String até a quebra de linha");
		System.out.println("Digite um número e 3 frases:");

		int b;
		String a1, a2, a3;
		/*
		 * QUando usa um comando de leitura diferente do nextLine() e dá alguma quebra
		 * de linha, essa linha fica "pendente" na entrada padrão. Se você então fizer
		 * um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine()
		 */
		b = sc.nextInt();

		/*
		 * Para a solução do comentário acima, faça um nextLine() extra antes de fazer o
		 * nextLine() do seu interesse
		 */
		sc.nextLine(); // Limpar buffer de leitura
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(b);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		sc.close();
	}

}
