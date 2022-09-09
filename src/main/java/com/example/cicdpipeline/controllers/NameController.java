package com.example.cicdpipeline.controllers;

import com.example.cicdpipeline.model.Name;
import com.example.cicdpipeline.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
