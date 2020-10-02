package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex1_Phrase_Backward {
//    1. Write a program that will display the given word with the letters in reverse order.

    public static String getUserInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the sentence: ");
        return scan.nextLine();
    }

    public static void main(String[] args) {

        String phrase = getUserInput();
        String result = "";

        for (int i=phrase.length() -1; i >= 0; i-- ){

            result += phrase.charAt(i);

        }
        System.out.printf("Your phrase displayed backwards:\n" + result);
    }
}
