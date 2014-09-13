package com.proint1.udea.administracion;

// default package
// Generated 18/05/2014 06:35:43 PM by Hibernate Tools 3.4.0.CR1

/**
 * TbAdmDocentesxdependencia generated by hbm2java
 */
public class TbAdmDocentesxdependencia implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long nbDpdIdn;
	private TbAdmDocente tbAdmDocente;
	private TbAdmDependenciaAcademica tbAdmDependenciaAcademica;
	private String vrDpdTipovinculacion;

	public TbAdmDocentesxdependencia() {
	}

	public TbAdmDocentesxdependencia(long nbDpdIdn, TbAdmDocente tbAdmDocente,
			TbAdmDependenciaAcademica tbAdmDependenciaAcademica) {
		this.nbDpdIdn = nbDpdIdn;
		this.tbAdmDocente = tbAdmDocente;
		this.tbAdmDependenciaAcademica = tbAdmDependenciaAcademica;
	}

	public TbAdmDocentesxdependencia(long nbDpdIdn, TbAdmDocente tbAdmDocente,
			TbAdmDependenciaAcademica tbAdmDependenciaAcademica,
			String vrDpdTipovinculacion) {
		this.nbDpdIdn = nbDpdIdn;
		this.tbAdmDocente = tbAdmDocente;
		this.tbAdmDependenciaAcademica = tbAdmDependenciaAcademica;
		this.vrDpdTipovinculacion = vrDpdTipovinculacion;
	}

	public long getNbDpdIdn() {
		return this.nbDpdIdn;
	}

	public void setNbDpdIdn(long nbDpdIdn) {
		this.nbDpdIdn = nbDpdIdn;
	}

	public TbAdmDocente getTbAdmDocente() {
		return this.tbAdmDocente;
	}

	public void setTbAdmDocente(TbAdmDocente tbAdmDocente) {
		this.tbAdmDocente = tbAdmDocente;
	}

	public TbAdmDependenciaAcademica getTbAdmDependenciaAcademica() {
		return this.tbAdmDependenciaAcademica;
	}

	public void setTbAdmDependenciaAcademica(
			TbAdmDependenciaAcademica tbAdmDependenciaAcademica) {
		this.tbAdmDependenciaAcademica = tbAdmDependenciaAcademica;
	}

	public String getVrDpdTipovinculacion() {
		return this.vrDpdTipovinculacion;
	}

	public void setVrDpdTipovinculacion(String vrDpdTipovinculacion) {
		this.vrDpdTipovinculacion = vrDpdTipovinculacion;
	}

}
