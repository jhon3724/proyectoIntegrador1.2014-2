package com.proint1.udea.produccion;

import com.proint1.udea.administracion.TbAdmPersona;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

/**
 * TbPrdMiembrosxgrupo generated by hbm2java
 */
public class TbPrdMiembrosxgrupo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbMieIdn;
	private TbAdmPersona tbAdmPersona;
	private TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion;

	public TbPrdMiembrosxgrupo() {
	}

	public TbPrdMiembrosxgrupo(long nbMieIdn, TbAdmPersona tbAdmPersona,
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion) {
		this.nbMieIdn = nbMieIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
	}

	public long getNbMieIdn() {
		return this.nbMieIdn;
	}

	public void setNbMieIdn(long nbMieIdn) {
		this.nbMieIdn = nbMieIdn;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public TbPrdGrupoinvestigacion getTbPrdGrupoinvestigacion() {
		return this.tbPrdGrupoinvestigacion;
	}

	public void setTbPrdGrupoinvestigacion(
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion) {
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
	}

}