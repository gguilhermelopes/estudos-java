package dao;

import domain.Client;

public class ClientDAOMock implements IClientDAO {
    @Override
    public Boolean save(Client client) {
        return true;
    }

    @Override
    public Client cpfSearch(Long cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }

    @Override
    public void delete(Long cpf) {

    }
}
