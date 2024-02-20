package Tema4Biblioteca;

public class Libros extends ArticulosBiblio implements IPrestable, IConsultable{

	private Boolean prestado;
	private Boolean consultado;
	
	public Libros(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		prestado=false;
		consultado=false;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Libro = codigo: " + getCodigo() + ", Autor: " + getAutor() + ", Titulo" + getTitulo()
				+ ", Año de publicacion: " + getAñoPublicacion();
	}
	@Override
	public void prestar() {
		if(consultado) {
			System.out.println("No esta disponible");
		}else {
			
			prestado = true;
		}
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
	@Override
	public void retirarParaConsultar() {
		if(prestado) {
			System.out.println("No esta disponible");
		}else {
			consultado=true;
			
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void terminarConsulta() {
		consultado=false;
		// TODO Auto-generated method stub
		
	}
	@Override
	public Boolean estaConsultando() {
		
		// TODO Auto-generated method stub
		return consultado;
	}
	
}
