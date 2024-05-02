package com.example.antigaspi1.Dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Vendeur {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nom;
    private long tel;
    private String ville;
    private String adresse;
    private Date date_inscription;
    private String email;

    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", tel=" + tel +
                ", ville='" + ville + '\'' +
                ", adresse='" + adresse + '\'' +
                ", date_inscription=" + date_inscription +
                ", email='" + email + '\'' +
                '}';
    }
}
