package Tema4Telefonos;

import java.util.Objects;

public abstract class General {
	private Integer numero;
	private Boolean enLlamada;
	
	public General(Integer numero) {
		super();
		this.numero = numero;
		this.enLlamada = false;
	}
	public Integer consultarNumero() {
		return numero;
	}
	public void marcar(Integer numeroMarcado) {
		System.out.println("Llamando a "+ numeroMarcado);
		if(numero.equals(numeroMarcado)) {
			System.out.println("Comunicando");
		}else
			System.out.println("En comunicacion");
			enLlamada = true;
		
	}
	public void colgar() {
		if(enLlamada) {
			System.out.println("Comunicacion Terminada");
			enLlamada = false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(enLlamada, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		General other = (General) obj;
		return Objects.equals(enLlamada, other.enLlamada) && Objects.equals(numero, other.numero);
	}
	
	
	
}
