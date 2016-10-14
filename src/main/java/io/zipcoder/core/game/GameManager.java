package io.zipcoder.core.game;


import io.zipcoder.core.Display;
import io.zipcoder.core.player.Player;
import io.zipcoder.core.player.PlayerFactory;
import static io.zipcoder.core.Display.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class GameManager {
    private ArrayList<Game> games;
    private Set<Player> players;

    public GameManager(ArrayList<Game> games){
        this.games = games;
        players = new LinkedHashSet<Player>();
    }

    private void selectGame(){
        displayRegisteredUsers();
        displayUserMenuOptions();
        String selection = promptUserForString("Please select a game: ");
        Integer parsedSelection = parseToValidIndexSelection(selection);
        if(parsedSelection != null){
            loadGameAtSelectedIndex(parsedSelection);
        } else {
            selectNonGameOption(selection);
        }
    }

    private void displayRegisteredUsers(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Registered (%d) Players{", players.size()));
        for(Player player: players){
            builder.append(player.getName() +", ");
        }
        builder.append("}");
        promptUser(builder.toString());
    }

    private void selectNonGameOption(String string){
        switch (string){
            case "quit":
                promptUser("GoodBye");
                break;
            default:
                promptUser("Unknown response");
                selectGame();
                break;
        }

    }

    private Integer parseToValidIndexSelection(String input){
        try{
            Integer selection = Integer.parseInt(input);
            return (selection > games.size()) ? null : selection;
        }catch (Exception exception){
            return null;
        }
    }

    public void start(){
        while(true){
            if(players.isEmpty()){
                loadPlayers();
            } else {
                selectGame();
            }
        }
    }

    private void loadPlayers(){
        while(true){
            Player player = PlayerFactory.createNewPlayer();
            players.add(player);
            String response = Display.promptUserForString("Would you like to add another player?(yes/no)");
            if(response.equals("no")){
                return;
            }
        }
    }



    private void loadGameAtSelectedIndex(Integer index){

        Game game = games.get(index - 1);
        game.play(players);
        selectGame();
    }

    private void displayUserMenuOptions(){
        promptPreparedUserMessage("GameManagerWelcome");
        int index = 1;
        for(Game game:games){
            promptUser(index+ ") "+game.displayMenuOptionText());
            index ++;
        }
    }
}
