package com.example.hibernate.dao;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import com.example.hibernate.model.Usuario;

public interface UsuarioDAO {
    public List<Usuario> getAll();

    public Usuario getUserById(long id);

    public void saveUser (Usuario usuario) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
    
    public boolean deleteById (long id);
}
