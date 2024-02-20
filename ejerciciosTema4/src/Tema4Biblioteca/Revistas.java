package Tema4Biblioteca;

public class Revistas extends ArticulosBiblio implements IConsultable{

	private Boolean consultado;
	
	public Revistas(Integer codigo, String autor, String titulo, Integer añoPublicacion) {
		super(codigo, autor, titulo, añoPublicacion);
		consultado=false;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Revista =  codigo: " + getCodigo() + ", Autor: " + getAutor() + ", Titulo" + getTitulo()
				+ ", Año de publicacion: " + getAñoPublicacion();
	}
	@Override
	public void retirarParaConsultar() {
		if(consultado==true) {
			System.out.println("No esta disponible");
		}else
		consultado=true;
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
