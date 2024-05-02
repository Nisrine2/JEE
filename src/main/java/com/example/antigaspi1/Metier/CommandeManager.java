package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Commande;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommandeManager {
    public Commande addCommande(Commande commande);
    public Optional<Commande> getCommandeById(int id);
    public List<Commande> getAllCommande();
    public Commande updateCommande(Commande commande);
    public boolean deleteCommande(int id);


}
