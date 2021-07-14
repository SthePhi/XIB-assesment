package com.bix.assesment.controllers;

import com.bix.assesment.Entities.Manager;
import com.bix.assesment.services.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerResource {

    private ManagerServiceImpl service;

    @Autowired
    ManagerResource(ManagerServiceImpl service){
        this.service = service;
    }

    @PostMapping(path = "/manager/")
    public ResponseEntity<Manager> addManager(@RequestBody Manager manager){
        return new ResponseEntity<>(service.addManager(manager), HttpStatus.OK);
    }
}
