package com.bix.assesment.services;

import com.bix.assesment.Entities.Manager;
import com.bix.assesment.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService{
    private ManagerRepository repository;

    @Autowired
    ManagerServiceImpl(ManagerRepository repository){
        this.repository = repository;
    }

    @Override
    public Manager addManager(Manager manager) {
        return repository.save(manager);
    }
}
