package com.battleship.battleship.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    private Integer id;
    private Board board;

    @Id
    @GeneratedValue
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Board getBoard() {return board;}
    public void setBoard(Board board) {this.board = board;}
}
