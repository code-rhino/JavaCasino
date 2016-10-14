package io.zipcoder.core;


import io.zipcoder.core.prompt.PromptMessage;
import io.zipcoder.core.prompt.PromptRepositoryManager;

import java.util.Scanner;

public class Display {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void promptPreparedUserMessage(String messageTitle){
        PromptMessage output = PromptRepositoryManager.getMessageByTitle(messageTitle);
        System.out.println(output.getBody());
    }

    public static void promptUser(String msg){
        System.out.println(msg);
    }

    public static String promptUserForString(String msg){
        String response;
        System.out.println(msg);
        try {
            response = scanner.next();
        } catch (Exception exception){
            System.out.println("Please enter a valid response");
            response = promptUserForString(msg);
        }
        return response;
    }

    public static Double promptUserForDouble(String msg){
        Double response;
        System.out.println(msg);
        try {
            response = scanner.nextDouble();
        } catch (Exception exception){
            System.out.println("Please enter a valid amount");
            response = promptUserForDouble(msg);
        }
        return response;
    }

    public static Integer promptUserForInteger(String msg){
        Integer response;
        System.out.println(msg);
        try{
            response = Integer.valueOf(scanner.next());
        } catch (Exception exception){
            System.out.println("Please enter a valid number");
            response = promptUserForInteger(msg);
        }
        return response;
    }

}
