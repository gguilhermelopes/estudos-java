import dao.ClientDAOMock;
import dao.IClientDAO;
import domain.Client;
import org.junit.Assert;
import org.junit.Test;
import services.ClientService;
import services.IClientService;

public class ClientTest {

    private IClientService clientService;

    public  ClientTest(){
        IClientDAO dao = new ClientDAOMock();
        clientService = new ClientService(dao);
    }


    @Test
    public void searchClient(){
        Client client = new Client();
        client.setCpf(12345678901L);
        client.setName("Guilherme");
        client.setCity("Jundiaí");
        client.setState("SP");
        client.setAddress("Endereço");
        client.setNumber(123);
        client.setPhone(123456L);

        clientService.save(client);

        Client currentClient = clientService.cpfSearch(client.getCpf());

        Assert.assertNotNull(currentClient);
    }
}
