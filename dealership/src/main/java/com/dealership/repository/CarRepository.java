package com.dealership.repository;

import com.dealership.domain.car.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarRepository implements ICarRepository{
    @Override
    public Car create(Car car) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return car;
    }
}
