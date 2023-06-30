package dao;



import domain.Client;
import java.util.Collection;

public interface IClientDAO {
    public boolean signUp(Client client);
    public void delete(Long cpf);
    public void edit (Client client);
    public Client find(Long cpf);
    public Collection<Client> findMany();
}
