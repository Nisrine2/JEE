package com.example.antigaspi1.Web;

import com.example.antigaspi1.Dao.Entities.Produit;
import com.example.antigaspi1.Dao.Repositories.ProduitRepository;
import com.example.antigaspi1.Metier.ProduitManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitManager produitManager;
    private ProduitRepository produitRepository;
    @GetMapping(path = "/Produit")
    public String Produit(Model model ,

                          @RequestParam(name = "page",defaultValue = "0") int page,
                          @RequestParam(name = "size",defaultValue = "3") int size,
                          @RequestParam(name = "keyword",defaultValue = "3") String keyword){
        Page<Produit> pageProduits = produitRepository.findByNomContains(keyword, PageRequest.of(page,size));
        model.addAttribute("listproduits",pageProduits.getContent() );
        int[] pages=new int[pageProduits.getTotalPages()];
                model.addAttribute("pages",pages);
                model.addAttribute("pages",new int [pageProduits.getTotalPages()] );
                model.addAttribute("currentPage",page);
                model.addAttribute("keyword",keyword);

        return "Produit";
    }

    @GetMapping("/deleteProduit")
    public String deleteProduit(Model model, @RequestParam(name = "id") Integer id) {
        if (produitManager.deleteProduit(id)) {
            return "redirect:/Produit";
        } else {
            return "error";
        }
    }
    @GetMapping("/ajouterProduit")
    public String ajouterProduit(Model model) {
        model.addAttribute("produit",new Produit());
        return "ajouterProduit";
    }
    @PostMapping("/ajouterProduit")
    public String ajouterProduit(Model model,
                                 @RequestParam(name="nom")String nom,
                                 @RequestParam(name = "description")String description,
                                 @RequestParam(name="image")String image,
                                 @RequestParam(name = "category")String category,
                                 @RequestParam(name="quantite")int quantite,
                                 @RequestParam(name = "prix")double prix) {
        System.out.println("nom"+nom);
        System.out.println("description"+description);
        System.out.println("image"+image);
        System.out.println("category"+category);
        System.out.println("quantite"+quantite);
        System.out.println("prix"+prix);

        Produit produit = new Produit();
        produit.setNom(nom);
        produit.setDescription(description);
        produit.setImage(image);
        produit.setCategory(category);
        produit.setQuantite(quantite);
        produit.setPrix(prix);
        produitManager.addProduit(produit);
        List<Produit> produits = produitManager.getAllProduits();
        model.addAttribute("produit", produits);


        return "redirect:/Produit";

    }


}
