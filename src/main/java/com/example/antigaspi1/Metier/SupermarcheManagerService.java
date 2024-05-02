package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Supermarche;
import com.example.antigaspi1.Dao.Repositories.SupermarcheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SupermarcheManagerService implements SupermarcheManager {
    @Autowired
    public SupermarcheRepository supermarcheRepository;

    @Override
    public Optional<Supermarche> getSupermarcheById(int id) {
        return supermarcheRepository.findById(id);    }

    @Override
    public Supermarche getSupermarcheByName(String name) {
        return supermarcheRepository.findByNom(name);
    }

    @Override
    public List<Supermarche> getAllSupermarche() {
        return supermarcheRepository.findAll();
    }

    @Override
    public Supermarche addSupermarche(Supermarche supermarche) {
        return supermarcheRepository.save(supermarche);
    }

    @Override
    public Supermarche updateSupermarche(Supermarche supermarche) {
        return supermarcheRepository.save(supermarche);
    }

    @Override
    public boolean deleteSupermarche(Supermarche supermarche) {
        try{
            supermarcheRepository.delete(supermarche);
            return true;
        }catch(Exception exception){
            return false;
        }
    }
}
