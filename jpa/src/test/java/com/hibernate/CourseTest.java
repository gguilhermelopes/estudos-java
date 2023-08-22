package com.hibernate;

import com.hibernate.dao.CourseDAO;
import com.hibernate.dao.ICourseDAO;
import com.hibernate.domain.Course;
import org.junit.Assert;
import org.junit.Test;

public class CourseTest {
    private ICourseDAO courseDAO;

    public CourseTest(){
        courseDAO = new CourseDAO();
    }
    @Test
    public void create(){
        Course course = new Course();
        course.setCode("A1");
        course.setDescription("Curso de Java e Spring");
        course.setName("Java / Spring");

        Course courseReturn = courseDAO.create(course);
        Assert.assertNotNull(courseReturn);
        Assert.assertNotNull(courseReturn.getId());
    }
}
