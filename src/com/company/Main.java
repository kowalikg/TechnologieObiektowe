package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witamy w systemie totalizatora!");
        GameSystem sys = new GameSystem();
        User windows = new WindowsUser();
        User ios = new iOsUser();
        User black = new BlackberryUser();
        User and = new AndroidUser();
        windows.initialize();
        ios.initialize();
        black.initialize();
        and.initialize();
        sys.registerObserver(windows);
        sys.registerObserver(ios);
        sys.registerObserver(black);
        sys.registerObserver(and);
        Game g = new GameType1();
        System.out.println("Utworzono grę GameType1");
        sys.playGame(g);



    }
}
