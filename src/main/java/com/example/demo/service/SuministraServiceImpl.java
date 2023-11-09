/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ISuministraDAO;
import com.example.demo.dto.Suministra;

/**
 * 
 */
public class SuministraServiceImpl {
	@Autowired
	private ISuministraDAO daoSuministra;

	public List<Suministra> getAll() {
		return daoSuministra.findAll();
	}

	public Suministra getId(int codigoPieza, String idProveedor) {
		return daoSuministra.findByCodigoPiezaAndIdProveedor(codigoPieza, idProveedor);
	}

	public Suministra add(Suministra Suministra) {
		return daoSuministra.save(Suministra);
	}

	public Suministra update(Suministra Suministra) {
		return daoSuministra.save(Suministra);
	}

	public void delete(int codigoPieza, String idProveedor) {
		daoSuministra.deleteByCodigoPiezaAndIdProveedor(codigoPieza, idProveedor);
	}

}
