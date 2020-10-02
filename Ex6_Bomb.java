package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex6_Bomb {
    //6. Write a program that will take a positive integer from the user. Next
    // display the countdown on the screen with the text "The bomb will explode in ..." where to place
    // colon numbers from user specified to 0 should appear.

    public static int getUserInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time to explosion: ");
        return scan.nextInt();
    }

    public static void main(String[] args) throws InterruptedException {

        int timer = getUserInput();

        while (timer > 0) {
            for (int i = timer; i >= 1; i--) {

                System.out.printf("Bomb will explode in %d second(s)\n", i);
                Thread.sleep(1000);

                if (i == 1) {
                    System.out.println("BOOM!");
                }
            }
        }
    }
}
