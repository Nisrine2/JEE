package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Commande;
import com.example.antigaspi1.Dao.Repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CommandeManagerService implements CommandeManager{

    @Autowired
    private CommandeRepository commandeRepository;
    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Optional<Commande> getCommandeById(int id) {
        return commandeRepository.findById(id);
    }

    @Override
    public List<Commande> getAllCommande() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public boolean deleteCommande(int id) {
        try {
            commandeRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }    }
}
