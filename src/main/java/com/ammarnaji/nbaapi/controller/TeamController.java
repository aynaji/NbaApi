package com.ammarnaji.nbaapi.controller;

import com.ammarnaji.nbaapi.model.Team;
import com.ammarnaji.nbaapi.model.TeamDTO;
import com.ammarnaji.nbaapi.service.NbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TeamController {

    private final NbaService nbaService;

    public TeamController(NbaService nbaService) {
        this.nbaService = nbaService;
    }

    @Cacheable("allTeams")
    @GetMapping("/teams")
    public Mono<TeamDTO> getAllTeam() {
        Mono<TeamDTO> allTeams = nbaService.getAllTeams();
        return allTeams;
    }

    @Cacheable("allTeamsById")
    @GetMapping("/teams/{id}")
    public Mono<Team> getTeamById(@PathVariable String id){
        Mono<Team> allTeamsById= nbaService.getTeamById(id);
        return allTeamsById;
    }
}
