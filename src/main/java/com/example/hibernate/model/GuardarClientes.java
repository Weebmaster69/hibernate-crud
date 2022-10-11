package com.example.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GuardarClientes {
    
    // public static void main(String[] args) {
	// 	SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
	// 	addAnnotatedClass(Usuario.class).buildSessionFactory();
    //     Session miSession = miFactory.openSession();

    //     try{
    //         Usuario usuario1;
    //         usuario1 = Usuario.builder().nombre("Gonzalo").direcion("prueba 123").email("asd@asd").build();
    //         miSession.beginTransaction();
    //         miSession.save(usuario1);
    //         miSession.getTransaction().commit();
    //         miSession.close();
    //     }finally {
    //         miSession.close();

    //     }
    // }
}
