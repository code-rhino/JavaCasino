package io.zipcoder.core.game;


import io.zipcoder.core.player.Player;
import java.util.Set;

public abstract class Game {


    public abstract void play(Set<Player> players);

    public String displayMenuOptionText(){
        return this.getClass().getSimpleName();
    }
}
