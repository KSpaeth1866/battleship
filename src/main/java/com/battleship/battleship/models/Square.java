package com.battleship.battleship.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Square {

    private Integer id;
    private String nature;
    private Boolean isHit;
    private Ship ship;
    private String row;
    private String col;

    @Id
    @GeneratedValue
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNature() {return nature;}
    public void setNature(String nature) {this.nature = nature;}

    public Boolean getHit() {return isHit;}
    public void setHit(Boolean hit) {isHit = hit;}

    public Ship getShip() {return ship;}
    public void setShip(Ship ship) {this.ship = ship;}

    public String getRow() {return row;}
    public void setRow(String row) {this.row = row;}

    public String getCol() {return col;}
    public void setCol(String col) {this.col = col;}

    @Override
    public String toString() {
        if (this.isHit && this.ship != null) return "X";
        if (this.isHit && this.ship == null) return "O";
        if (!this.isHit && this.ship != null) return "S";
        return "~";
    }

}
