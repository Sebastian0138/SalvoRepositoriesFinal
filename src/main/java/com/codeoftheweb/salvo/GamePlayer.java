package com.codeoftheweb.salvo;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.stream.DoubleStream;

@Entity
public class GamePlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private LocalDateTime joinDate;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="gameId")
    private Game gameId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="playerId")
    private Player playerId;

    public GamePlayer() { }

    public GamePlayer(Game gameId, Player playerId,LocalDateTime joinDate ) {
        this.joinDate = joinDate;
        this.gameId = gameId;
        this.playerId = playerId;
    }



    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public Game getGameId() {
        return gameId;
    }

    public void setGameId(Game gameId) {
        this.gameId = gameId;
    }

    public Player getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Player playerId) {
        this.playerId = playerId;
    }
}