/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.entities.player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import mygame.entities.card.Card;
import mygame.entities.deck.Deck;
import mygame.entities.desk.Table;
import mygame.entities.game.Game;

/**
 *
 * @author nicolas
 */
public class Player {
    
    public static int instanceCounter;
    
    private String name;
    private int playerNumber;
    private boolean isBot;
    private boolean isMyTurn;
    private boolean isDealer;
    private List<Card> cardOnHand = new ArrayList<>();      //Cards use for playing. 3 is the limit.    
    private List<Card> cardEarned = new ArrayList<>();      //Cards taken from the desk    
    private int gamePoints;                                     //Points earned in the round
    private int totalPoints;                                    //Points earned in the game    
    private Table table;
    
    private Deck deck;
    private boolean isInitialRound;
    
    Map<String, Integer> pointsDetails = new HashMap<>();
    
    public Player(){
        
        instanceCounter++;
        playerNumber = instanceCounter;
        
        //Initialize counts for points details
        pointsDetails.put("cards", 0);
        pointsDetails.put("gold", 0);
        pointsDetails.put("seventh", 0);
        pointsDetails.put("sevenGold", 0);
        pointsDetails.put("broom",0);
                
    }
    
    /**
     * Shuffle the deck of card before start the game
     */
    public void shuffleCards(){
        long seed = System.nanoTime();
        Collections.shuffle(deck.getCards(), new Random(seed));
    }
    
    
    /**
     * Pick cards up from the table
     * @param cards 
     */
    public void pickUpCards(List<Card> cards){
        cardEarned.addAll(cards);
    }
    
    /**
     * Perform a movement
     */
    public void dropCard(){
        //TODO:
    }
    
    /**
     * Split points into details
     */
    public void countPoints(){
        for(Card card : cardEarned){
            //TODO:
        }
    }
    
    
    /**
     * Reset points once the game finished
     */
    public void resetPoints(){
        Set<String> keySet = pointsDetails.keySet();
        Iterator i = keySet.iterator();
        while(i.hasNext()){
            pointsDetails.put(i.next().toString(), 0);
        }
    }
    
    public void dealCards(List<Player> players){
        if(deck.getCards().size() == deck.CARDS_AMOUNT){
            isInitialRound = Boolean.TRUE;
        }else{
            isInitialRound = Boolean.FALSE;
        }
        
        //Deal cards to players
        for(int x = 0; x <= Game.MAX_CARD_PER_PLAYER; x++){
            for(Player pl : players){
                if(!deck.getCards().isEmpty() && deck.getCards() != null){
                    pl.getCardOnHand().add(deck.getCards().remove(0));
                }else{
                    break;
                }
            }
        }
        
        //If it is the first round we must put 4 cards on the table in addition to the cards were dealed to players
        if(isInitialRound){
            for(int j = 0; j <= Game.INITAL_CARDS_ON_TABLE; j++){
                table.getCards().add(deck.getCards().remove(0));
            }
        }
        
        
        
        
    } 
    
    /**
     *
     * @param card
     * @return
     */
    public Map<Integer, List<Card>> play(Card card){
        return null;
    }
    

    /**
     * GETTERS AND SETTERS
     */
    
    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
    
    public boolean isDealer() {
        return isDealer;
    }

    public void setIsDealer(boolean isDealer) {
        this.isDealer = isDealer;
    }
    
    public boolean isBot() {
        return isBot;
    }

    public void setIsBot(boolean isBot) {
        this.isBot = isBot;
    }

    public boolean isMyTurn() {
        return isMyTurn;
    }

    public void setIsMyTurn(boolean isMyTurn) {
        this.isMyTurn = isMyTurn;
    }

    public List<Card> getCardOnHand() {
        return cardOnHand;
    }

    public void setCardOnHand(List<Card> cardOnHand) {
        this.cardOnHand = cardOnHand;
    }

    public List<Card> getCardEarned() {
        return cardEarned;
    }

    public void setCardEarned(List<Card> cardEarned) {
        this.cardEarned = cardEarned;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    
    
    
}
