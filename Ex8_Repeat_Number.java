package pl.fablab.java.zadania.moje;

import java.util.Random;

public class Ex8_Repeat_Number {

//    8. Write a program that creates an array of 20 integers from the 1 interval. . . 10, a
//    then print on the screen the number of times each number in this interval repeats in
//    array.

    public static void main(String[] args) {
        Random generator = new Random();
        int counter = 0;

        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {

            numbers[generator.nextInt(10) + 1]++;

        }

        for (int i = 1; i <= 10; i++) {

            System.out.printf("Number %d has occurred %d times\n", i, numbers[i]);

        }
    }
}


