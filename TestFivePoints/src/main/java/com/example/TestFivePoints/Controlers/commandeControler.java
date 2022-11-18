package com.example.TestFivePoints.Controlers;

import com.example.TestFivePoints.Entities.commande;
import com.example.TestFivePoints.Entities.produit;
import com.example.TestFivePoints.Services.commandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commande")
public class commandeControler {

    @Autowired
    private commandeService CommandeService;

    @PostMapping("/post")
    public String postingCommande(@RequestBody commande Commande){
        return CommandeService.postCommande(Commande);
    }
    @GetMapping("/get")
    public List<commande> gettingAllCommande (){
        return CommandeService.getAllCommande();
    }
    @GetMapping("/get/{id}")
    public commande gettingOneCommande(@PathVariable("id") Integer idCommande){
        return CommandeService.getOneCommande(idCommande);
    }
}
