package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernate.dao.UsuarioDAO;
import com.example.hibernate.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> getAll() {
        return usuarioDAO.getAll();
        
    }

    @Override
    public Usuario getUserById(long id) {
        return usuarioDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(Usuario usuario) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

        usuarioDAO.saveUser(usuario);
    }

    @Override
    @Transactional
    public boolean deleteById(long id) {
        return usuarioDAO.deleteById(id);
    }
    
}
