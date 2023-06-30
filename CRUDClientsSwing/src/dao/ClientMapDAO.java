package dao;


import domain.Client;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClientDAO {

    private final Map<Long, Client> map;

    public ClientMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public boolean signUp(Client client) {
       if(this.map.containsKey(client.getCpf())) {
           return false;
       }
       this.map.put(client.getCpf(), client);
       return true;
    }

    @Override
    public void delete(Long cpf) {
        Client existingClient = this.map.get(cpf);

        if(existingClient != null){
            this.map.remove(existingClient.getCpf(), existingClient);
        }

    }

    @Override
    public void edit(Client client) {
        Client existingClient = this.map.get(client.getCpf());
        if(existingClient != null){
            existingClient.setName(client.getName());
            existingClient.setPhone(client.getPhone());
            existingClient.setAddress(client.getAddress());
            existingClient.setNumber(client.getNumber());
            existingClient.setCity(client.getCity());
            existingClient.setState(client.getState());
        }

    }

    @Override
    public Client find(Long cpf) {
       return this.map.get(cpf);
    }

    @Override
    public Collection<Client> findMany() {
        return this.map.values();
    }
}
