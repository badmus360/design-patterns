package org.example.SingletonDesignPattern;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {
            "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g",
            "h", "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j",
            "k", "l", "l", "l", "l", "l","m", "m", "n", "n", "n", "n", "n", "n",
            "n", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r",
            "r", "r", "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t",
            "u", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",
    };

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;
    private Singleton(){ }
    public static Singleton getInstance() {
        if(firstInstance == null) {

            firstInstance = new Singleton();

        }

         return firstInstance;

    }
}
