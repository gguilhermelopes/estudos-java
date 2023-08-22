package com.dealership.repository;

import com.dealership.domain.acessory.Accessory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AccessoryRepository implements IAccessoryRepository{
    @Override
    public Accessory create(Accessory accessory) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(accessory);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return accessory;
    }
}
