// default package
// Generated 18/05/2014 10:37:10 PM by Hibernate Tools 3.4.0.CR1

/**
 * TbAdmPropiedades generated by hbm2java
 */
public class TbAdmPropiedades implements java.io.Serializable {

	private TbAdmPropiedadesId id;
	private TbAdmDependenciaAcademica tbAdmDependenciaAcademica;
	private String vrPrpCodigo;

	public TbAdmPropiedades() {
	}

	public TbAdmPropiedades(TbAdmPropiedadesId id,
			TbAdmDependenciaAcademica tbAdmDependenciaAcademica,
			String vrPrpCodigo) {
		this.id = id;
		this.tbAdmDependenciaAcademica = tbAdmDependenciaAcademica;
		this.vrPrpCodigo = vrPrpCodigo;
	}

	public TbAdmPropiedadesId getId() {
		return this.id;
	}

	public void setId(TbAdmPropiedadesId id) {
		this.id = id;
	}

	public TbAdmDependenciaAcademica getTbAdmDependenciaAcademica() {
		return this.tbAdmDependenciaAcademica;
	}

	public void setTbAdmDependenciaAcademica(
			TbAdmDependenciaAcademica tbAdmDependenciaAcademica) {
		this.tbAdmDependenciaAcademica = tbAdmDependenciaAcademica;
	}

	public String getVrPrpCodigo() {
		return this.vrPrpCodigo;
	}

	public void setVrPrpCodigo(String vrPrpCodigo) {
		this.vrPrpCodigo = vrPrpCodigo;
	}

}
