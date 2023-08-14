import dao.ClientDAO;
import dao.IClientDAO;
import domain.Client;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void registerTest() throws SQLException {
        // Instancia um novo ClientDAO com os métodos de CRUD no DB e uma classe de domínio Client
        IClientDAO clientDAO = new ClientDAO();
        Client client = new Client();
        client.setCode("01");
        client.setName("Guilherme");

        // Utiliza o método register que retorna um Integer e testa se ele retorna 1
        Integer registerReturn = clientDAO.register(client);
        assertTrue(registerReturn == 1);


        // Utiliza o método search, verifica se o clientDB não é null e se tem as propriedades iguais às
        // determinadas no domínio
        Client clientDB = clientDAO.search(client.getCode());
        assertNotNull(clientDB);
        assertNotNull(clientDB.getId());
        assertEquals(client.getCode(), clientDB.getCode());
        assertEquals(client.getName(), clientDB.getName());

        // Utiliza o metodo delete para o testar e manter o DB limpo
        Integer deleteReturn = clientDAO.delete(clientDB);
        assertNotNull(deleteReturn == 1);
    }
}
