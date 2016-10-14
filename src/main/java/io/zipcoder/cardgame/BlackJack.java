package io.zipcoder.cardgame;

import io.zipcoder.core.player.Player;

import java.util.Set;

import static io.zipcoder.core.Display.*;

public class BlackJack extends CardGame {

    public void play(Set<Player> players) {
        promptUser("BlackJackWelcomeMessage");
    }

}
