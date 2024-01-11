package Tema4Curso;

public class Curso {
	private String identificador;
	private String descripcion;
	private String alumnos;

	public Curso(String identificador, String descripcion) {
		this.identificador = identificador;
		this.descripcion = descripcion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return " " + identificador + " " + descripcion;
	}

}
