package com.example.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernate.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    // @Autowired
    // private SessionFactory sessionFactory;
    
    // @Autowired
    // private EntityManager entityManager;

	// public UsuarioDAOImpl(EntityManager theEntityManager) {
	// 	entityManager = theEntityManager;
	// }

    @Override
    @Transactional
    public List<Usuario> getAll() {
		// Session miSession = sessionFactory.openSession();
        // Session currentSession = entityManager.unwrap(Session.class);

        // Query<Usuario> theQuery =
		// 		currentSession.createQuery("from usuario", Usuario.class);
        // List<Usuario> usuarios = theQuery.getResultList();
		// List<Usuario> usuarioList = miSession.createQuery("from Usuario").list();
		
		// return usuarioList;
        return null;
    }

    @Override
    public Usuario getUserById(long id) {
		// return (Usuario) sessionFactory.getCurrentSession().load(Usuario.class, id);
        return null;
    }

    @Override
    public void saveUser(Usuario usuario) throws SecurityException, IllegalStateException, RollbackException,
            HeuristicMixedException, HeuristicRollbackException, SystemException {
                // sessionFactory.getCurrentSession().save(usuario);
        
    }

    @Override
    public boolean deleteById(long id) {
        try{

            // Session session = this.sessionFactory.getCurrentSession();
            // Usuario usuario = (Usuario) session.load(Usuario.class, id);
			// session.delete(usuario);

            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
}
