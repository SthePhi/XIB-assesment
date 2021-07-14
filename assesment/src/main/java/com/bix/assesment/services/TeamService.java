package com.bix.assesment.services;

import com.bix.assesment.Entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findTeams();
    Optional<Team> findTeam(Long id);
    Team createTeam(Team team);
}
