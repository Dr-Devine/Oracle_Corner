package com.example.oracle.controllers;

import com.example.oracle.models.Tarot;
import com.example.oracle.repositories.TarotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TarotController {

    @Autowired
    TarotRepository tarotRepository;

    @GetMapping(value = "/tarots")
    public ResponseEntity<List<Tarot>> getAllTarots(){
        return new ResponseEntity<>(tarotRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/tarots/{id}")
    public ResponseEntity getTarot(@PathVariable Long id){
        return new ResponseEntity<>(tarotRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/tarots")
    public ResponseEntity<Tarot> createTarot(@RequestBody Tarot tarot){
        tarotRepository.save(tarot);
        return new ResponseEntity<>(tarot, HttpStatus.CREATED);
    }
}
