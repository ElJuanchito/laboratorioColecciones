package co.edu.uniquindio.model;

import java.util.Objects;
import java.util.Set;

public class Venta {
	private String codigo;
	private Set<DetalleVenta> detalles;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(String codigo, Set<DetalleVenta> detalles) {
		super();
		this.codigo = codigo;
		this.detalles = detalles;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Set<DetalleVenta> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetalleVenta> detalles) {
		this.detalles = detalles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Venta [codigo=" + codigo + ", detalles=" + detalles + "]";
	}
	
	
}
