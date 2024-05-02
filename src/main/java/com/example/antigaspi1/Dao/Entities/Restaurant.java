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
public class Restaurant extends Vendeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @OneToMany(mappedBy = "restaurant")
    private List<Produit> produits ;

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", description='" + description + '\'' +

                "} " + super.toString();
    }
}

