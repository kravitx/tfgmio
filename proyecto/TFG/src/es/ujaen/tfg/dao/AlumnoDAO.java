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
import es.ujaen.tfg.excepciones.AlumnoErrorEliminar;
import es.ujaen.tfg.modelos.Alumno;
import es.ujaen.tfg.modelos.Curso;
import es.ujaen.tfg.modelos.Usuario;
import es.ujaen.tfg.modelos.Matricula;


@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Component
public class AlumnoDAO {
	
	 @PersistenceContext
	    private EntityManager em;

	 
	 public AlumnoDAO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Alumno buscar(int idAlumno) {
	        return em.find(Alumno.class, idAlumno);
	    }
	
    /**
    *
    * @param alumnno
    * @throws AlumnoErrorInsertar
    */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false,
rollbackFor = es.ujaen.tfg.excepciones.AlumnoErrorInsertar.class)
   public void insertar(Alumno alumno) throws AlumnoErrorInsertar {
       try {
           em.persist(alumno);
       } catch (Exception e) {
           throw new AlumnoErrorInsertar();
       }
   }

   /**
    *
    * @param alumno
    * @throws Alu,noErrorActualizar
    */
   
   @Transactional(propagation = Propagation.REQUIRED, readOnly = false,
           rollbackFor = es.ujaen.tfg.excepciones.AlumnoErrorActualizar.class)
   public void actualizar(Alumno alumno) throws AlumnoErrorActualizar {
       try {
           em.merge(alumno);
       } catch (Exception e) {
           throw new AlumnoErrorActualizar();
       }
   }

   /**
    *
    * @param alumno
    * @throws AlumnoErrorEliminar
    */
   @Transactional(propagation = Propagation.REQUIRED, readOnly = false,
           rollbackFor = es.ujaen.tfg.excepciones.AlumnoErrorEliminar.class)
   public void eliminar(Alumno alumno) throws AlumnoErrorEliminar {
       try {
           em.remove(em.contains(alumno) ? alumno : em.merge(alumno));
       } catch (Exception e) {
           throw new AlumnoErrorEliminar();
       }
   }
}
