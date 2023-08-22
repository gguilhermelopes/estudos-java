package com.hibernate.dao;

import com.hibernate.domain.Registration;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RegistrationDAO implements IRegistrationDAO {
    @Override
    public Registration create(Registration registration) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(registration);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return registration;
    }
}
