package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Vendeur;
import com.example.antigaspi1.Dao.Repositories.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VendeurManagerService implements VendeurManager{
    @Autowired
    public VendeurRepository vendeurRepository;

    @Override
    public Optional<Vendeur> getVendeurById(int id) {
        return vendeurRepository.findById(id);
    }

    @Override
    public List<Vendeur> getAllVendeur() {
        return vendeurRepository.findAll();
    }

    @Override
    public Vendeur addVendeur(Vendeur vendeur) {
        return vendeurRepository.save(vendeur);
    }

    @Override
    public Vendeur updateVendeur(Vendeur vendeur) {
        return vendeurRepository.save(vendeur);
    }

    @Override
    public boolean deleteVendeur(Vendeur vendeur) {
        try{
            vendeurRepository.delete(vendeur);
            return true;
        }catch (Exception exception){
            return false;
        }

    }
}
