package Practicas.Gamer;

import java.util.Random;

public class Special {
    static Random rand = new Random();
    static int strength = rand.nextInt(1, 11);
    static int perception = rand.nextInt(1, 11);
    static int endurance = rand.nextInt(1, 11);
    static int charisma = rand.nextInt(1, 11);
    static int intelligence = rand.nextInt(1, 11);
    static int agility = rand.nextInt(1, 11);
    static int luck = rand.nextInt(1, 11);
}
