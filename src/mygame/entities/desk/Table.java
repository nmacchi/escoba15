/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.desk;

import com.jme3.scene.Geometry;
import java.util.ArrayList;
import java.util.List;
import mygame.entities.card.Card;

/**
 *
 * @author nicolas
 */
public class Table extends Geometry{
    
    private  List<Card> cards = new ArrayList<Card>();
    private int points;
    
    
    
    /**
     * GETTERS AND SETTERS
     */
    
    /**
     * Return a list which contains the cards are on the table 
     * @return 
     */
    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
    /**
     * Return the current amount of points on the table
     * @return 
     */
    public int getPoints() {
        points = 0;
        for(Card card : cards){
            points += card.getValue();
        }
        
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
}
