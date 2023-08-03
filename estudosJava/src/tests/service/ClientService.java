package tests.service;

import tests.dao.ClientDAO;
import tests.dao.IClientDAO;

public class ClientService {
    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }
    public String save(){
        clientDAO.save();
        return "Salvo com sucesso!";
    }
}
