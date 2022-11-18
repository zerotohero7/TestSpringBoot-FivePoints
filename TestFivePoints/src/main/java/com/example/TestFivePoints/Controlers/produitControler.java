package com.example.TestFivePoints.Controlers;

import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Entities.produit;
import com.example.TestFivePoints.Services.clientService;
import com.example.TestFivePoints.Services.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produit")
public class produitControler {

    @Autowired
    private produitService ProduitService;

    @GetMapping("/get")
    public List<produit> gettingAll(){
        return ProduitService.getAll();
    }

    @GetMapping("/get/{id}")
    public produit gettingOne(@PathVariable("id") Integer produitId){
        return ProduitService.getOne(produitId);
    }

    @PostMapping("/post")
    public String postingOne(@RequestBody produit product){
        return ProduitService.postOne( product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable("id") Integer produitId){
        return ProduitService.deleteOne(produitId);
    }

    @PutMapping("/update/{id}")
    public String updateClient(@RequestBody  produit product ,@PathVariable("id") Integer produitId){
        return ProduitService.updateOne(  product , produitId);
    }
}
