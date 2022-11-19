package com.example.TestFivePoints.Configuration;


import com.example.TestFivePoints.Entities.client;
import com.example.TestFivePoints.Repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyuserDetailsService implements UserDetailsService {

    @Autowired
    clientRepository  ClientRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<client> Client = ClientRepository.findByNom(username);

        Client.orElseThrow(() -> new UsernameNotFoundException("not found user with name : " + username));

        return Client.map(MyuserDetails::new).get();
    }
















}
