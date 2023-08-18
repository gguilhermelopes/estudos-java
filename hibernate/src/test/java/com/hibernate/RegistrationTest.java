package com.hibernate;

import com.hibernate.dao.IRegistrationDAO;
import com.hibernate.dao.RegistrationDAO;
import com.hibernate.domain.Registration;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class RegistrationTest {
    private IRegistrationDAO registrationDAO;

    public RegistrationTest(){
        registrationDAO = new RegistrationDAO();
    }
    @Test
    public void create(){
        Registration registration = new Registration();
        registration.setCode("B1");
        registration.setValue(1500D);
        registration.setDate(Instant.now());
        registration.setStatus("Ativo");

        Registration registrationReturn = registrationDAO.create(registration);
        Assert.assertNotNull(registrationReturn);
        Assert.assertNotNull(registrationReturn.getId());


    }
}
