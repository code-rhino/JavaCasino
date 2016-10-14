package io.zipcoder.cardgame.deck;


import org.junit.Assert;
import org.junit.Test;

public class DeckBuilderTest {

    @Test
    public void createDeckFromJsonTest(){
        Deck deck = DeckBuilder.build();
        Assert.assertEquals(52, deck.getCards().size());
    }
}
