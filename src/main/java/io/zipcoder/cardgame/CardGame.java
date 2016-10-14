package io.zipcoder.cardgame;


import io.zipcoder.cardgame.cardplayer.CardPlayer;
import io.zipcoder.cardgame.deck.Deck;
import io.zipcoder.cardgame.deck.DeckBuilder;
import io.zipcoder.core.game.Game;
import io.zipcoder.core.player.Player;

import java.util.ArrayList;
import java.util.Set;

public abstract class CardGame extends Game {

    public Deck deck;
    public CardPlayer dealer;
    protected ArrayList<CardPlayer> cardPlayers;

    public CardGame(){
        super();
        deck = DeckBuilder.build();
        dealer = new CardPlayer();
        cardPlayers = new ArrayList<>();
    }


    public void play(Set<Player> players){
        initializeCardPlayers(players);
        beginGameLoop();
    }

    private void initializeCardPlayers(Set<Player> players){
        cardPlayers = new ArrayList<>();
        for(Player player : players){
            CardPlayer cardPlayer = new CardPlayer(player);
            cardPlayers.add(cardPlayer);
        }
    }

    public abstract void beginGameLoop();

}
