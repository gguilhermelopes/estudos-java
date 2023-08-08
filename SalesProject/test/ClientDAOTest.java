
import dao.ClientDAO;
import dao.ClientDAOMock;
import dao.IClientDAO;
import domain.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientDAOTest {
    private IClientDAO clientDAO;
    private Client client;

    public ClientDAOTest(){
        clientDAO = new ClientDAOMock();
    }

    @Before
    public void init(){
        client = new Client();
        client.setCpf(12345678901L);
        client.setName("Guilherme");
        client.setCity("Jundiaí");
        client.setState("SP");
        client.setAddress("Endereço");
        client.setNumber(123);
        client.setPhone(123456L);

    }

    @Test
    public void searchClient(){
        Client currentClient = clientDAO.cpfSearch(client.getCpf());

        Assert.assertNotNull(currentClient);
    }

    @Test
    public void saveClient(){
        Boolean saveReturn = clientDAO.save(client);

        Assert.assertTrue(saveReturn);
    }

    @Test
    public void deleteClient(){
        clientDAO.delete(client.getCpf());
    }

}
