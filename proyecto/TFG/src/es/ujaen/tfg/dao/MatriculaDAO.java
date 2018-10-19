package es.ujaen.tfg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import es.ujaen.tfg.excepciones.AlumnoErrorActualizar;
import es.ujaen.tfg.excepciones.AlumnoErrorInsertar;
import es.ujaen.tfg.excepciones.MatriculaErrorActualizar;
import es.ujaen.tfg.excepciones.MatriculaErrorEliminar;
import es.ujaen.tfg.excepciones.MatriculaErrorInsertar;
import es.ujaen.tfg.excepciones.UsuarioErrorEliminar;
import es.ujaen.tfg.excepciones.AlumnoErrorEliminar;
import es.ujaen.tfg.modelos.Alumno;
import es.ujaen.tfg.modelos.Curso;
import es.ujaen.tfg.modelos.Usuario;
import es.ujaen.tfg.modelos.Matricula;


@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Component
public class MatriculaDAO {
	
	@PersistenceContext
    private EntityManager em;

	public MatriculaDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Matricula buscar(int idMatricula) {
        return em.find(Matricula.class, idMatricula);
    }
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
			   public void insertar(Matricula ma) throws MatriculaErrorInsertar {
			       try {
			           em.persist(ma);
			       } catch (Exception e) {
			           throw new MatriculaErrorInsertar();
			       }
			   }

			   /**
			    *
			    * @param alumno
			    * @throws Alu,noErrorActualizar
			    */
			   
			   @Transactional(propagation = Propagation.REQUIRED, readOnly = false,
			           rollbackFor = es.ujaen.tfg.excepciones.MatriculaErrorActualizar.class)
			   public void actualizar(Matricula ma) throws MatriculaErrorActualizar {
			       try {
			           em.merge(ma);
			       } catch (Exception e) {
			           throw new MatriculaErrorActualizar();
			       }
			   }
			   
			   @Transactional(propagation = Propagation.REQUIRED, readOnly = false,
			           rollbackFor = es.ujaen.tfg.excepciones.MatriculaErrorEliminar.class)
			   
			   public void eliminar(Matricula ma) throws MatriculaErrorEliminar {
			        try {
			            em.remove(em.contains(ma) ? ma : em.merge(ma));
			        } catch (Exception e) {
			            throw new MatriculaErrorEliminar();
			        }
			    }
			       

}
			   
			   
			   
			   
