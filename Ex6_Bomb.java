package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex6_Bomb {
//    6. Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie
//    wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce
//    dwukropka mają się pojawić liczby od podanej przez użytkownika do 0.

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
