package Rooms;

import Players.Player;

import java.util.ArrayList;

public class Room {

    protected String name;
    protected String type;
    protected int difficulty;
    protected ArrayList<Player> players;

    public Room(String name, String type, int difficulty){
        this.name = name;
        this.type = type;
        this.difficulty = difficulty;
        this.players = new ArrayList<Player>();
    }


    public String getName() {
        return this.name;
    }
}
