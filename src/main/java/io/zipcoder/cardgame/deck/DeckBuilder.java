package io.zipcoder.cardgame.deck;


import io.zipcoder.cardgame.card.Card;
import io.zipcoder.cardgame.card.CardRepository;
import io.zipcoder.core.storage.FileStorage;

import java.util.ArrayList;

public class DeckBuilder {

    private static final String configuration = "DeckOfCards.json";

    public static Deck build() {return new Deck(buildDeck());}

    private static ArrayList<Card> buildDeck(){
        FileStorage storage = new FileStorage(configuration);
        CardRepository repository = new CardRepository(storage);
        return repository.getCards();
    }
}
