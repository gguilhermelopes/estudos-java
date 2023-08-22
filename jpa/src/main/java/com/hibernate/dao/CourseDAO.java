package com.hibernate.dao;

import com.hibernate.domain.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CourseDAO implements ICourseDAO{
    @Override
    public Course create(Course course) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return course;
    }
}
