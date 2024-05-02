package com.example.antigaspi1.Dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long numero;
    private Date date;
    private String descrition;
    private long totalprix;
    private String etat;
    @OneToMany(mappedBy = "commande")
    private List<Produit> produits;
    @ManyToOne
    private Client client;

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", numero=" + numero +
                ", date=" + date +
                ", descrition='" + descrition + '\'' +
                ", totalprix=" + totalprix +
                ", etat='" + etat + '\'' +
                '}';
    }
}
