package com.hibernate;

import com.hibernate.dao.*;
import com.hibernate.domain.Course;
import com.hibernate.domain.Registration;
import com.hibernate.domain.Student;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class RegistrationTest {
    private IRegistrationDAO registrationDAO;
    private ICourseDAO courseDAO;
    private IStudentDAO studentDAO;

    public RegistrationTest(){

        registrationDAO = new RegistrationDAO();
        courseDAO = new CourseDAO();
        studentDAO = new StudentDAO();
    }
    @Test
    public void create(){
        Course course = createCourse("C1");
        Student student = createStudent("S1");
        Registration registration = new Registration();
        registration.setCode("R1");
        registration.setValue(1500D);
        registration.setDate(Instant.now());
        registration.setStatus("Ativo");
        registration.setCourse(course);
        registration.setStudent(student);

        Registration registrationReturn = registrationDAO.create(registration);
        Assert.assertNotNull(registrationReturn);
        Assert.assertNotNull(registrationReturn.getId());

    }
    private Course createCourse(String code){
        Course course = new Course();
        course.setCode(code);
        course.setDescription("Curso de Java e Spring");
        course.setName("Java / Spring");

        return courseDAO.create(course);
    }

    private Student createStudent(String code){
        Student student = new Student();
        student.setCode(code);
        student.setName("Guilherme");

        return studentDAO.create(student);
    }
}
