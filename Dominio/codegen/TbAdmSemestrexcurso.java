// default package
// Generated 17/05/2014 11:01:34 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmSemestrexcurso generated by hbm2java
 */
public class TbAdmSemestrexcurso implements java.io.Serializable {

	private long nbScuIdn;
	private long nbSemIdn;
	private long nbGruIdn;
	private long nbCurIdn;
	private long nbMcuIdn;
	private Set tbMicMicrocurriculos = new HashSet(0);

	public TbAdmSemestrexcurso() {
	}

	public TbAdmSemestrexcurso(long nbScuIdn, long nbSemIdn, long nbGruIdn,
			long nbCurIdn, long nbMcuIdn) {
		this.nbScuIdn = nbScuIdn;
		this.nbSemIdn = nbSemIdn;
		this.nbGruIdn = nbGruIdn;
		this.nbCurIdn = nbCurIdn;
		this.nbMcuIdn = nbMcuIdn;
	}

	public TbAdmSemestrexcurso(long nbScuIdn, long nbSemIdn, long nbGruIdn,
			long nbCurIdn, long nbMcuIdn, Set tbMicMicrocurriculos) {
		this.nbScuIdn = nbScuIdn;
		this.nbSemIdn = nbSemIdn;
		this.nbGruIdn = nbGruIdn;
		this.nbCurIdn = nbCurIdn;
		this.nbMcuIdn = nbMcuIdn;
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

	public long getNbScuIdn() {
		return this.nbScuIdn;
	}

	public void setNbScuIdn(long nbScuIdn) {
		this.nbScuIdn = nbScuIdn;
	}

	public long getNbSemIdn() {
		return this.nbSemIdn;
	}

	public void setNbSemIdn(long nbSemIdn) {
		this.nbSemIdn = nbSemIdn;
	}

	public long getNbGruIdn() {
		return this.nbGruIdn;
	}

	public void setNbGruIdn(long nbGruIdn) {
		this.nbGruIdn = nbGruIdn;
	}

	public long getNbCurIdn() {
		return this.nbCurIdn;
	}

	public void setNbCurIdn(long nbCurIdn) {
		this.nbCurIdn = nbCurIdn;
	}

	public long getNbMcuIdn() {
		return this.nbMcuIdn;
	}

	public void setNbMcuIdn(long nbMcuIdn) {
		this.nbMcuIdn = nbMcuIdn;
	}

	public Set getTbMicMicrocurriculos() {
		return this.tbMicMicrocurriculos;
	}

	public void setTbMicMicrocurriculos(Set tbMicMicrocurriculos) {
		this.tbMicMicrocurriculos = tbMicMicrocurriculos;
	}

}
