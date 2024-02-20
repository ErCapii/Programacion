package Tema4Libreria;

public abstract class ArticulosLibreria {

	
	private String titulo;
	private String autor;
	private Integer fechaEdicion;
	private Integer numeroPaginas;
	private String tipo;
	
	public ArticulosLibreria(String titulo, String autor, Integer fechaEdicion, Integer numeroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.numeroPaginas = numeroPaginas;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(Integer fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
