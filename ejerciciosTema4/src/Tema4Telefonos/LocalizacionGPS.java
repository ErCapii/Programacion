package Tema4Telefonos;

public class LocalizacionGPS {
	
	private Integer latitud;
	private Integer longitud;

	@Override
	public String toString() {
		return "LocalizacionGPS [latitud=" + latitud + ", longitud=" + longitud + "]";
	}

	public LocalizacionGPS(Integer latitud, Integer longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Integer getLatitud() {
		return latitud;
	}

	public void setLatitud(Integer latitud) {
		this.latitud = latitud;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	
	

}
