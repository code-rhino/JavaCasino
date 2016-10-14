package io.zipcoder.cardgame.card;


import io.zipcoder.cardgame.card.Card;
import io.zipcoder.cardgame.card.CardSuit;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class CardSuitTest {

    @Test
    public void toValueTest(){
        CardSuit suit = CardSuit.SPADE;
        String expectedValue = "spade";
        String actualValue = suit.toValue();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void forValueTest(){
        CardSuit expectedValue = CardSuit.SPADE;
        CardSuit actualValue = CardSuit.forValue("spade");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void parseJsonObject() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        String sample = "{\"suit\":\"spade\", \"value\":\"ace\"}";
        CardSuit expected = CardSuit.SPADE;
        Card actual = mapper.readValue(sample, Card.class);
        Assert.assertEquals(expected, actual.getSuit());
    }
}