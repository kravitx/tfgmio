package es.ujaen.tfg.modelos;

import java.io.Serializable;
import java.sql.Date;

public class Matricula implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3202039906307244345L;
	private Long codigoMatricula;
	private Curso codigoCurso;
	private Alumno codigoAlumno;
	private Date fechaMatricula;
	private String provinciaMatricula;
	private Usuario autorMatricula;
	

	public Matricula(Long codigoMatricula, Curso codigoCurso, Alumno codigoAlumno, Date fechaMatricula,
			String provinciaMatricula, Usuario autorMatricula) {
		super();
		this.codigoMatricula = codigoMatricula;
		this.codigoCurso = codigoCurso;
		this.codigoAlumno = codigoAlumno;
		this.fechaMatricula = fechaMatricula;
		this.provinciaMatricula = provinciaMatricula;
		this.autorMatricula = autorMatricula;
	}
	public Curso getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Curso codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public Alumno getCodigoAlumno() {
		return codigoAlumno;
	}
	public void setCodigoAlumno(Alumno codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}
	public Date getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public String getProvinciaMatricula() {
		return provinciaMatricula;
	}
	public void setProvinciaMatricula(String provinciaMatricula) {
		this.provinciaMatricula = provinciaMatricula;
	}
	public Usuario getAutorMatricula() {
		return autorMatricula;
	}
	public void setAutorMatricula(Usuario autorMatricula) {
		this.autorMatricula = autorMatricula;
	}
	public Long getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(Long codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	

}
