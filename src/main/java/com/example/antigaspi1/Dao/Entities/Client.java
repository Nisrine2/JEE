package com.example.antigaspi1.Dao.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adresse;
    private String ville;
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +

                '}';
    }
}
