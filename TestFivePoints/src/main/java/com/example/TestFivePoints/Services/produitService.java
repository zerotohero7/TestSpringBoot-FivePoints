package com.example.TestFivePoints.Services;

import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Entities.produit;
import com.example.TestFivePoints.Repositories.clientRepository;
import com.example.TestFivePoints.Repositories.produitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produitService {

    @Autowired
    private produitRepository ProduitRepository;

    public List<produit> getAll() {
        return ProduitRepository.findAll();
    }

    public produit getOne(Integer produitId) {
        return ProduitRepository.findById(produitId).orElse(null);
    }

    public String postOne(produit product) {
        ProduitRepository.save(product);
        return "produit posted succssfully";
    }

    public String deleteOne(Integer produitId) {
        ProduitRepository.deleteById(produitId);
        return "produit deleted succssfully";
    }

    public String updateOne(produit product, Integer produitId) {
        product.setId(produitId);
        ProduitRepository.save(product);
        return "produit updated succssfully";
    }
}