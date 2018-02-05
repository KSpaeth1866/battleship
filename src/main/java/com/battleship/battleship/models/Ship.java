package com.battleship.battleship.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Ship {

    private Integer id;
    private Boolean isSunk;
    private List<Square> unhitSquares;
    private List<Square> hitSquares;

    @Id
    @GeneratedValue
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Boolean getSunk() {return isSunk;}
    public void setSunk(Boolean sunk) {isSunk = sunk;}

    public List<Square> getUnhitSquares() {return unhitSquares;}
    public void setUnhitSquares(List<Square> unhitSquares) {this.unhitSquares = unhitSquares;}

    public List<Square> getHitSquares() {return hitSquares;}
    public void setHitSquares(List<Square> hitSquares) {this.hitSquares = hitSquares;}
}
