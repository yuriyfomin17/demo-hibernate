package org.nimofy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        var note = new Note();
        note.setBody("MY_HIBER_NOTE");
        note.setPersonId(131);
        note.setVersion(1);
        entityManager.persist(note);
        System.out.println(note);
        entityManager.getTransaction().commit();
    }
}