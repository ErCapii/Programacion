package Tema4Curso;

public class Curso {
	private String identificador;
	private String descripcion;
	private Alumno[] alumnos ;
	
	
	

	public  void addAlumno(Alumno addAlumno) {
		for (int i= 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = addAlumno;
				break;
			}
		}
	}

	public Curso(String identificador, String descripcion, Integer cantidad) {
		this.identificador = identificador;
		this.descripcion = descripcion;
		alumnos = new Alumno[cantidad];
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

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	@Override
	public String toString() {
		return " " + identificador + " " + descripcion;
	}

}
