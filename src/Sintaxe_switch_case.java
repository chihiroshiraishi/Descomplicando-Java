import java.util.Scanner;

public class Sintaxe_switch_case {

	public static void main(String[] args) {
		/* 
		 switch <expressão> {
		 case <valor1>:
		 	<comando1>;
		 	<comando2>;
		 case <valor2>:
		 	<comando3>;
		 	<comando4>;
		 default:
		 	<comando5>
		 	<comando6>
		 }
		 */
		
		Scanner sc = new Scanner (System.in);
		int x;
		String dia;
		x = sc.nextInt();
		
		switch (x) {
		case 1:
				dia = "domingo";
				break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: "+ dia);
		sc.close();
	}
}
