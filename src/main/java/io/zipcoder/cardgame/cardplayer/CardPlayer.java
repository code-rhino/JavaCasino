package io.zipcoder.cardgame.cardplayer;

import io.zipcoder.core.player.Player;

public class CardPlayer{

    private Player player;
    private PlayerHand playerHand;
    private boolean isDealer;

    public CardPlayer(Player player){
        this.player = player;
        playerHand = new PlayerHand();
        isDealer = false;
    }

    public CardPlayer(){
        playerHand = new PlayerHand();
        isDealer = true;
    }

    public PlayerHand getPlayerHand(){
        return playerHand;
    }
}
