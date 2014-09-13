package com.proint1.udea.microcurriculo;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbMicActa generated by hbm2java
 */
public class TbMicActa implements java.io.Serializable {

	/**
	 * 
	 */
	private long nbActIdn;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private String vrActContenido;
	private String vrActAsistentes;
	private String vrActOrdendeldia;
	private String vrActDesarrollo;
	private String vrActFirmas;
	private Set tbMicMicrocurriculos = new HashSet(0);

	public TbMicActa() {
	}

	public TbMicActa(long nbActIdn) {
		this.nbActIdn = nbActIdn;
	}

	public TbMicActa(long nbActIdn, String vrAdtusuario, Date dtAdtfecha,
			String vrActContenido, String vrActAsistentes,
			String vrActOrdendeldia, String vrActDesarrollo,
			String vrActFirmas, Set tbMicMicrocurriculos) {
		this.nbActIdn = nbActIdn;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.vrActContenido = vrActContenido;
		this.vrActAsistentes = vrActAsistentes;
		this.vrActOrdendeldia = vrActOrdendeldia;
		this.vrActDesarrollo = vrActDesarrollo;
		this.vrActFirmas = vrActFirmas;
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

	public long getNbActIdn() {
		return this.nbActIdn;
	}

	public void setNbActIdn(long nbActIdn) {
		this.nbActIdn = nbActIdn;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public String getVrActContenido() {
		return this.vrActContenido;
	}

	public void setVrActContenido(String vrActContenido) {
		this.vrActContenido = vrActContenido;
	}

	public String getVrActAsistentes() {
		return this.vrActAsistentes;
	}

	public void setVrActAsistentes(String vrActAsistentes) {
		this.vrActAsistentes = vrActAsistentes;
	}

	public String getVrActOrdendeldia() {
		return this.vrActOrdendeldia;
	}

	public void setVrActOrdendeldia(String vrActOrdendeldia) {
		this.vrActOrdendeldia = vrActOrdendeldia;
	}

	public String getVrActDesarrollo() {
		return this.vrActDesarrollo;
	}

	public void setVrActDesarrollo(String vrActDesarrollo) {
		this.vrActDesarrollo = vrActDesarrollo;
	}

	public String getVrActFirmas() {
		return this.vrActFirmas;
	}

	public void setVrActFirmas(String vrActFirmas) {
		this.vrActFirmas = vrActFirmas;
	}

	public Set getTbMicMicrocurriculos() {
		return this.tbMicMicrocurriculos;
	}

	public void setTbMicMicrocurriculos(Set tbMicMicrocurriculos) {
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

}
