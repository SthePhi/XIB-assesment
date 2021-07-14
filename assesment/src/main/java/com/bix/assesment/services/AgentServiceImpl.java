package com.bix.assesment.services;

import com.bix.assesment.Entities.Agent;
import com.bix.assesment.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {

    private AgentRepository agentRepository;

    @Autowired
    AgentServiceImpl(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    @Override
    public List<Agent> findAgents() {
        return agentRepository.findAll();
    }

    @Override
    public Optional<Agent> findAnAgent(Long id) {
        return agentRepository.findById(id);
    }

    @Override
    public Agent insertAgent(Agent agent) {
        return agentRepository.save(agent);
    }
}
