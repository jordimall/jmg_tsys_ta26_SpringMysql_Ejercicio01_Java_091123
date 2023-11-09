/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

/**
 * 
 */
public interface ISuministraService {

	public List<Suministra> getAll() ;

	public Suministra getId(int codigoPieza, String idProveedor);

	public Suministra add(Suministra suministra);

	public Suministra update(Suministra suministra);

	public void delete(int codigoPieza, String idProveedor);


}
