package Tema4Biblioteca;

public class CD extends ArticulosBiblio implements IPrestable{

	private Boolean prestado;
	
	public CD(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		prestado=false;
	}

	@Override
	public String toString() {
		return "CD =  codigo: " + getCodigo() + ", Autor: " + getAutor() + ", Titulo" + getTitulo()
				+ ", Año de publicacion: " + getAñoPublicacion();
	}

	@Override
	public void prestar() {
		prestado=true;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void devolver() {
		prestado=false;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Boolean estaPrestado() {
		// TODO Auto-generated method stub
		return prestado;
	}

}
