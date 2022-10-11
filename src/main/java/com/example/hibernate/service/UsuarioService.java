package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import com.example.hibernate.model.Usuario;

public interface UsuarioService {

    public List<Usuario> getAll();

    public Usuario getUserById(long id);

    public void saveUser (Usuario usuario) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException;
    
    public boolean deleteById (long id);
    
}
