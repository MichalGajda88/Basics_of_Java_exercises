package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex4_Sum_of_digits {

    //4. Write a program that sums the digits in text provided by the user

    public static String getUserInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        return scan.nextLine();
    }

    public static int SumDigits (String text){

        int result = 0;
        char [] chars = text.toCharArray();

        for (char c : chars){

            if (Character.isDigit(c)){

                result += Character.getNumericValue(c);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String phrase = getUserInput();

        System.out.printf("Sum of digits in your sentence: " + SumDigits(phrase));
    }

    }

