package com.example.TestFivePoints.Repositories;

import com.example.TestFivePoints.Entities.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface clientRepository extends JpaRepository<client, Integer> {

    @Override
    List<client> findAll();


}
