package com.example.TestFivePoints.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private String role="CLIENT";

    @JsonIgnore
    @OneToMany(mappedBy = "clientAssocie" , fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<commande> commandes;



}
