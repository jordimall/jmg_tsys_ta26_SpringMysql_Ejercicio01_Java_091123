/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.Pieza;
import com.example.demo.dto.Suministra;

/**
 * 
 */
public interface ISuministraDAO extends JpaRepository<Suministra, Pieza> {
    @Query("SELECT t FROM suministra t WHERE t.codigoPieza = :codigoPieza AND t.idProveedor = :idProveedor")
	Suministra findByCodigoPiezaAndIdProveedor(@Param("codigoPieza") int codigoPieza,
			@Param("idProveedor") String idProveedor);
    
    @Query("DELETE suministra t WHERE t.codigoPieza = :codigoPieza AND t.idProveedor = :idProveedor")
	Suministra deleteByCodigoPiezaAndIdProveedor(@Param("codigoPieza") int codigoPieza,
			@Param("idProveedor") String idProveedor);
}
