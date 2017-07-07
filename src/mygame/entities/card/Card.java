/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.card;

import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;

/**
 *
 * @author nicolas
 */
public class Card extends Geometry{
    
    private Spatial cardModel;
    private CardTypes type;
    private int value;
    private boolean isBroom;
   
    
    /**
     * GETTERS AND SETTERS
     * @return 
     */
    
    public CardTypes getType() {
        return type;
    }

    public void setType(CardTypes type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBroom() {
        return isBroom;
    }

    public void setIsBroom(boolean isBroom) {
        this.isBroom = isBroom;
    }

    public Spatial getCardModel() {
        return cardModel;
    }

    public void setCardModel(Spatial cardModel) {
        this.cardModel = cardModel;
    }
    
    

}
