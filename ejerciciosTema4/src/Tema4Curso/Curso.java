package Tema4Curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String identificador;
	private String descripcion;
	private List<Alumno> alumno = new ArrayList<>() ;
	
	
	

	public  void addAlumno(Alumno addAlumno) {
		alumno.add(addAlumno);
	}

	public Curso(String identificador, String descripcion, Integer cantidad) {
		this.identificador = identificador;
		this.descripcion = descripcion;
//		alumno = new Alumno[cantidad];
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

	public alumno getAlumnos() {
		return alumnos;
	}

	@Override
	public String toString() {
		return " " + identificador + " " + descripcion;
	}

}
