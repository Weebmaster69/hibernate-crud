package com.example.hibernate.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.model.Usuario;
import com.example.hibernate.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class HibernateRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAllUser() {
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Usuario getUserById (@PathVariable("id") long id){
        return usuarioService.getUserById(id);
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody Usuario u) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
        usuarioService.saveUser(u);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUserById (@PathVariable("id") long id){

        return usuarioService.deleteById(id);
    }
}
