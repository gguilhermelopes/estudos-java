package dao;

import domain.Client;

public class ClientDAO implements IClientDAO {
    @Override
    public Boolean save(Client client) {
        return true;
    }

    @Override
    public Client cpfSearch(Long cpf) {
        return null;
    }

    @Override
    public void delete(Long cpf) {

    }
}
