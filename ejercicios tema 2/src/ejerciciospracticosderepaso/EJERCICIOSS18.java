package ejerciciospracticosderepaso;

public class EJERCICIOSS18 {
public static void main(String[] args) {
	
	String palabra= "indonesia";
	String letra;
	Integer final1=0;
	Integer final2=0;
	final1=palabra.length();
	final2=palabra.length();
	
	do {
		
		final2--;
		letra = palabra.substring(final2, final1);
		System.out.print(letra);
		final1--;
		
	
	}while(final2 > 0);
	
}
}
