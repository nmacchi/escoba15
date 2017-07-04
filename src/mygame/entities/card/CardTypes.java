/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.card;

/**
 *
 * @author nicolas
 */
public enum CardTypes {
    
    ESPADA(1,"Espada"),
    ORO(2, "Oro"),
    BASTO(3, "Basto"),
    COPA(4, "Copa");
    
    private final int index;
    private final String desc;
    
    
    CardTypes(int index, String desc){
        this.index = index;
        this.desc = desc;
    }
    
    
    
}
