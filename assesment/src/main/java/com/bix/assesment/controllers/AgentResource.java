package com.bix.assesment.controllers;

import com.bix.assesment.Entities.Agent;
import com.bix.assesment.Entities.Team;
import com.bix.assesment.services.AgentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentResource {

    @Autowired
    private AgentServiceImpl agentService;


   /* @GetMapping(path = "/agents/")
    public List<Agent> viewAgents() {
        return agentService.findAgents();
    }*/

    @GetMapping(path = "/agent/{id}/")
    public Agent viewAgent(@PathVariable("id") Long id) {
        return agentService.findAnAgent(id).get();
    }

    @PostMapping(path = "/agent/")
    public ResponseEntity<Agent> addTeam(@RequestBody Agent agent) {
        return new ResponseEntity<>(agentService.insertAgent(agent), HttpStatus.OK);
    }
}
