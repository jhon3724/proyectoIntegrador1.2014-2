// default package
// Generated 3/04/2014 05:14:00 PM by Hibernate Tools 3.4.0.CR1
package com.proint1.udea.administracion;
/**
 * Persona generated by hbm2java
 */
public class Persona implements java.io.Serializable {

	private long column2;
	private String vrNombre;
	private String vrApellido;

	public Persona() {
	}

	public Persona(long column2) {
		this.column2 = column2;
	}

	public Persona(long column2, String vrNombre, String vrApellido) {
		this.column2 = column2;
		this.vrNombre = vrNombre;
		this.vrApellido = vrApellido;
	}

	public long getColumn2() {
		return this.column2;
	}

	public void setColumn2(long column2) {
		this.column2 = column2;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public String getVrApellido() {
		return this.vrApellido;
	}

	public void setVrApellido(String vrApellido) {
		this.vrApellido = vrApellido;
	}

}
