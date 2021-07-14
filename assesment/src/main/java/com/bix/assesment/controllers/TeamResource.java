package com.bix.assesment.controllers;

import com.bix.assesment.Entities.Agent;
import com.bix.assesment.Entities.Team;
import com.bix.assesment.services.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamResource {

    private TeamServiceImpl teamService;

    @Autowired
    TeamResource(TeamServiceImpl teamService){
        this.teamService = teamService;
    }

    @GetMapping(path = "/teams/")
    public List<Team> viewTeams(){
        return teamService.findTeams();
    }

    @GetMapping(path = "/team/{id}/")
    public Optional<Team> viewTeam(@PathVariable("id") Long id){
        return teamService.findTeam(id);
    }

    @PostMapping(path = "/team/")
    public ResponseEntity<Team> addTeam(@RequestBody Team team){
         return new ResponseEntity<>(teamService.createTeam(team), HttpStatus.OK);
    }

    @PutMapping("team/{id}/agent")
    public void updateTeamsAgent(@PathVariable("id") Long id, Agent agent){
        teamService.updateAgent(id, agent);
    }
    @GetMapping("empty")
    public List<Team> viewEmptyTeams(){
        return teamService.getEmptyTeam();
    }
}
