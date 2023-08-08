package dao;

import domain.Client;

public interface IClientDAO {
    void save(Client client);

    Client cpfSearch(Long cpf);

}
