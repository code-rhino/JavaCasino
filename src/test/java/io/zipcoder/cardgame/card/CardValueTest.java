package io.zipcoder.cardgame.card;

import io.zipcoder.cardgame.card.Card;
import io.zipcoder.cardgame.card.CardValue;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CardValueTest {

    @Test
    public void forValueTest(){
        CardValue expectedValue = CardValue.ACE;
        CardValue actualValue = CardValue.forValue("ace");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void toValueTest(){
        CardValue value = CardValue.ACE;
        String expectedValue = "ace";
        String actualValue = value.toValue();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void parseJsonObject() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        String sample = "{\"suit\":\"spade\", \"value\":\"ace\"}";
        CardValue expected = CardValue.ACE;
        Card actual = mapper.readValue(sample, Card.class);
        Assert.assertEquals(expected, actual.getValue());
    }
}
