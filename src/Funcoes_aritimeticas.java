
public class Funcoes_aritimeticas {

	public static void main(String[] args) {
		System.out.println("+ = adição \n"+
						   "- = subtração \n"+
						   "* = multiplicação \n"+ 
						   "/ = divisão \n"+ 
						   "% = resto da divisão ou 'mod'\n\n Exemplos: \n");

		int a, b, c, d, result;
		//Exemplo 1
		a = 2;
		b = 6;
		c = 3;
		result = a * b / c;
		System.out.println(a+"*"+b+"/"+c+ " Resultado = " + result);
		
		//Exemplo 2
		a = 3;
		b = 2;
		c = 4;
		result = a + b * c;
		System.out.println(a+"+"+b+"*"+c+ " Resultado = " + result);
		
		//Exemplo 3
		a = 3;
		b = 2;
		c = 4;
		result = (a + b) * c;
		System.out.println("("+a+"+"+b+")"+"*"+c+ " Resultado = " + result);
		
		//Exemplo 4
		a = 3;
		b = 2;
		c = 4;
		result = (a + b) * c;
		System.out.println("("+a+"+"+b+")"+"*"+c+ " Resultado = " + result);
		
		//Exemplo 5
		a = 60;
		b = 3;
		c = 2;
		d = 4;
		result = a / (b + c) * d;
		System.out.println(a + "/(" + b + "+" + c + ")*" + d +  " Resultado = " + result);
		
		//Exemplo 6
		a = 60;
		b = 3;
		c = 2;
		d = 4;
		result = a / ((b + c) * d);
		System.out.println(a + "/((" + b + "+" + c + ")*" + d +  ") Resultado = " + result);
		
	}

}
