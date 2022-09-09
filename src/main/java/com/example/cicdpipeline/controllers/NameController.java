package com.example.cicdpipeline.controllers;

import com.example.cicdpipeline.model.Name;
import com.example.cicdpipeline.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
public class NameController {
    private NameService nService;

    public NameController(NameService nService){
        this.nService = nService;
    }

    @GetMapping("/getAllNames")
    public ResponseEntity<Set<Name>> getAllNames(){
        return new ResponseEntity<>(nService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addName")
    public ResponseEntity<Name> addUser (Name newName){
        return new ResponseEntity<>(nService.save(newName),HttpStatus.OK);
    }

    @DeleteMapping("/deleteName")
    public ResponseEntity<Set<Name>> deleteName (Name name){
        nService.delete(name);
        return new ResponseEntity<>(nService.findAll(),HttpStatus.OK);
    }

    @PutMapping("/editName")
    public ResponseEntity<Set<Name>> editUser(Long id, Name name){
        Optional<Name> updated = nService.findById(id);
        if(updated.isPresent()){
            nService.save(name);
            return new ResponseEntity<>(nService.findAll(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(nService.findAll(),HttpStatus.NOT_FOUND);
        }
    }

}
