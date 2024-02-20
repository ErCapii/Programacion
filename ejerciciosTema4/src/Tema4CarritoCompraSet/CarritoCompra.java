package Tema4CarritoCompraSet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarritoCompra {

	private LocalDate fechaInicial;
	private LocalDate fechaActualizada;
	private Clientes cliente;
	private Set<Articulos> articulo;

	public CarritoCompra(Clientes cliente) {
		super();
		this.cliente = cliente;
		fechaInicial = LocalDate.now();
		fechaActualizada = LocalDate.now();
		articulo = new HashSet<Articulos>();
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(LocalDate fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public LocalDate getFechaActualizada() {
		return fechaActualizada;
	}

	public void setFechaActualizada(LocalDate fechaActualizada) {
		this.fechaActualizada = fechaActualizada;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Set<Articulos> getArticulo() {
		return articulo;
	}

	public void setArticulo(Set<Articulos> articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return articulo.size();
	}

	public Integer getTotal() {
		Integer cantidad = 0;

		for (Articulos articulos : articulo) {
			cantidad += articulos.getPrecio();
			
		} 
		return cantidad;
	}

	public Integer getPrecioMedio() {
		if (getCantidad() == 0) {
			return 0;
		}

		return getTotal() / getCantidad();
	}

	public void addArticulo(Articulos articulo) {
		this.articulo.add(articulo);
		actualizarFecha();
	}

	public void borrarArticulo(Articulos objeto) {
		articulo.remove(objeto);
		actualizarFecha();
	}

	public void vaciarCesta() {
		articulo.clear();
		actualizarFecha();
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = fechaActualizada.format(formato);
		return cliente + " articulos de la cesta " + articulo + " total a pagar " + getTotal() + "€ fecha de hoy "
				+ fecha;
	}

	public void actualizarFecha() {
		fechaActualizada = LocalDate.now();
	}

}
