package io.zipcoder.cardgame.card;


public class Card {
    private CardSuit suit;
    private CardValue value;

    public CardSuit getSuit() {
        return suit;
    }

    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }
}
