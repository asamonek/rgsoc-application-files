// Module 2 assessment project


import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {

        // Introduction
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hi " +  name + ", which do you choose? (O)dds or (E)vens?");
        Scanner answer1 = new Scanner(System.in);
        String userReply = answer1.next();
        if (userReply.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        for (int i = 0 ; i <= 29; i++) {
            System.out.print("-");
        }

        // Game Play : inserting the results
        System.out.println("");
        System.out.print("How many “fingers” do you put out? ");
        Scanner fingers = new Scanner(System.in);
        int userFingers = fingers.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer +  " \"fingers\".");

        for (int i = 0 ; i <= 29; i++) {
            System.out.print("-");
        }
        System.out.println("");

        // Game Play : determining the results
        int sum = userFingers + computer;
        System.out.println(userFingers + " + " + computer + " = " + sum);
        if (sum % 2 == 0) {
            System.out.println( sum + " is...  even!");
            if (userReply.equals("0")) {
                System.out.println("This means that computer wins!");
            } else {
                System.out.println("This means that " + name + " wins!");
            }
        } else {
            System.out.println( sum + " is... odd!");
            if (userReply.equals("0")) {
                System.out.println("This means that " + name + " wins!");
            } else {
                System.out.println("This means that computer wins!");
            }
        }

        for (int i = 0 ; i <= 29; i++) {
            System.out.print("-");
        }
        System.out.println("");


    }

}
