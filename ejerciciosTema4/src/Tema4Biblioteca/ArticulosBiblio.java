package Tema4Biblioteca;


public abstract class ArticulosBiblio {

	private Integer codigo;
	private String autor;
	private String titulo;
	private Integer añoPublicacion;
	

	public ArticulosBiblio(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(Integer añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public ArticulosBiblio(Integer codigo) {
		super();
		this.codigo = codigo;
	}
	
}
