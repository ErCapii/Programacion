package Tema4Curso;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;
	private Integer nota;
	private Curso curso;

	public Alumno(String dni) {
		this.dni = dni;

	}

	public void aprobar() {
		if (nota < 5) {
			nota = 5;
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Boolean validarDNI() {
		Boolean validar = true;
		// if (dni.isEmpty() || dni.length() != 9) {
		// System.out.println("DNI no valido, vuelva a introducir el DNI");
		// validar = true;
		// } else
		// validar = false;
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			validar = false;
		} else {
			validar = true;
		}

		return validar;

	}

	public Boolean validar() {
		Boolean validar = false;

		if (getNombre() == null || getNombre().length() < 10) {
			System.out.println("El nombre no puede estar vacio y tiene que tener 10 caracteres como minimo");
			validar = true;
		} else if (curso.getIdentificador() == null || curso.getDescripcion() == null) {
			System.out.println("El curso no puede estar vacio");
			validar = true;
		} else if (getEdad() == null || getEdad() < 12 || getEdad() > 65) {
			System.out.println("La edad no puede estar vacio y tiene que estar comprendidad entre 12 y 65 años");
			validar = true;
		} else
			validar = false;

		return validar;

	}

	@Override
	public String toString() {
		return "Nombre del alumno " + getNombre() + " de " + getEdad() + " años " + "con dni " + dni + ", cursa en"
				+ curso + "y tiene una nota de " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
