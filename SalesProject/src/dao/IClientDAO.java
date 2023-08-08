package dao;

import domain.Client;

public interface IClientDAO {
    Boolean save(Client client);

    Client cpfSearch(Long cpf);

    void delete(Long cpf);
}
