package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProduitManager  {
    public Optional<Produit> getProduitById(int id);
    public List<Produit> getAllProduits();
    public Produit addProduit(Produit produit);
    public Produit updateProduit(Produit produit);
    public boolean deleteProduit(int id);
    public Page<Produit> getAllProduits2(int page,int size );


}
