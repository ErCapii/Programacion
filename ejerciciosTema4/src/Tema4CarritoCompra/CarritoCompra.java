package Tema4CarritoCompra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private LocalDate fechaInicial;
	private LocalDate fechaActualizada;
	private Clientes cliente;
	private List<Articulos> articulo;

	public CarritoCompra(Clientes cliente) {
		super();
		this.cliente = cliente;
		fechaInicial = LocalDate.now();
		fechaActualizada = LocalDate.now();
		articulo = new ArrayList<Articulos>();
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

	public List<Articulos> getArticulo() {
		return articulo;
	}

	public void setArticulo(List<Articulos> articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return articulo.size();
	}

	public Integer getTotal() {
		Integer cantidad = 0;

		for (int i = 0; i < articulo.size(); i++) {
			cantidad += articulo.get(i).getPrecio();
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

	public void borrarArticulo(int posicion) {
		articulo.remove(posicion);
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
