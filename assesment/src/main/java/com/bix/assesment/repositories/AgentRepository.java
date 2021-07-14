package com.bix.assesment.repositories;

import com.bix.assesment.Entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource( collectionResourceRel = "agentlist", path = "agentlist")
public interface AgentRepository extends JpaRepository<Agent, Long> {
}
