package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Gabrysia on 22.05.2017.
 *
 */

public class GameSystem {
    public static int nextID;

    private Map<User, Game> userToGameMap = new HashMap<>();
    private Map<Game, Score> scoresMap = new HashMap<>();
    private List<User> observerList = new ArrayList<>();

    public void registerObserver(User u){
        observerList.add(u);
    }
    public void registerObserverToGame(User u, Game g){
        userToGameMap.put(u,g);
    }
    public void kickObserver(User u){
        observerList.remove(u);
        userToGameMap.remove(u);
    }
    void playGame(Game g){
        g.play();
    }
    Score getScore(Game g){
        return scoresMap.get(g);
    }
    void setScore(Game g){
        scoresMap.put(g, g.getScore());
    }
    public void notifyEveryone(){
        for (User user: observerList) {
            user.sendResults(userToGameMap.get(user).getScore());
        }
    }

}
