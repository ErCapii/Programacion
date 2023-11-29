package pruebas;

public class ejemploscadenas {
	public static void main(String[] args) {

		String cadena = "Abel Morillo Sanchez ";
		String sinEspaciosFinalInicial = cadena.trim();
		String enMayusculas = cadena.toUpperCase();
		String enMinusculas = cadena.toLowerCase();
		String repetidaTresVeces = cadena.repeat(3);
		String desdeLaEmeEnAdelante = cadena.substring(5);
		String desdeLaBeHastaLaErre = cadena.substring(1,7);
		String cambiandoElesPorZetas = cadena.replaceAll("l", "z");
		Integer longitud = cadena.length();
		Integer posicionDeLaPrimeraEle = cadena.indexOf("l");
		Integer posicionDeLaUltimaEle = cadena.lastIndexOf("l");
		Integer posicionDeLaPrimeraEleDesdeLaI = cadena.indexOf("l", 8);
		Boolean contieneMorillo = cadena.contains("Morillo");
		Boolean sonIguales = cadena.equals("Ejemplo");//
		Boolean sonIgualesIgnorandoMinMay = cadena.equalsIgnoreCase("Ejemplo");//
		Boolean esCadenaVacia = cadena.isEmpty();//
		Boolean esCadenaVaciaSoloConEspacios = cadena.isBlank();//
		Boolean comienzaPorAb = cadena.startsWith("Ab");
		Boolean terminaEnEz = cadena.endsWith("ez");
		Integer comparando = cadena.compareTo("Ejemplo");
		// si comparando es > 0  cadena es mayor que “Ejemplo”
		// si comparando es < 0  cadena es menor que “Ejemplo”
		// si comparando es = 0  cadena es igual que “Ejemplo”

	}
}
