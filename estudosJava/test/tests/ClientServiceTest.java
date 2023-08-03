package tests;

import org.junit.Assert;
import org.junit.Test;
import tests.dao.ClientDAOMock;
import tests.dao.IClientDAO;
import tests.service.ClientService;

public class ClientServiceTest {

    @Test
    public void saveTest(){
        IClientDAO mock = new ClientDAOMock();
        ClientService service = new ClientService(mock);
        String saveReturn = service.save();

        Assert.assertEquals("Salvo com sucesso!", saveReturn);

    }
}
