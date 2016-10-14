package io.zipcoder.cardgame.cardplayer;

import io.zipcoder.cardgame.card.Card;
import java.util.ArrayList;

public class PlayerHand {
    private ArrayList<Card> cards;

    public PlayerHand(){
        cards = new ArrayList<>();
    }

    public void addCardToHand(Card card){
        cards.add(card);
    }

    public ArrayList<Card> getAllCards(){
        return cards;
    }

    public Card getCard(){
        Card card = (cards.isEmpty()) ? null : cards.get(0);
        return card;
    }

    public Integer countCardsInHand(){
        return (cards.isEmpty()) ? 0 : cards.size();
    }

    public ArrayList<Card> getCards(int amount){
        ArrayList<Card> cards = new ArrayList<>();
        for(int index = 0; index < amount; index++){
            cards.add(getCard());
        }
        return cards;
    }
}
