package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Client;
import com.example.antigaspi1.Dao.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientManagerService implements ClientManager{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> getClientByName(String clientName) {
        return clientRepository.findBynom(clientName);
    }

    @Override
    public Client getClientById(int id) {
        Optional<Client> clientOptional = clientRepository.findById( id);
        return clientOptional.orElse(null);    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public boolean deleteClient(int id) {
        try {
            clientRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}
