package services;


import dao.IClientDAO;
import domain.Client;
import exception.TypeKeyNotFoundException;

public class ClientService implements IClientService {
    private IClientDAO clientDAO;
    public ClientService(IClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }
    @Override
    public Boolean save(Client client) throws TypeKeyNotFoundException {
        return clientDAO.save(client);
    }

    @Override
    public Client cpfSearch(Long cpf) {
        return clientDAO.search(cpf);
    }

    @Override
    public void delete(Long cpf) {
        clientDAO.delete(cpf);
    }

    @Override
    public void update(Client client) throws TypeKeyNotFoundException {
        clientDAO.update(client);
    }
}
