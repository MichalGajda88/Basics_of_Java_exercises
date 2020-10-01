package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Zad6 {
//    6. Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie
//    wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce
//    dwukropka mają się pojawić liczby od podanej przez użytkownika do 0.

    public static int getUserInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj czas do wybuchu: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {

        int timer = getUserInput();

    }

}
