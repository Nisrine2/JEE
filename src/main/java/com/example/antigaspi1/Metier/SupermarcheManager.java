package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Supermarche;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SupermarcheManager {
    public Optional<Supermarche> getSupermarcheById(int id);
    Supermarche getSupermarcheByName(String name);
    public List<Supermarche> getAllSupermarche();
    public Supermarche addSupermarche(Supermarche supermarche);
    public Supermarche updateSupermarche(Supermarche supermarche);
    public boolean deleteSupermarche(Supermarche supermarche);
}
