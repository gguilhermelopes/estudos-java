package services;

import domain.Client;

public interface IClientService {

    Boolean save(Client client);

    Client cpfSearch(Long cpf);

    void delete(Long cpf);
}
