package com.proint1.udea.microcurriculo;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbMicEvaluacion generated by hbm2java
 */
public class TbMicEvaluacion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbEvIdn;
	private String vrAdtUsuario;
	private Date dtAdtfecha;
	private String vrEvNombreactividad;
	private Double flEvPorcentaje;
	private Date dtEvFechadeevaluacion;
	private Set tbMicMicrocurriculos = new HashSet(0);

	public TbMicEvaluacion() {
	}

	public TbMicEvaluacion(long nbEvIdn) {
		this.nbEvIdn = nbEvIdn;
	}

	public TbMicEvaluacion(long nbEvIdn, String vrAdtUsuario, Date dtAdtfecha,
			String vrEvNombreactividad, Double flEvPorcentaje,
			Date dtEvFechadeevaluacion, Set tbMicMicrocurriculos) {
		this.nbEvIdn = nbEvIdn;
		this.vrAdtUsuario = vrAdtUsuario;
		this.dtAdtfecha = dtAdtfecha;
		this.vrEvNombreactividad = vrEvNombreactividad;
		this.flEvPorcentaje = flEvPorcentaje;
		this.dtEvFechadeevaluacion = dtEvFechadeevaluacion;
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

	public long getNbEvIdn() {
		return this.nbEvIdn;
	}

	public void setNbEvIdn(long nbEvIdn) {
		this.nbEvIdn = nbEvIdn;
	}

	public String getVrAdtUsuario() {
		return this.vrAdtUsuario;
	}

	public void setVrAdtUsuario(String vrAdtUsuario) {
		this.vrAdtUsuario = vrAdtUsuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public String getVrEvNombreactividad() {
		return this.vrEvNombreactividad;
	}

	public void setVrEvNombreactividad(String vrEvNombreactividad) {
		this.vrEvNombreactividad = vrEvNombreactividad;
	}

	public Double getFlEvPorcentaje() {
		return this.flEvPorcentaje;
	}

	public void setFlEvPorcentaje(Double flEvPorcentaje) {
		this.flEvPorcentaje = flEvPorcentaje;
	}

	public Date getDtEvFechadeevaluacion() {
		return this.dtEvFechadeevaluacion;
	}

	public void setDtEvFechadeevaluacion(Date dtEvFechadeevaluacion) {
		this.dtEvFechadeevaluacion = dtEvFechadeevaluacion;
	}

	public Set getTbMicMicrocurriculos() {
		return this.tbMicMicrocurriculos;
	}

	public void setTbMicMicrocurriculos(Set tbMicMicrocurriculos) {
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

}
