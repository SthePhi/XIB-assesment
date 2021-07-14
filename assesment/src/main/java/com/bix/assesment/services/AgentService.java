package com.bix.assesment.services;

import com.bix.assesment.Entities.Agent;

import java.util.List;
import java.util.Optional;

public interface AgentService {

    List<Agent> findAgents();
    Optional<Agent> findAnAgent(Long id);
    Agent insertAgent(Agent agent);
}
