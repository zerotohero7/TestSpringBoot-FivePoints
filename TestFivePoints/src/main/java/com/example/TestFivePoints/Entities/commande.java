package com.example.TestFivePoints.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class commande implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinTable(name = "commande_product",
            joinColumns = { @JoinColumn(name = "commande_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") })
    private List<produit> produits = new ArrayList<>();




    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(nullable = false)
    private client clientAssocie ;


}
