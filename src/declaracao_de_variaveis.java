
public class declaracao_de_variaveis {

	public static void main(String[] args) {
		System.out.println("Para declarar uma variável usamos a seguinte sintaxe \n <tipo> <nome> = <valor inicial>; \n\n");
		
		int idade = 25;
		float valor1 = 501.00f;
		double valor2 = 502.00;
		String nome = "Maria";
		boolean power = false;
		char sexo = 'F';
		
		//Valores Inteiros
		System.out.println("Usamos o tipo int para numéros inteiro como no exemplo: int idade = " + idade
							+ "\ntambém podemos usar o tipo \n"
							+ "<byte> para numero de até 8bits (128 +/-), \n"
							+ "<short> para até 16 bits (32768 +/-), \n"
							+ "<int> para até 32 bits (2147483648 +/-) e \n"
							+ "<long> para até 64 bits \n\n");
		
		//Valores Flutuantes
		System.out.println("Usamos o tipo float para numéros flutuantes como no exemplo: float valor1 = " + valor1 +"\nOu double valor2 = " + valor2
				+ "\nUsamos os tipos \n"
				+ "<float> para valores menores com precisão de até 6 ou 7 digitos significativos, \n"
				+ "<double> para valores maiores com precisão de até 14 ou 15 digitos significativos, \n\n");
		
		//Valores String e Char
		System.out.println("Usamos o tipo char para caracteres únicos unicode como no exemplo: char sexo = " + sexo +"\nPara declarar o valor de uma variável do tipo char, usamos aspas simples"
				+ "\nPara textos ou palavras usamos o tipo String, que deve ser declaro entre aspas dupla. Exemplo: String nome = " + nome + "\n\n");
		
		//Valores Boolean
		System.out.println("Usamos o tipo boolean para declarar uma variável true ou false, como no exemplo: boolean power = " + power +"\n\n");
		
		//Dicas Extras
		System.out.println("Algumas dicas extras quando declarar algumas variáveis: \n"
							+ "*Não pode começar com dígito: use uma letra ou _ (underline).\n"
							+ "*Não pode ter espaço em branco"
							+ "*Não usar acentos ou til\n"
							+ "*Sugestão: use o padrão 'camel case'\n"
							+ "Exemplos: \nString minuto = '5 minutos';(Errado) \nString minuto = '_5minutos';(Certo)\n"
							+ "String coluna1 = 'salário';(Errado) \nString coluna1 = 'salario';(Certo) \n"
							+ "String coluna2 = 'salário do funcionário';(Errado) \nString coluna2 = 'salarioDoFuncionario';(Certo)");
		

	}

}
