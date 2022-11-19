package com.example.TestFivePoints.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String nom;
    @NonNull
    private String description;
    @NonNull
    private Integer quantity ;
    @NonNull
    private Integer prix ;

    @JsonIgnore
    @ManyToMany(mappedBy = "produits" , fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            } )
    private List<commande> commandes = new ArrayList<>();











}
