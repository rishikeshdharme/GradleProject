package com.example.All_About_Gradle.Controller;

import com.example.All_About_Gradle.Entity.Players;
import com.example.All_About_Gradle.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private final PlayersService  playersService;

    public PlayerController(PlayersService playersService) {
        this.playersService = playersService;
    }

    @GetMapping("/getplayers")
    public List<Players> getPlayers() {
       return playersService.getAllPlayers();
    }

    @PostMapping("/addplayers")
    public Players addPlayer(@RequestBody Players p){
       return playersService.addPlayer(p);
    }

    @PutMapping("/updateplayers/{id}")
    public Players updatePlayer(@RequestBody Players p){
        return playersService.updatePlayer(p);
    }

    @DeleteMapping("/deleteplayers/{id}")
    public void deletePlayers(@PathVariable int id) {

        playersService.deletePlayer(id);
    }

    @GetMapping("/getbyid/{id}")
    public Players getById(@PathVariable int id)
    {
        return playersService.searchBYId(id);
    }



}
