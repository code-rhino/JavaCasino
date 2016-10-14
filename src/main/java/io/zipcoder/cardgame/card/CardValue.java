package io.zipcoder.cardgame.card;


import com.sun.tools.javac.util.StringUtils;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum CardValue {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    KING(10),
    QUEEN(10),
    ACE(11,1);

    private String name;
    private int primaryValue;
    private int secondaryValue;
    private static Map<String, CardValue> map = new HashMap<>();

    static {
        map.put("two",TWO);
        map.put("three",THREE);
        map.put("four",FOUR);
        map.put("five",FIVE);
        map.put("six",SIX);
        map.put("seven",SEVEN);
        map.put("eight",EIGHT);
        map.put("nine",NINE);
        map.put("ten",TEN);
        map.put("jack",JACK);
        map.put("king",KING);
        map.put("queen",QUEEN);
        map.put("ace",ACE);
    }

    CardValue(int primaryValue, int secondaryValue){
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;

    }

    CardValue(int primaryValue){
        this.primaryValue = primaryValue;
        this.secondaryValue = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimaryValue() {
        return primaryValue;
    }

    public void setPrimaryValue(int primaryValue) {
        this.primaryValue = primaryValue;
    }

    public int getSecondaryValue() {
        return secondaryValue;
    }

    public void setSecondaryValue(int secondaryValue) {
        this.secondaryValue = secondaryValue;
    }

    @JsonCreator
    public static CardValue forValue(String value){
        return map.get(StringUtils.toLowerCase(value));
    }

    @JsonValue
    public String toValue(){
        for(Map.Entry<String, CardValue> entry : map.entrySet()){
            if(entry.getValue() == this){
                return entry.getKey();
            }
        }
        return null;
    }
}
