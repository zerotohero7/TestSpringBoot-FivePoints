package com.example.TestFivePoints.Controlers;

import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Services.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/client")
public class clientControler {

    @Autowired
   private clientService ClientService;

    @GetMapping("/get")
    public List<client> gettingAll(){
       return ClientService.getAll();
    }

    @GetMapping("/get/{id}")
    public client gettingOne(@PathVariable("id") Integer clientId){
        return ClientService.getOne(clientId);
    }

    @PostMapping("/post")
    public String postingOne(@RequestBody client customer){
        return ClientService.postOne(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable("id") Integer clientId){
        return ClientService.deleteOne(clientId);
    }

    @PutMapping("/update/{id}")
    public String updateClient(@RequestBody client customer ,@PathVariable("id") Integer clientId){
        return ClientService.updateOne( customer , clientId);
    }


}
