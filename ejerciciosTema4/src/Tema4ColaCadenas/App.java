package Tema4ColaCadenas;

public class App {
	public static void main(String[] args) {

		PilaCadenas pila = new PilaCadenas();
		System.out.println(pila);
		pila.añadirCadena("primera");
		pila.añadirCadena("segunda");
		System.out.println(pila);
		System.out.println(pila.sacarCadena());
		pila.añadirCadena("tercero");
		while (pila.getTamaño() > 0) {
			System.out.println(pila.sacarCadena());
		}
		pila.añadirCadena("cuarto");
		System.out.println(pila);

	}
}
