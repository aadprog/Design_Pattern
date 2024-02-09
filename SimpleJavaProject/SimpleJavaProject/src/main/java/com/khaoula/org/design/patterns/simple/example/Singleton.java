package com.khaoula.org.design.patterns.simple.example;

public class Singleton {

    private static Singleton Sing;

    // Constructeur privé
    private Singleton() {
    }

    public static Singleton getInstance() {
    	
        if (Sing == null) {
            Sing = new Singleton();
        }
        return Sing;
    }
}
