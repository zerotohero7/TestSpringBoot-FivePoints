package com.example.TestFivePoints.Repositories;

import com.example.TestFivePoints.Entities.produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface produitRepository extends JpaRepository<produit , Integer> {

    @Override
    List<produit> findAll();
}
