package com.example.TestFivePoints.Services;


import com.example.TestFivePoints.Entities.commande;
import com.example.TestFivePoints.Repositories.commandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commandeService {

    @Autowired
    private commandeRepository CommandeRepository;


    public String postCommande(commande Commande){
        CommandeRepository.save(Commande);
        return "Commande posted succssfully";
    }
    public List<commande> getAllCommande(){
      return   CommandeRepository.findAll();
    }

    public commande getOneCommande(Integer idCommande){
        return CommandeRepository.findById(idCommande).orElse(null);
    }

















}
