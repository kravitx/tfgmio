package es.ujaen.tfg.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//asignatmos tabla

@Entity
@Table(name = "categorias", uniqueConstraints={@UniqueConstraint(columnNames={"nombreCategoria"})})
public class Categoria implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategoria;
    @NotEmpty
    private String nombreCategoria;

    public Categoria(Long idCategoria, String nombreCategoria) {
	super();
	this.idCategoria = idCategoria;
	this.nombreCategoria = nombreCategoria;
    }

    public Long getIdCategoria() {
	return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
	this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
	return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
	this.nombreCategoria = nombreCategoria;
    }

}
