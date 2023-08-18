package com.hibernate.dao;

import com.hibernate.domain.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProductDAO implements IProductDAO{
    @Override
    public Product create(Product product) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return product;
    }
}
