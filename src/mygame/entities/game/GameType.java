/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.game;

/**
 *
 * @author nicolas
 */
public enum GameType {
    
    PLAYER_VS_PLAYER(1, "One vs one."),
    PLAYER_VS_CPU(2, "Player vs computer."),
    MULTIPLAYER(3, "More than 2 players. 4 players max.");

    
    private int id;
    private String desc;
    
    GameType(int id, String desc){
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
}
