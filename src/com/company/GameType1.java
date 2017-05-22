package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gabrysia on 22.05.2017.
 */
public class GameType1 implements Game {
    private Score score;


    @Override
    public void play() {
        Random r = new Random();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 6; i++){
            list.add(r.nextInt(50));
        }
        score = new Score(list);
    }

    @Override
    public Score getScore() {
        return score;
    }
}
