package com.bix.assesment.services;

import com.bix.assesment.Entities.Agent;
import com.bix.assesment.Entities.Team;
import com.bix.assesment.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository repository;

    @Autowired
    TeamServiceImpl(TeamRepository repository){
        this.repository =  repository;
    }

    @Override
    public List<Team> findTeams() {
        return repository.findAll();
    }

    @Override
    public Optional<Team> findTeam(Long id) {
        return repository.findById(id);
    }

    @Override
    public Team createTeam(Team team) {
        return repository.save(team);
    }

    public void updateAgent(Long id, Agent agent) {
        List<Agent> agents = repository.findById(id).get().getAgents();
        agents.add(agent);
        Team team = repository.findById(id).get();
        team.setAgents(agents);
        repository.save(team);
    }

    public List<Team> getEmptyTeam() {
        return repository.findAll().stream().filter(team -> team.getAgents().isEmpty()).collect(Collectors.toList());
        };
}
