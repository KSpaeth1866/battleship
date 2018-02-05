package com.battleship.battleship.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;

@Entity
public class Board {

    private Integer id;
    private Boolean allSunk;
    private Player owner;
    private List<Ship> sunkShips;
    private List<Ship> unsunkShips;
    private Square[][] squares;
    private String[] rows = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    private String[] cols = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @Id
    @GeneratedValue
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public Boolean getAllSunk() {return allSunk;}
    public void setAllSunk(Boolean allSunk) {this.allSunk = allSunk;}

    public Player getOwner() {return owner;}
    public void setOwner(Player owner) {this.owner = owner;}

    public List<Ship> getSunkShips() {return sunkShips;}
    public void setSunkShips(List<Ship> sunkShips) {this.sunkShips = sunkShips;}

    public List<Ship> getUnsunkShips() {return unsunkShips;}
    public void setUnsunkShips(List<Ship> unsunkShips) {this.unsunkShips = unsunkShips;}

    public Square[][] getSquares() {return squares;}
    public void setSquares(Square[][] squares) {this.squares = squares;}

    public String[] getRows() {return rows;}
    public void setRows(String[] rows) {this.rows = rows;}

    public String[] getCols() {return cols;}
    public void setCols(String[] cols) {this.cols = cols;}

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (int row = 0; row < squares.length; row++) {
            StringBuilder rowRespresentation = new StringBuilder();
            for (int col = 0; col < squares.length; col++) {
                rowRespresentation.append(squares[row][col].toString()).append(" ");
            }
            representation.append(rowRespresentation);
        }
        return representation.toString();
    }
}
