package com.company;

import java.util.Random;


public abstract class User {
    private String id;

    public void initialize() {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            id += c;
        }
        id += String.valueOf(GameSystem.nextID++);

    }

    public void sendResults(Score score) {
        System.out.println(score);
    }
}
