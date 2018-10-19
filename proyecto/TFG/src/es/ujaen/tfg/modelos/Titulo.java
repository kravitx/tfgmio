package es.ujaen.tfg.modelos;

import java.io.Serializable;
import java.sql.Date;

public class Titulo implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9025180753713032746L;

	private Long idTitulo;
	
	private String numeroTitulo; 
	
	private Curso cursoT;
	
	private Alumno alumnoT;
	
	private Date fechaExpedicionT;
	
	private Usuario registradorT;
	
	private String textoTitulo;
	
	private boolean tituloRecogido;
	
	private Date fechaRecogidaT;
	
	private String personaRecogidaT;

	private String observacionesTitulo;
	
	

	public Titulo(Long idTitulo, String numeroTitulo, Curso cursoT, Alumno alumnoT, Date fechaExpedicionT,
			Usuario registradorT, String textoTitulo, boolean recogidaTitulo, Date fechaRecogidaT,
			String personaRecogidaT, String observacionesTitulo) {
		super();
		this.idTitulo = idTitulo;
		this.numeroTitulo = numeroTitulo;
		this.cursoT = cursoT;
		this.alumnoT = alumnoT;
		this.fechaExpedicionT = fechaExpedicionT;
		this.registradorT = registradorT;
		this.textoTitulo = textoTitulo;
		this.tituloRecogido = recogidaTitulo;
		this.fechaRecogidaT = fechaRecogidaT;
		this.personaRecogidaT = personaRecogidaT;
		this.observacionesTitulo = observacionesTitulo;
	}

	public Long getIdTitulo() {
		return idTitulo;
	}

	public void setIdTitulo(Long idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public Curso getCursoT() {
		return cursoT;
	}

	public void setCursoT(Curso cursoT) {
		this.cursoT = cursoT;
	}

	public Alumno getAlumnoT() {
		return alumnoT;
	}

	public void setAlumnoT(Alumno alumnoT) {
		this.alumnoT = alumnoT;
	}

	public Date getFechaExpedicionT() {
		return fechaExpedicionT;
	}

	public void setFechaExpedicionT(Date fechaExpedicionT) {
		this.fechaExpedicionT = fechaExpedicionT;
	}

	public Usuario getRegistradorT() {
		return registradorT;
	}

	public void setRegistradorT(Usuario registradorT) {
		this.registradorT = registradorT;
	}

	public String getTextoTitulo() {
		return textoTitulo;
	}

	public void setTextoTitulo(String textoTitulo) {
		this.textoTitulo = textoTitulo;
	}

	public boolean isRecogidaTitulo() {
		return tituloRecogido;
	}

	public void setRecogidaTitulo(boolean recogidaTitulo) {
		this.tituloRecogido = recogidaTitulo;
	}

	public Date getFechaRecogidaT() {
		return fechaRecogidaT;
	}

	public void setFechaRecogidaT(Date fechaRecogidaT) {
		this.fechaRecogidaT = fechaRecogidaT;
	}

	public String getPersonaRecogidaT() {
		return personaRecogidaT;
	}

	public void setPersonaRecogidaT(String personaRecogidaT) {
		this.personaRecogidaT = personaRecogidaT;
	}

	public String getObservacionesTitulo() {
		return observacionesTitulo;
	}

	public void setObservacionesTitulo(String observacionesTitulo) {
		this.observacionesTitulo = observacionesTitulo;
	}
	

}
