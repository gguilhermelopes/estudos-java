package services;

import domain.Client;

public interface IClientService {

    void save(Client client);

    Client cpfSearch(Long cpf);
}
