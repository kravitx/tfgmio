
package es.ujaen.tfg.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "alumnos", uniqueConstraints={@UniqueConstraint(columnNames={"usuario"})})

public class Alumno implements Serializable {

    private static final long serialVersionUID = -4902489849565351070L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAlumno;
    @NotEmpty
    @Column(unique=true, nullable=false) 
    private String dni;
    private String nombre;

    private String apellidos;
    private String direccion;
    @NotEmpty
    @Size(min = 2, max = 25)
    private String ciudad;
    @NotEmpty
    @Email
    private String correo;
    private String telefono;
    @NotEmpty
    @Column(unique=true, nullable=false) 
    private String usuario;
   
    @NotEmpty
    private String clave;

    public String getApellidos() {
	return apellidos;
    }

    public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getTelefono() {
	return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

}
