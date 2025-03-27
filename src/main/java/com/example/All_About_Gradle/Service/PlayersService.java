package com.example.All_About_Gradle.Service;

import com.example.All_About_Gradle.Entity.PlayerBasicInfo;
import com.example.All_About_Gradle.Entity.Players;
import com.example.All_About_Gradle.Repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public PlayerBasicInfo searchBYId(int id)
    {
       Optional<Players> pp= playersRepository.findById(id);
       PlayerBasicInfo pinfo = new PlayerBasicInfo();
       pinfo.setPlayerName(pp.get().getName());
       pinfo.setCountry(pp.get().getCountry());
       pinfo.setSpeciality(pp.get().getSpecialist());
       return pinfo;
    }

    public List<PlayerBasicInfo> getAllPlayers()
    {
       List<Players> players = playersRepository.findAll();
       List<PlayerBasicInfo> pinfo = new ArrayList<PlayerBasicInfo>() ;

       for(Players pp : players){
           PlayerBasicInfo ppifo = new PlayerBasicInfo();
           ppifo.setPlayerName(pp.getName());
           ppifo.setCountry(pp.getCountry());
           ppifo.setSpeciality(pp.getSpecialist());

           pinfo.add(ppifo);
       }
       return pinfo;
    }

}
