package services;

import domain.Client;
import exception.TypeKeyNotFoundException;

public interface IClientService {

    Boolean save(Client client) throws TypeKeyNotFoundException;

    Client cpfSearch(Long cpf);

    void delete(Long cpf);

    void update(Client client) throws TypeKeyNotFoundException;
}
