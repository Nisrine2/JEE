package com.example.antigaspi1.Metier;

import com.example.antigaspi1.Dao.Entities.Produit;
import com.example.antigaspi1.Dao.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProduitManagerService implements ProduitManager {
    @Autowired
    public ProduitRepository produitRepository;

    @Override
    public Produit  addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Optional<Produit> getProduitById(int id) {
        return produitRepository.findById(id);

    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public boolean deleteProduit(int id) {
        try{
            produitRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public Page<Produit> getAllProduits2(int page,int size ) {
        return  produitRepository.findAll(PageRequest.of(page,size));
    }


}
