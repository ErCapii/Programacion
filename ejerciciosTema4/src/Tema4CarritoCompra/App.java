package Tema4CarritoCompra;

public class App {
	public static void main(String[] args) {
		Clientes cliente = new Clientes("12345678X", "Blas de los montes");
		CarritoCompra cesta = new CarritoCompra(cliente);
		System.out.println(cesta);
		Ropa prenda1 = new Ropa("poncho", 20, "XL", "azul");
		cesta.addArticulo(prenda1);
		cesta.addArticulo(prenda1);
		System.out.println(cesta);
		Libros libro1 = new Libros("Asi hablo Zaratustra", 15, "Nietzsche");
		cesta.addArticulo(libro1);
		System.out.println(cesta);
		cesta.borrarArticulo(1);
		System.out.println(cesta);
		System.out.println(cesta.getPrecioMedio() + "€");
		cesta.vaciarCesta();
		System.out.println(cesta);
		System.out.println(cesta.getPrecioMedio() + "€");

	}
}
