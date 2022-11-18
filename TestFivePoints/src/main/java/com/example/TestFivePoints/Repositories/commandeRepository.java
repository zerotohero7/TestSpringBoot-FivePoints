package com.example.TestFivePoints.Repositories;

import com.example.TestFivePoints.Entities.commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface commandeRepository extends JpaRepository<commande, Integer> {

    @Override
    List<commande> findAll();
}
