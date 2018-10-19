package es.ujaen.tfg.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.ujaen.tfg.dao.AlumnoDAO;
import es.ujaen.tfg.dao.CompraDAO;
import es.ujaen.tfg.dao.EntradaDAO;
import es.ujaen.tfg.dao.MatriculaDAO;
import es.ujaen.tfg.dao.UsuarioDAO;
import es.ujaen.tfg.modelos.Alumno;
import es.ujaen.tfg.modelos.Curso;
import es.ujaen.tfg.modelos.Usuario;

@Component

public class ServicioAlumno {
	 	
		@Autowired
	    private AlumnoDAO alumnoDAO;
	    
	  //  @Autowired
	  //  private CursoDAO cursoDAO;
	    
	    @Autowired
	    private MatriculaDAO matriculaDAO;
	    

	public ServicioAlumno() {
		super();
		// TODO Auto-generated constructor stub
	}

}
