package Tema4VideoJuego;

public class Parasitos extends Personaje{
	
	public Parasitos(String nombre, String codigo) {
		super(nombre,codigo);
		super.setVida(200);
		super.setDaño(2);
		super.setDañoXSegundo(1);
	}
}
