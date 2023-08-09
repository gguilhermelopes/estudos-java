import dao.ClientDAOMock;
import dao.IClientDAO;
import domain.Client;
import exception.TypeKeyNotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.ClientService;
import services.IClientService;

public class ClientServiceTest {

    private IClientService clientService;
    private Client client;

    public ClientServiceTest(){
        IClientDAO dao = new ClientDAOMock();
        clientService = new ClientService(dao);
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
        Client currentClient = clientService.cpfSearch(client.getCpf());

        Assert.assertNotNull(currentClient);
    }

    @Test
    public void saveClient() throws TypeKeyNotFoundException {
       Boolean saveReturn = clientService.save(client);

       Assert.assertTrue(saveReturn);
    }

    @Test
    public void deleteClient(){
        clientService.delete(client.getCpf());
    }

    @Test
    public void updateClient() throws TypeKeyNotFoundException {
        client.setName("Buken");
        clientService.update(client);

        Assert.assertEquals("Buken", client.getName());
    }
}
