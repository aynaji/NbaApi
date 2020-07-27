package com.ammarnaji.nbaapi.controller;

import com.ammarnaji.nbaapi.model.Game;
import com.ammarnaji.nbaapi.model.GameDTO;
import com.ammarnaji.nbaapi.service.NbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GamesController {

    @Autowired
    NbaService nbaService;

    @GetMapping("/games")
    public Mono<GameDTO> getAllGames(){
        Mono<GameDTO> allGames= nbaService.getAllGames();
        return allGames;
    }

    @GetMapping("/games/{id}")
    public Mono<Game> getGameById(@PathVariable String id){
        Mono<Game> allGames= nbaService.getGameById(id);
        return allGames;
    }

}
