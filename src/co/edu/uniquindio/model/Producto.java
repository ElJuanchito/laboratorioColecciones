package co.edu.uniquindio.model;

import java.util.Objects;

public class Producto {
	private Long codigo;
	private String nombre;
	private Double precio;
	private Integer cantidadInventario;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto(Long codigo, String nombre, Double precio, Integer cantidadInventario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadInventario = cantidadInventario;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidadInventario() {
		return cantidadInventario;
	}

	public void setCantidadInventario(Integer cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
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
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidadInventario="
				+ cantidadInventario + "]";
	}
	
	
	
	
}
