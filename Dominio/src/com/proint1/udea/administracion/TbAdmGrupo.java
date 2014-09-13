package com.proint1.udea.administracion;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmGrupo generated by hbm2java
 */
public class TbAdmGrupo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbGpoIdn;
	private String vrGpoNumero;
	private String vrGpoHorario;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbActDocentexgrupos = new HashSet(0);
	private Set tbAdmMatriculas = new HashSet(0);
	private Set tbAdmSemestrexcursos = new HashSet(0);

	public TbAdmGrupo() {
	}

	public TbAdmGrupo(long nbGpoIdn, String vrGpoNumero) {
		this.nbGpoIdn = nbGpoIdn;
		this.vrGpoNumero = vrGpoNumero;
	}

	public TbAdmGrupo(long nbGpoIdn, String vrGpoNumero, String vrGpoHorario,
			String vrAdtusuario, Date dtAdtfecha, Set tbActDocentexgrupos,
			Set tbAdmMatriculas, Set tbAdmSemestrexcursos) {
		this.nbGpoIdn = nbGpoIdn;
		this.vrGpoNumero = vrGpoNumero;
		this.vrGpoHorario = vrGpoHorario;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbActDocentexgrupos = tbActDocentexgrupos;
		this.tbAdmMatriculas = tbAdmMatriculas;
		this.tbAdmSemestrexcursos = tbAdmSemestrexcursos;
	}

	public long getNbGpoIdn() {
		return this.nbGpoIdn;
	}

	public void setNbGpoIdn(long nbGpoIdn) {
		this.nbGpoIdn = nbGpoIdn;
	}

	public String getVrGpoNumero() {
		return this.vrGpoNumero;
	}

	public void setVrGpoNumero(String vrGpoNumero) {
		this.vrGpoNumero = vrGpoNumero;
	}

	public String getVrGpoHorario() {
		return this.vrGpoHorario;
	}

	public void setVrGpoHorario(String vrGpoHorario) {
		this.vrGpoHorario = vrGpoHorario;
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

	public Set getTbActDocentexgrupos() {
		return this.tbActDocentexgrupos;
	}

	public void setTbActDocentexgrupos(Set tbActDocentexgrupos) {
		this.tbActDocentexgrupos = tbActDocentexgrupos;
	}

	public Set getTbAdmMatriculas() {
		return this.tbAdmMatriculas;
	}

	public void setTbAdmMatriculas(Set tbAdmMatriculas) {
		this.tbAdmMatriculas = tbAdmMatriculas;
	}

	public Set getTbAdmSemestrexcursos() {
		return this.tbAdmSemestrexcursos;
	}

	public void setTbAdmSemestrexcursos(Set tbAdmSemestrexcursos) {
		this.tbAdmSemestrexcursos = tbAdmSemestrexcursos;
	}

}
