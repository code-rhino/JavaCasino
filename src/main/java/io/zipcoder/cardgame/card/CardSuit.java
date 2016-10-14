package io.zipcoder.cardgame.card;


import com.sun.tools.javac.util.StringUtils;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum CardSuit {
    SPADE, CLUB, HEART, DIAMOND;

    private static Map<String, CardSuit> map = new HashMap<>();

    static {
        map.put("spade", SPADE);
        map.put("club", CLUB);
        map.put("heart", HEART);
        map.put("diamond", DIAMOND);
    }

    @JsonCreator
    public static CardSuit forValue(String value){
        return map.get(StringUtils.toLowerCase(value));
    }

    @JsonValue
    public String toValue() {
        for(Map.Entry<String, CardSuit> entry : map.entrySet()){
            if(entry.getValue() == this){
                return entry.getKey();
            }
        }
        return null;
    }
}
