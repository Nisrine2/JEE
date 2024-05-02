package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Client;
import java.util.List;

public interface ClientManager {

    public Client addClient(Client client);
    public List<Client> getAllClients();
    public List<Client> getClientByName(String clientName);
    public Client getClientById(int id);
    public Client updateClient(Client client);
    public boolean deleteClient(int id);

}
