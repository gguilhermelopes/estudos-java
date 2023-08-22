package com.hibernate.dao;

import com.hibernate.domain.Computer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ComputerDAO implements IComputerDAO{
    @Override
    public Computer create(Computer computer) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(computer);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return computer;
    }
}
