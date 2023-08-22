package com.dealership.repository;

import com.dealership.domain.manufacturer.Manufacturer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManufacturerRepository implements IManufacturerRepository{
    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(manufacturer);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return manufacturer;
    }
}
