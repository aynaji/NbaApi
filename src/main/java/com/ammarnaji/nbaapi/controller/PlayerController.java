package com.ammarnaji.nbaapi.controller;

import com.ammarnaji.nbaapi.model.Player;
import com.ammarnaji.nbaapi.model.PlayerDTO;
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

public class PlayerController {

    @Autowired
    NbaService nbaService;

    @Cacheable("allPlayers")
    @GetMapping("/players")
    public Mono<PlayerDTO> getAllTeams(){
        Mono<PlayerDTO> allPlayers= nbaService.getAllPlayer();
        return allPlayers;
    }

    @Cacheable("allPlayersById")
    @GetMapping("/players/{id}")
    public Mono<Player> getPlayerById(@PathVariable String id){
        Mono<Player> allPlayersById= nbaService.getPlayerById(id);
        return allPlayersById;
    }
}
