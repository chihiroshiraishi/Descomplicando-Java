import java.util.Locale;

public class Tipos_Print {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double x = 10.35784;
		System.out.print(x + " - ");
		System.out.println(x);
		System.out.printf("%.2f%n", x);  
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		// %f é ponto flutuante
		// %n é quebra de linha
		System.out.printf("RESULTADO = %.2f metros%n", x);
	}
}
