package Tema4Libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private String direccion;
	private Integer numeroTelefono;
	private List<ArticulosLibreria> libros;
	
	public void addLibreria(ArticulosLibreria articulos) {
		libros.add(articulos);
	}
	
	public ArticulosLibreria obtenerLibroMasAntiguo() {
		return libros.get(libros.size()-1);
	}
	public Integer obtenerPesoTotalDeLibros() {
		Integer peso=0;
		for (int i = 0; i < libros.size(); i++) {
			if(libros.get(i).getTipo().contains("Fisico")){
				
				peso += ((LibroFisico) libros.get(i)).getPeso();
			}
		}
		return peso;
	}
	public Integer NumPaginasMedio() {
		Integer NumPaginasMedio=0;
		Integer paginas=0;
		for (int i = 0; i < libros.size(); i++) {
			paginas += libros.get(i).getNumeroPaginas();
		}
		return NumPaginasMedio  = paginas/libros.size();
	}
	public Libreria(String direccion, Integer numeroTelefono) {
		super();
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
		libros = new ArrayList<ArticulosLibreria>();
	}
	@Override
	public String toString() {
		return "Libreria [direccion=" + direccion + ", numeroTelefono=" + numeroTelefono + "]";
	}
	
}
