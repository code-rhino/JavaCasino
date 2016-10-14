package io.zipcoder.core.game;

import io.zipcoder.cardgame.BlackJack;
import io.zipcoder.core.game.Game;
import io.zipcoder.core.game.GameBuilderException;
import io.zipcoder.core.game.GameManagerBuilder;
import org.junit.Assert;
import org.junit.Test;



public class GameManagerBuilderTest {

    @Test
    public void loadClassFromStringTest() throws GameBuilderException {
        BlackJack expected = new BlackJack();
        System.out.println(expected.getClass().getName());
        Game actual = GameManagerBuilder.loadClassFromString("io.zipcoder.cardgame.BlackJack");
        Assert.assertEquals(expected.getClass(), actual.getClass());
    }


}


