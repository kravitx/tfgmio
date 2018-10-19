package es.ujaen.tfg.modelos;

import java.io.Serializable;
import java.util.Date;



public class Curso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCurso;
	private String nombreCurso;
	private  int numeroPlazas;
	private int numeroHoras;
	private Date fechaInicio;
	private Date fechaFin;
	private Categoria categoriaCurso;
	private String contenidosCurso;
	private boolean cursoCerrado;
	
	public Curso(Long idCurso, String nombreCurso, int numeroPlazas, int numeroHoras, Date fechaInicio, Date fechaFin,
			Categoria categoriaCurso, String contenidosCurso, boolean cursoCerrado) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.numeroPlazas = numeroPlazas;
		this.numeroHoras = numeroHoras;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.categoriaCurso = categoriaCurso;
		this.contenidosCurso = contenidosCurso;
		this.cursoCerrado = cursoCerrado;
	}
	public boolean isCursoFinalizado() {
		return cursoCerrado;
	}
	public void setCursoFinalizado(boolean cursoFinalizado) {
		this.cursoCerrado = cursoFinalizado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Categoria getCategoriaCurso() {
		return categoriaCurso;
	}
	public void setCategoriaCurso(Categoria categoriaCurso) {
		this.categoriaCurso = categoriaCurso;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	public String getContenidosCurso() {
		return contenidosCurso;
	}
	public void setContenidosCurso(String contenidosCurso) {
		this.contenidosCurso = contenidosCurso;
	}
	
	
	

}
