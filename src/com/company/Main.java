package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Witamy w systemie totalizatora!");
        TimeUnit.SECONDS.sleep(1);
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
        sys.registerObserverToGame(ios, g);
        sys.registerObserverToGame(windows, g);
        sys.registerObserverToGame(black, g);
        sys.registerObserverToGame(and, g);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Utworzono grę GameType1");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Nowa gra rozpoczyna się za: ");
        for(int i = 3; i >=0; i--){
            TimeUnit.SECONDS.sleep(1);
            System.out.print("\r" + i);
        }
        System.out.println();
        System.out.println("System wykonał losowanie w grze GameType1");
        sys.playGame(g);

        sys.notifyEveryone();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Wyrzucam obserwatora : " + ios);
        sys.kickObserver(ios);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Nowa gra rozpoczyna się za: ");
        for(int i = 3; i >=0; i--){
            TimeUnit.SECONDS.sleep(1);
            System.out.print("\r" + i);
        }
        System.out.println();
        sys.playGame(g);
        sys.notifyEveryone();






    }
}
