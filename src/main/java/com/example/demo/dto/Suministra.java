/**
 * 
 */
package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "suministra")
public class Suministra {

	@Id
	@ManyToOne
	@Column(name = "CodigoPieza")
	private Pieza codigoPieza;

	@Id
	@ManyToOne
	@Column(name = "IdProveedor")
	private Proveedor idProveedor;

	@Column(name = "Precio")
	private int precio;

	/**
	 * 
	 */
	public Suministra() {
	}

	/**
	 * @param codigoPieza
	 * @param idProveedor
	 * @param precio
	 */
	public Suministra(Pieza codigoPieza, Proveedor idProveedor, int precio) {
		this.codigoPieza = codigoPieza;
		this.idProveedor = idProveedor;
		this.precio = precio;
	}

	/**
	 * @return the codigoPieza
	 */
	public Pieza getCodigoPieza() {
		return codigoPieza;
	}

	/**
	 * @return the idProveedor
	 */
	public Proveedor getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param codigoPieza the codigoPieza to set
	 */
	public void setCodigoPieza(Pieza codigoPieza) {
		this.codigoPieza = codigoPieza;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
