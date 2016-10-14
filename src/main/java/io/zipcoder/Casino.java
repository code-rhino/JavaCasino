package io.zipcoder;

import io.zipcoder.core.game.GameManager;
import io.zipcoder.core.game.GameManagerBuilder;

/**
 * Created by thook on 10/10/16.
 */
public class Casino {

    public static void main(String[] args){
        GameManager gameManager = GameManagerBuilder.build();
        gameManager.start();
    }
}
