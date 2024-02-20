package Tema4Libreria;

public class LibroDigital extends ArticulosLibreria{

	private String tipo;
	
	public LibroDigital(String titulo, String autor, Integer fechaEdicion, Integer numeroPaginas) {
		super(titulo, autor, fechaEdicion, numeroPaginas);
		// TODO Auto-generated constructor stub
		setTipo("Digital");
	}
	public String toString() {
		return "Libro Titulo "  + getTitulo()+ ", Autor "+getAutor()+ ", Fecha "+getFechaEdicion()+ ", Numero de paginas "+getNumeroPaginas();
		
	}

}
