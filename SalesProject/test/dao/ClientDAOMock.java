package dao;

import domain.Client;

public class ClientDAOMock implements IClientDAO {
    @Override
    public void save(Client client) {

    }

    @Override
    public Client cpfSearch(Long cpf) {
        Client client = new Client();
        client.setCpf(cpf);
        return client;
    }
}
