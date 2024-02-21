package co.edu.uniquindio.model;

import java.util.Objects;

public class DetalleVenta {
	private Integer cantidad;
	private Producto producto;
	
	public DetalleVenta() {
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(Integer cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleVenta other = (DetalleVenta) obj;
		return Objects.equals(cantidad, other.cantidad) && Objects.equals(producto, other.producto);
	}

	@Override
	public String toString() {
		return "DetalleVenta [cantidad=" + cantidad + ", producto=" + producto + "]";
	}
	
	
}
