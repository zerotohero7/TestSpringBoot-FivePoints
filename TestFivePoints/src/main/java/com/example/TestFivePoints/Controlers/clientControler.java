package com.example.TestFivePoints.Controlers;

import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Repositories.clientRepository;
import com.example.TestFivePoints.Services.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class clientControler {

    @Autowired
   private clientService ClientService;

    @Autowired
    private clientRepository ClientRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/get")
    public List<client> gettingAll(){
       return ClientService.getAll();
    }

    @GetMapping("/get/{id}")
    public client gettingOne(@PathVariable("id") Integer clientId){
        return ClientService.getOne(clientId);
    }

    @PostMapping("/register")
    public String postingOne(@RequestBody client Client){
        String BcryptPassword =  bCryptPasswordEncoder.encode(Client.getPassword());
        Client.setPassword(BcryptPassword);

        Optional<client> existedMail =  ClientRepository.findByEmail(Client.getEmail());

        if(existedMail.isEmpty()) {
            ClientService.postOne(Client);
            return "client added successfully";
        } else {
            return   "client already registred !!!";
        }

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
