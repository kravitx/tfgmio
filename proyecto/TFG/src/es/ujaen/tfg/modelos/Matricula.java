package es.ujaen.tfg.modelos;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "matriculas", uniqueConstraints={@UniqueConstraint(columnNames = {"codigoCurso", "codigoAlumno"})})
public class Matricula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3202039906307244345L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigoMatricula;
	
	@ManyToOne (fetch = FetchType.EAGER)
	 @JoinColumn(name="codigoCurso")

	private Curso codigoCurso;
	
	@ManyToOne (fetch = FetchType.EAGER)
	 @JoinColumn(name="CodigoAlumno")

	private Alumno codigoAlumno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaMatricula;
	
	private String provinciaMatricula;
	
	@ManyToOne (fetch = FetchType.EAGER)
	private Usuario registradorMatricula;
	

	public Matricula(Long codigoMatricula, Curso codigoCurso, Alumno codigoAlumno, Date fechaMatricula,
			String provinciaMatricula, Usuario autorMatricula) {
		super();
		this.codigoMatricula = codigoMatricula;
		this.codigoCurso = codigoCurso;
		this.codigoAlumno = codigoAlumno;
		this.fechaMatricula = fechaMatricula;
		this.provinciaMatricula = provinciaMatricula;
		this.registradorMatricula = autorMatricula;
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
		return registradorMatricula;
	}
	public void setAutorMatricula(Usuario autorMatricula) {
		this.registradorMatricula = autorMatricula;
	}
	public Long getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(Long codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	

}
