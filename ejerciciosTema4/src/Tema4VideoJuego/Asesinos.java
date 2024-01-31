package Tema4VideoJuego;

public class Asesinos extends Personaje{

	public Asesinos(String nombre, String codigo) {
		super(nombre,codigo);
		super.setVida(100);
		super.setDaño(1);
		super.setDañoXSegundo(5);
	}	
}
