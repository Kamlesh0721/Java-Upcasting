package Upcasting.War_Game.Game_Component;

import java.util.Scanner;

public class Game {
    public Weapon equipWeapon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score (1-100): ");
        int score = sc.nextInt();
        if (score <= 10) {
            System.out.println("Equipped Knife . ");
            Knife k = new Knife();
            return k;
        } else if (score <= 50) {
            System.out.println("Equipped Gun .");
            Gun g = new Gun();
            return g;
        } else {
            System.out.println("Bomb Equipped .");
            Bomb b = new Bomb();
            return b;
        }
    }
}
