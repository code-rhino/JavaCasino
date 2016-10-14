package io.zipcoder.core.game;


import io.zipcoder.core.storage.FileStorage;

import java.util.ArrayList;

public class GameManagerBuilder {

    private static final String configuration = "configuration.resource";

    public static GameManager build(){
        return new GameManager(buildPlayableGameSet());
    }

    private static ArrayList<Game> buildPlayableGameSet(){
        ArrayList<Game> games = new ArrayList<Game>();
        FileStorage storage = new FileStorage(configuration);
        String[] files = (storage.readData()).split("\\r?\\n");
        for(String file:files){
            try {
                Game game = loadClassFromString(file);
                games.add(game);

            }catch (GameBuilderException exception){

            }
        }
        return games;
    }

    protected static Game loadClassFromString(String className) throws GameBuilderException{
        Game game = null;
        try {
            game = (Game) Class.forName(className).newInstance();
        }catch (ClassNotFoundException exception){
            throw new GameBuilderException("No Class Found");

        } catch (IllegalAccessException exception){
            throw new GameBuilderException("Illegal Access");

        } catch (InstantiationException exception){
            throw new GameBuilderException("Instatiation Error");
        }
        return game;
    }
}

