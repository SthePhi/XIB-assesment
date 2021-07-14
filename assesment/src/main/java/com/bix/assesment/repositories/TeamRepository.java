package com.bix.assesment.repositories;

import com.bix.assesment.Entities.Agent;
import com.bix.assesment.Entities.Team;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RepositoryRestResource( collectionResourceRel = "team", path = "team")
public interface TeamRepository extends JpaRepository<Team, Long> {

    @RestResource(path = "/empty")
    List<Team> findAllByAgents_EmptyAndManagers_Empty();
}
