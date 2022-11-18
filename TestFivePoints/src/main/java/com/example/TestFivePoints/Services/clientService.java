package com.example.TestFivePoints.Services;

import ch.qos.logback.core.net.server.Client;
import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clientService {

    @Autowired
    private clientRepository ClientRepository;

    public List<client> getAll (){
      return   ClientRepository.findAll();
    }
    public client getOne (Integer clientId){
        return ClientRepository.findById(clientId).orElse(null);
    }
    public String postOne (client customer ){
        ClientRepository.save(customer);
        return "client posted succssfully";
    }
    public String deleteOne (Integer clientId){
        ClientRepository.deleteById(clientId);
        return "client deleted succssfully";
    }
    public String updateOne(client customer , Integer clientId){
        customer.setId(clientId);
        ClientRepository.save(customer);
        return "client updated succssfully";

    }















}
