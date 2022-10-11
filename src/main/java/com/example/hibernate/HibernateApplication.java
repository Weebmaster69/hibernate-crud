package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hibernate.model.Usuario;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {

		
		SpringApplication.run(HibernateApplication.class, args);
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
		addAnnotatedClass(Usuario.class).buildSessionFactory();
        Session miSession = miFactory.openSession();

        try{
            Usuario usuario1;
            usuario1 = Usuario.builder().nombre("Gonzalo").direcion("prueba 123").email("asd@asd").build();
            miSession.beginTransaction();
            miSession.save(usuario1);
            miSession.getTransaction().commit();
            miSession.close();
        }finally {
            miSession.close();

        }
	}

}
