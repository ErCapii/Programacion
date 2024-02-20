package Tema4VideoJuego;


public abstract class  Personaje {
	private String nombre;
	private String codigo;
	protected Integer vida;
	protected Integer daño;
	protected Integer dañoXSegundo;
	
	

	public Personaje(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public Integer getVida() {
		return vida;
	}
	protected void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getDaño() {
		return daño;
	}
	protected void setDaño(Integer daño) {
		this.daño = daño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDañoXSegundo() {
		if(dañoXSegundo==1) {
			return dañoXSegundo + " segundo";
		}
		return dañoXSegundo + " segundo";
		
	}

	protected void setDañoXSegundo(Integer dañoXSegundo) {
		this.dañoXSegundo = dañoXSegundo;
	}

	@Override
	public String toString() {
		return nombre + " codigo " + codigo;
	} 
	
}
