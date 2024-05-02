package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Supermarche;
import com.example.antigaspi1.Dao.Entities.Vendeur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VendeurManager {
    public Optional<Vendeur> getVendeurById(int id);
    public List<Vendeur> getAllVendeur();
    public  Vendeur addVendeur(Vendeur v);
    public Vendeur updateVendeur(Vendeur v);
    public boolean deleteVendeur(Vendeur vendeur);

}
