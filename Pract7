package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main 
{
    static GameDrunker game = new GameDrunker();
    static ArrayDeque<Integer> player1 = new ArrayDeque<Integer>(5);
    static ArrayDeque<Integer> player2 = new ArrayDeque<Integer>(5);
    static int card1 = 0;
    static int card2 = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Player 1 cards: ");
        game.inputData(player1, s);
        game.outputData(player1);
        System.out.print("Player 2 cards: ");
        game.inputData(player2, s);
        game.outputData(player2);
        while (true) {
            if (game.getRun() > 106) {
                System.out.println("Botva");
                break;
            }
            if (player1.size() == 0 || player2.size() == 0) {
                if (player1.size() == 0) {
                    System.out.println("Player 2 win!");
                    System.out.println(game.getRun());
                }
                else if (player2.size() == 0) {
                    System.out.println("Player 1 win!");
                    System.out.println(game.getRun());
                }
                break;
            }
            game.checkCards(player1, player2, card1, card2);
        }
    }
}




package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class GameDrunker {
    int run = 0;

    public void inputData(ArrayDeque<Integer> arr, Scanner s) {
        for (int i = 0; i < 5; i++)
            arr.add(s.nextInt());
    }

    public void outputData(ArrayDeque<Integer> arr) {
        System.out.print(arr + "\n");
    }

    public void checkCards(ArrayDeque<Integer> arr1, ArrayDeque<Integer> arr2, int c1, int c2) {
        c1 = arr1.getFirst();
        c2 = arr2.getFirst();

        if ((c1 > c2) && (c1 != 0 && c2 != 0)) {
            arr1.removeFirst();
            arr1.add(c1);
            arr1.add(c2);
            arr2.removeFirst();
        }
        else if ((c1 < c2) && (c1 != 0 && c2 != 0)){
            arr2.removeFirst();
            arr2.add(c2);
            arr2.add(c1);
            arr1.removeFirst();
        }
        else if (c1 == 0 && c2 == 9) {
            arr1.removeFirst();
            arr1.add(c1);
            arr1.add(c2);
            arr2.removeFirst();
        }
        else if (c1 == 9 && c2 == 0) {
            arr2.removeFirst();
            arr2.add(c2);
            arr2.add(c1);
            arr1.removeFirst();
        }
        this.run += 1;

    }

    public int getRun() {
        return run;
    }
}

