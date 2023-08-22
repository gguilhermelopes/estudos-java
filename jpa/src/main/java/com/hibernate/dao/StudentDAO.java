package com.hibernate.dao;

import com.hibernate.domain.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentDAO implements IStudentDAO {

    @Override
    public Student create(Student student) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return student;
    }
}
