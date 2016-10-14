package io.zipcoder.cardgame.card;


import io.zipcoder.core.storage.Storage;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CardRepository {
    private ArrayList<Card> cards;
    private Storage storage;

    public CardRepository(Storage storage){
        this.storage = storage;
        loadDataFromStorage();
    }

    private void loadDataFromStorage(){
        Card[] tempCards;
        ObjectMapper mapper = new ObjectMapper();
        try {
            tempCards = mapper.readValue(storage.readData(), Card[].class);
            cards = new ArrayList<>(Arrays.asList(tempCards));
        }catch(IOException execption){
            cards = new ArrayList<>();
        }
    }

    public ArrayList<Card> getCards(){
        return cards;
    }


}
