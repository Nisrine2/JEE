package com.example.antigaspi1.Dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Supermarche extends Vendeur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    @OneToMany(mappedBy = "supermarche")
    private List<Produit> produits;

    @Override
    public String toString() {
        return "Supermarche{" +
                "id=" + id +
                ", type='" + type + '\'' +

                "} " + super.toString();
    }
}
