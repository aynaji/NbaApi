package com.ammarnaji.nbaapi.controller;

import com.ammarnaji.nbaapi.model.Game;
import com.ammarnaji.nbaapi.model.GameDTO;
import com.ammarnaji.nbaapi.service.NbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import reactor.core.publisher.Mono;

@RestController
public class GamesController {

    @Autowired
    NbaService nbaService;

    @GetMapping("/")
    public ModelAndView userInformation(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home.html");
        return modelAndView;
    }

    @Cacheable("allGames")
    @GetMapping("/games")
    public Mono<GameDTO> getAllGames(){
        Mono<GameDTO> allGames= nbaService.getAllGames();
        return allGames;
    }

    @Cacheable("allGamesById")
    @GetMapping("/games/{id}")
    public Mono<Game> getGameById(@PathVariable String id){
        Mono<Game> allGamesById= nbaService.getGameById(id);
        return allGamesById;
    }

}
