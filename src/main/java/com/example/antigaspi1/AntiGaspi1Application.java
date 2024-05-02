package com.example.antigaspi1;

import com.example.antigaspi1.Dao.Entities.*;
import com.example.antigaspi1.Dao.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AntiGaspi1Application implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private VendeurRepository vendeurRepository;
    @Autowired
    private SupermarcheRepository supermarcheRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;



    public static void main(String[] args) {
        SpringApplication.run(AntiGaspi1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Produit produit1= new Produit(1,"Lasagnes","cuissant 3mins","image","pate",2,(long)100,null,null,null);
        Produit produit2 = new Produit(2,"Pommes","rouge","image","fruit",5,(long)30,null,null,null);
        Produit produit3 = new Produit(3,"Carotte","fraiche","image","legume",8,(long)20,null,null,null);

        Client client1 = new Client(1,"Samrani","Nisrine","nisrine@gmail.com","066854646","med5 app 17","casablanca",null);
        Client client2 = new Client(1,"Samrani","Nada","nada@gmail.com","0734343536","californie app 12","casablanca",null);

        Commande commande1 = new Commande(1,(long)12,new Date(),"commande x",(long)1222,"validé",null,null);

        Supermarche supermarche= new Supermarche(1,"grande surface",null);
        Restaurant restaurant=new Restaurant(1,"fancy",null);


        produitRepository.save(produit1);
        produitRepository.save(produit2);
        produitRepository.save(produit3);
        clientRepository.save(client1);
        clientRepository.save(client2);
        commandeRepository.save(commande1);
        vendeurRepository.save(supermarche);
        vendeurRepository.save(restaurant);

        produit1.setRestaurant(restaurant);
        produitRepository.save(produit1);
        produit1.setSupermarche(supermarche);
        produitRepository.save(produit1);

        produit2.setRestaurant(restaurant);
        produitRepository.save(produit2);
        produit2.setSupermarche(supermarche);
        produitRepository.save(produit2);

        produit3.setRestaurant(restaurant);
        produitRepository.save(produit3);
        produit3.setSupermarche(supermarche);
        produitRepository.save(produit3);
        
        List<Produit> produits = produitRepository.findAll();
        produits.forEach(produitFromList -> {
            System.out.println(produitFromList.toString());});

        List<Client> clients = clientRepository.findAll();
        clients.forEach(clientFromList -> {
            System.out.println(clientFromList.toString());});

        List<Commande> commandes = commandeRepository.findAll();
        commandes.forEach(commandeFromList -> {
            System.out.println(commandeFromList.toString());});

        List<Supermarche> supermarches = supermarcheRepository.findAll();
        supermarches.forEach(supermarcheFromList -> {
            System.out.println(supermarcheFromList.toString());});

        List<Restaurant> restaurants = restaurantRepository.findAll();
        restaurants.forEach(restaurantFromList->{
            System.out.println(restaurantFromList.toString());
        });

        client1.setCommandes(commandes);
        clientRepository.save(client1);
        commande1.setClient(client1);
        commandeRepository.save(commande1);
        commande1.setProduits(produits);
        commandeRepository.save(commande1);
        supermarche.setProduits(produits);
        supermarcheRepository.save(supermarche);


        /*produitRepository.deleteAll();
        System.out.println(produitRepository.findAll());
        clientRepository.deleteAll();
        System.out.println(clientRepository.findAll());
        vendeurRepository.deleteAll();
        System.out.println(vendeurRepository.findAll());
        commandeRepository.deleteAll();
        System.out.println(commandeRepository.findAll());*/


    };
};
