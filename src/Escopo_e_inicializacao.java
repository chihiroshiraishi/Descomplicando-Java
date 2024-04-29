
public class Escopo_e_inicializacao {

	public static void main(String[] args) {
		/*Escopo de uma variável: é a região do programa onde a variável
		 é válida, ou seja, onde ela pode ser referenciada.
		 * Uma variável não pdoe ser usada se não for iniciada. */
		
		//Exemplo 01
		double price1 = 400.00;
		double discount1 = 0;
		if (price1 > 200.00) {
			discount1 = price1 * 0.1;
		}
		System.out.println("Exemplo 01: " + discount1);
	
		
		//Exemplo 02
		double price2 = 400.00;
		double discount2;
		if (price2 > 200.00) {
			discount2 = price2 * 0.1;
		}
		else {
			discount2 = 0;
		}
		System.out.println("Exemplo 02: " + discount2);
		
		//Exemplo 03
		double price3 = 400.00;
		if (price2 > 200.00) {
			double discount3 = price3 * 0.1;
		System.out.println("Exemplo 03: " + discount3);
		}
		
		//Exemplo04
		double price4 = 400.00;
		double discount4 = (price4 > 200.00) ? (price4 * 0.1) : price4;
		System.out.println("Exemplo 04: " + discount4);
	}
	

}
