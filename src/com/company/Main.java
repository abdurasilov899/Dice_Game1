package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rnd = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kub1Game();
    }
    static void kub1NewGame() {
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> Kub1Game();
            case 2 -> System.out.println(" FINISH GAME...!");
        }
    }
    static void Kub1Game() {
        ArrayList<Integer> summakubik = new ArrayList<>();
        ArrayList<Integer> komplayer = new ArrayList<>();
        ArrayList<Integer> summakubik2 = new ArrayList<>();
        ArrayList<Integer> player = new ArrayList<>();
        ArrayList<Integer> ariphmetici = new ArrayList<>();
        ArrayList<Integer> ariphmetick = new ArrayList<>();

        System.out.println("*_____START GAME_____*");
        int resultplayer = 0;
        int resultkompplayer = 0;
        int i = 0;
        int k = 0;
        int z = 0;
        int play = 0;
        System.out.println();
        do {
            System.out.print("Predict amount of points(2..12)");
            play = scanner.nextInt();
            try {
                if (play > 12 || play < 2) {
                    throw new Exceptiooon("12'den oido bolbow kerek...!!!");
                }
            } catch (Exceptiooon ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            int suma = kub1() + kub1();
            summakubik.add(suma);
            i = Math.abs(play - suma) * 2;
            ariphmetici.add(i);

            System.out.println("Predicate amount of points (" + play + ".." + suma + "): " + i);
            player.add(play);

            int kompplayer = rnd.nextInt(1, 7);
            komplayer.add(kompplayer);
            int summa2 = kub1() + kub1();
            summakubik2.add(summa2);
            k = Math.abs(kompplayer - summa2) * 2;
            ariphmetick.add(k);
            System.out.println("Predicate amount of points (" + kompplayer + ".." + summa2 + "): " + k);
            System.out.println();
            System.out.println("-------Current score-------");
            System.out.println();
            System.out.println("Play: " + i + " points");
            System.out.println("kompplayer: " + k + " points");
            System.out.println();
            System.out.println("" + Math.abs(i - k));

            if (i < k) {
                System.out.println("Komplayer WIN...!!!   Ochko->" + k);
                System.out.println();
            } else if (i > k) {
                System.out.println("Player WIN...!!!   Ochko->" + i);
                System.out.println();
            } else {
                System.out.println("EQUALS...!!!" + k + " - " + i);
            }
            z++;
        } while (z <= 2);

        System.out.println("*--------FINISH GAME--------*");
        System.out.println();
        System.out.println("Round |    Player            |     Kompplayer");
        System.out.println("_____________________________________________");
        int count = 0;
        for (int j = 0; j < 3; j++) {
            count++;
            System.out.println("      |    Predicted:  " + player.get(j) + "        |    Predicted: " + komplayer.get(j));
            System.out.println(count + "|         Dice:       " + summakubik.get(j) + "        |    Dice: " + summakubik2.get(j));
            System.out.println("      |    Result:     " + ariphmetici.get(j) + "        |    Result:" + ariphmetick.get(j));
            System.out.println("---------------------------------------------------------");
            resultkompplayer += ariphmetick.get(j);
            resultplayer += ariphmetici.get(j);
        }
        System.out.println("Total |    Points:     " + resultplayer + "    |    Points:" + resultkompplayer);
        System.out.println();
        System.out.println(" Start over the game Yes(1)/No(2)");
        kub1NewGame();
    }
    static int kub1() {
        // int b=scanner.nextInt();
        int a = rnd.nextInt(1, 7);
        if (a == 1) {
            System.out.println("""
                     *--------*
                     |   #    |
                     |        |\s
                     |        |
                     *--------*
                    """);
        }
        if (a == 2) {
            System.out.println("""
                     *--------*
                     |   #    |
                     |        |\s
                     |     #  |
                     *--------*
                    """);
        }
        if (a == 3) {
            System.out.println("""
                     *--------*
                     |   #    |
                     |    #   |\s
                     |     #  |
                     *--------*
                    """);
        }
        if (a == 4) {
            System.out.println("""
                     *--------*
                     |  #  #  |
                     |        |\s
                     |  #  #  |
                     *--------*
                    """);
        }
        if (a == 5) {
            System.out.println("""
                     *--------*
                     | #   #  |
                     | #   #  |\s
                     |   #    |
                     *--------*
                    """);
        }
        if (a == 6) {
            System.out.println("""
                     *--------*
                     | #   #  |
                     | #   #  |
                     | #   #  |
                     *--------*
                    """);
        }

        return a;
    }
}


