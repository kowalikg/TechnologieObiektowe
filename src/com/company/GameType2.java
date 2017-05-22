package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gabrysia on 22.05.2017.
 */
public class GameType2 implements Game {
    private Score score;


    @Override
    public void play() {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++){
            list.add(r.nextInt(100));
        }
        score = new Score(list);
    }

    @Override
    public Score getScore() {
        return score;
    }
}
