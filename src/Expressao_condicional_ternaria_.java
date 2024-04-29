
public class Expressao_condicional_ternaria_ {

	public static void main(String[] args) {
		/*Estrutura opcional do if-else quando se deseja decidir um VALOR com base em uma condição
		 <condição> ? <valor_se_verdadeiro> : <valor_se_falso> */

		int a;
		String b;
		//Exemplo 01 (if-else)
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.println("Exemplo 01: " + desconto);
		
		//Exemplo 2
		double preco1 = 34.5;
		double desconto1 = (preco < 20.0) ? preco1 * 0.1 : preco1 * 0.05;
		
		System.out.println("Exemplo 02: " + desconto1);
	}

}
