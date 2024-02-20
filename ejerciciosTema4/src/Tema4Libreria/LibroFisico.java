package Tema4Libreria;

public class LibroFisico extends ArticulosLibreria{

	public LibroFisico(String titulo, String autor, Integer fechaEdicion, Integer numeroPaginas, Integer ancho, Integer largo, Integer peso) {
		super(titulo, autor, fechaEdicion, numeroPaginas);
		// TODO Auto-generated constructor stub
		setTipo("Fisico");
		this.tamaño = new Tamaño(ancho, largo);
		this.peso = peso;
	}
	private Tamaño tamaño;
	private Integer peso;
	
	
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public Tamaño getTamaño() {
		return tamaño;
	}
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Libro Titulo "  + getTitulo()+ ", Autor "+getAutor()+ ", Fecha "+getFechaEdicion()+ ", Numero de paginas "+getNumeroPaginas()+ ", tamaño "+tamaño+ ", peso "+peso ;
		
	}

}
