package com.company;

import java.util.ArrayList;

/**
 * Created by Gabrysia on 22.05.2017.
 */
public class Score {
    private ArrayList<Integer> numbersList;

    Score(ArrayList<Integer> list){
        numbersList = list;
    }

    public String toString(){
        String res = "";
        for (Integer i: numbersList
             ) {
            res = res + " " + i;
        }
        res += "\n";
        return res;
    }

}
