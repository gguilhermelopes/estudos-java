package services;

import dao.ClientDAO;
import dao.IClientDAO;
import domain.Client;

public class ClientService implements IClientService {
    private IClientDAO clientDAO;
    public ClientService(IClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }
    @Override
    public Boolean save(Client client) {
        return clientDAO.save(client);
    }

    @Override
    public Client cpfSearch(Long cpf) {
        return clientDAO.cpfSearch(cpf);
    }

    @Override
    public void delete(Long cpf) {

    }
}
