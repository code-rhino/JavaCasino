package io.zipcoder.cardgame.deck;

import io.zipcoder.cardgame.card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards){
        this.cards = cards;
        shuffle();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card getCard(){
        return cards.get(0);
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }
}
