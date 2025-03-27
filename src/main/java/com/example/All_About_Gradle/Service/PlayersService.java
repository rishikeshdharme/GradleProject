package com.example.All_About_Gradle.Service;

import com.example.All_About_Gradle.Entity.Players;
import com.example.All_About_Gradle.Repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayersService {

    @Autowired
    private final PlayersRepository playersRepository;

    public PlayersService(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    public Players addPlayer(Players players)
    {
        return playersRepository.save(players);
    }

    public Players updatePlayer(Players players)
    {
        return playersRepository.save(players);
    }

    public void deletePlayer(int id)
    {
        playersRepository.deleteById(id);
        System.out.println("PLayer deleted successfully");
    }

    public Players searchBYId(int id)
    {
       Optional<Players> pp= playersRepository.findById(id);
       return pp.get();
    }

    public List<Players> getAllPlayers()
    {
       return playersRepository.findAll();
    }

}
