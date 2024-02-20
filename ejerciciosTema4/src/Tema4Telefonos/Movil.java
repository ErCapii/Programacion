package Tema4Telefonos;

public class Movil extends General{

	private LocalizacionGPS gps;

	public Movil(Integer numero, Integer latitud, Integer longitud) {
		super(numero);
		gps = new LocalizacionGPS(longitud,latitud);
		
	}

	@Override
	public String toString() {
		return "Movil [gps=" + gps + "]";
	}
	
}
