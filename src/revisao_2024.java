import java.util.Locale;

public class revisao_2024 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	String produto1 = "Computer";
	String produto2 = "Office desk";
	int age = 30;
	int code = 5290;
	char gender = 'F';
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	Locale LocaleBR = new Locale ("pt","br");
	
	System.out.printf(LocaleBR,"%s, which price is $ %.2f %n"
					+ "%s, which price is $ %.2f %n"
					+ "Record: %d years old, code %d and gender %s%n"
					+ "Measure with eight decimal places: %.8f%n"
					+ "Rouded(three decimals places): %.3f%n",produto1,price1,produto2,price2,age,code,gender,measure,measure);
	System.out.printf("US Decimal point: %.3f",measure);	
	}

}
