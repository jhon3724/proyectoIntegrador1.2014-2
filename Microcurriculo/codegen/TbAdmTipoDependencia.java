// default package
// Generated 18/05/2014 10:37:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmTipoDependencia generated by hbm2java
 */
public class TbAdmTipoDependencia implements java.io.Serializable {

	private String vrTdpCodigo;
	private String vrTdpNombre;
	private Set tbAdmDependenciaAcademicas = new HashSet(0);

	public TbAdmTipoDependencia() {
	}

	public TbAdmTipoDependencia(String vrTdpCodigo, String vrTdpNombre) {
		this.vrTdpCodigo = vrTdpCodigo;
		this.vrTdpNombre = vrTdpNombre;
	}

	public TbAdmTipoDependencia(String vrTdpCodigo, String vrTdpNombre,
			Set tbAdmDependenciaAcademicas) {
		this.vrTdpCodigo = vrTdpCodigo;
		this.vrTdpNombre = vrTdpNombre;
		this.tbAdmDependenciaAcademicas = tbAdmDependenciaAcademicas;
	}

	public String getVrTdpCodigo() {
		return this.vrTdpCodigo;
	}

	public void setVrTdpCodigo(String vrTdpCodigo) {
		this.vrTdpCodigo = vrTdpCodigo;
	}

	public String getVrTdpNombre() {
		return this.vrTdpNombre;
	}

	public void setVrTdpNombre(String vrTdpNombre) {
		this.vrTdpNombre = vrTdpNombre;
	}

	public Set getTbAdmDependenciaAcademicas() {
		return this.tbAdmDependenciaAcademicas;
	}

	public void setTbAdmDependenciaAcademicas(Set tbAdmDependenciaAcademicas) {
		this.tbAdmDependenciaAcademicas = tbAdmDependenciaAcademicas;
	}

}