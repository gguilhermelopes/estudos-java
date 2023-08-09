package dao;

import domain.Client;
import exception.TypeKeyNotFoundException;

import java.util.Collection;

public class ClientDAOMock implements IClientDAO {


    @Override
    public Boolean save(Client entity) throws TypeKeyNotFoundException {
        return true;
    }

    @Override
    public void delete(Long value) {

    }

    @Override
    public void update(Client entity) throws TypeKeyNotFoundException {

    }

    @Override
    public Client search(Long value) {
        Client client = new Client();
        client.setCpf(value);
        return client;
    }

    @Override
    public Collection<Client> searchAll() {
        return null;
    }
}
