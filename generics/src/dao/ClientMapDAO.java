package dao;

import dao.generic.GenericDAO;
import domain.Client;



public class ClientMapDAO extends GenericDAO<Client> implements IClientDAO {

    public ClientMapDAO(){
        super();
    }

    @Override
    public void editData(Client newClient, Client client) {
        client.setName(newClient.getName());
        client.setPhone(newClient.getPhone());
        client.setAddress(newClient.getAddress());
        client.setNumber(newClient.getNumber());
        client.setCity(newClient.getCity());
        client.setState(newClient.getState());
    }


    @Override
    public Class<Client> getClassType() {
        return Client.class;
    }

}
