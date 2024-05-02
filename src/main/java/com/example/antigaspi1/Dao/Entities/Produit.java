package com.example.antigaspi1.Dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;
    private String image;
    private String category;
    private int quantite;
    private double prix;
    @ManyToOne
    private Supermarche supermarche;
    @ManyToOne
    private Restaurant restaurant;
    @ManyToOne
    private Commande commande;

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", supermarche=" + supermarche +
                ", restaurant=" + restaurant +
                ", commande=" + commande +
                '}';
    }
}
