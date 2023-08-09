package dao;

import dao.generic.GenericDAO;
import domain.Client;

public class ClientDAO extends GenericDAO<Client> implements IClientDAO {


    @Override
    public Class<Client> getClassType() {
       return Client.class;
    }

    @Override
    public void updateData(Client entity, Client registeredEntity) {

    }
}
