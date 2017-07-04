/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mygame.commons.Models;
import mygame.entities.card.Card;
import mygame.entities.card.CardTypes;
import mygame.entities.deck.Deck;
import mygame.entities.player.Player;

/**
 *
 * @author nicolas
 */
public class Game {
    
    Deck deck;
    List<Player> players = new ArrayList<Player>();
    
    Game(){
        deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
   
    
    /**
     * Build the cards which will be used for the game
     */
    public void buildDeckOfCards(){
        
        List<Card> cardList = new ArrayList<Card>();
        
        for(CardTypes cardType : CardTypes.values()){
            for(int cardNum = 1 ; cardNum <= 10; cardNum++){
                
                Card card = new Card();
                card.setType(cardType);
                card.setName(cardType.name() + (cardNum > 7 ? cardNum + 2 : cardNum));
                card.setCardModel(Models.getModel(card.getName()));
                
                cardList.add(card);
                
                
            }
        }
        
        deck.setCards(cardList);
        
    }
    
    /**
     * Random selection of the first dealer who will start the game
     */
    public void selectPrincipalDealer(){
        Random random = new Random();
        Player player = players.get(random.nextInt(players.size()));
        player.setIsDealer(Boolean.TRUE);
        
        if(player.getPlayerNumber() != players.size()){
            buildNextRound(player.getPlayerNumber());
        }
        
    }
    
    
    /**
     * 
     * index = 1
     * 
     * aux = 2 
     * 
     *   |
     * 1 2 3 4  -> 2 3 4 1 -> 3 4 1 2   
     * 
     * 
     */
    
    
    /**
     * Rotate the players array N times only if the player is not last one in the list 
     * @param index 
     */
    public void buildNextRound(int index){
        Player plAux;
        for(int x=0; x<=index; x++){
            plAux = players.get(0);
            
            for(int j=0; j<= players.size(); j++){  // from 0 a 3 if I have 4 players
                if(j == players.size() -1){
                   players.set(j, plAux); //Last position in array
                }else{
                   players.set(j, players.get(j+1));
                }
                
            }
        }   
    }
}
