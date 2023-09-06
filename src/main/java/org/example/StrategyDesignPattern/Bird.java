package org.example.StrategyDesignPattern;

public class Bird extends Animal {

    public Bird(){
        super();

        setSound("Tweet");

        flyingType = new ItFlys();

    }
}
