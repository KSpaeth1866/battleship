package com.battleship.battleship.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Game {
    private Integer id;
    private Boolean isOver;
    private Boolean isSetupComplete;
    private Player turn;
    private List<Player> players;
    private List<Board> boards;

    @Id
    @GeneratedValue
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Boolean getOver() {return isOver;}
    public void setOver(Boolean over) {isOver = over;}

    public Boolean getSetupComplete() {return isSetupComplete;}
    public void setSetupComplete(Boolean setupComplete) {isSetupComplete = setupComplete;}

    public Player getTurn() {return turn;}
    public void setTurn(Player turn) {this.turn = turn;}

    public List<Player> getPlayers() {return players;}
    public void setPlayers(List<Player> players) {this.players = players;}

    public List<Board> getBoards() {return boards;}
    public void setBoards(List<Board> boards) {this.boards = boards;}


}
