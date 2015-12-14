/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bertrand_3_game;

import java.util.Scanner;

/**
 *
 * @author Kriber
 */
public class Bertrand_3_Game {

    static Scanner sc = new Scanner(System.in);
    static String ar;
    static boolean goodAnswer = false;

    public static void main(String[] args) {
        // TODO code application logic here
        start();
    }

    public static void start() {
        while (!goodAnswer) {
            System.out.println("Want to play a game?");
            ar = sc.nextLine().toLowerCase();
            if (ar.contains("y")) {
                goodAnswer = true;
                System.out.println("You wake up out of bed do you brush your teeth[1] or just go eat breakfast[2]");
                ar = sc.nextLine().toLowerCase();
                goodAnswer = true;
                if (ar.contains("2")) {
                    System.out.println("you go to your fridge feeling disgusting because you did not brush your teeth(-10HP)\n you open the fridge and see nothing but year old leftovers, do you Eat the leftovers[1] or go to the store for food[2]");
                    ar = sc.nextLine().toLowerCase();
                    goodAnswer = true;
                    if (ar.contains("1")) {
                        System.out.println("You eat the leftovers and proceed to grow sick.\n I"
                                + "t gets so bad that doctors can not help you.\n Eventually your body can't take it anymore and you die.");
                    
                    } else if (ar.contains("2")) {
                        System.out.println("You get in your car and realize you are almost out of gas do you go to the gas station[1] or go to the store[2]");
                        ar = sc.nextLine();
                        goodAnswer = true;
                        {
                            System.out.println("You run out of gas while driving to your location do you Hitchhike[1] or do you walk[2] ");
                            ar = sc.nextLine();
                            goodAnswer = true;
                        }
                    }
                    if (ar.contains("1")) {
                        System.out.println("A man comes in a sketchy white van and offers you a ride do you get in[1] or do you run away[2]");
                        ar = sc.nextLine();
                        goodAnswer = true;
                        if (ar.contains("2")) {
                            System.out.println("You run back home and then grow too lazy to go to the store so you eventually starve to death");
                            ar = sc.nextLine();
                            goodAnswer = false;
                        } else if (ar.contains("1")) {
                            System.out.println("You get in and he kidnaps you, tortures you, and eventually kills you.");
                            ar = sc.nextLine();
                            goodAnswer = false;

                        } else if (ar.contains("2")) {
                            System.out.println("As you're walking A homeless guy steals all of your stuff except for 100 gold do you Chase after him [1] or Call the police[2]");
                            ar = sc.nextLine();
                            goodAnswer = false;

                        }
                    } else if (ar.contains("1")) {
                        System.out.println("you go to the bathroom.\n The tooth brush looks unnatural and unsafe do you go to the store for a new one[1] or brush your teeth[2] ");
                        ar = sc.nextLine();
                        goodAnswer = true;
                        if (ar.contains("1")) {
                        }

                    } else if (ar.contains("n")) {
                        goodAnswer = true;
                        System.out.println("Bye");

                    } else {
                        System.out.println("I don't understand. ");
                        goodAnswer = true;

                    }
                }
            }
        }
    }
}
