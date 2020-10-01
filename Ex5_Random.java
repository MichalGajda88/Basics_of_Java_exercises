package pl.fablab.java.zadania.moje;

import java.util.Random;

public class Ex5_Random {
//   5. Write a program that draws 1000 numbers in the range -10..10, writes them to the array. Prints the quantity
//   positive and negative numbers, max and min, average, how many elements are greater and how many
//   less than average

    public static int aboveBelowZero(int [] tab){

        int counter = 0;

        for (int i = 0; i<=tab.length -1;i++){

            if (tab[i]>0){
                counter ++;
            }

        }return counter;

    }
    public static int countBelowZero(int [] tab){

        int counter = 0;

        for (int i = 0; i<=tab.length -1;i++){

            if (tab[i]<0){
                counter ++;
            }

        }return counter;

    }

    public static int min (int [] tab){

        int min = 11;

        for (int i=0; i<=tab.length - 1; i++){

            if (tab[i] < min ){

                min = tab[i];

            }

        }return min;

    }
    public static int max (int [] tab){

        int max = -11;

        for (int i=0; i<=tab.length - 1; i++){

            if (tab[i] > max ){

               max = tab[i];

            }

        }return max;

    }

    public static int avg (int [] tab){

        int avg = 0;

        for (int i=0; i<=tab.length - 1 ; i++){

           avg = sum(tab)/ tab.length;

        }return avg;

    }

    public static int countBelowAvg(int [] tab, int threshold){

        int counter = 0;

        for (int i=0; i <= tab.length - 1; i++){

            if (tab[i] < threshold){

                counter++;

            }

        }return counter;

    }

    public static int sum (int [] tab){
        int result = 0;
        for (int i = 0; i<=tab.length -1;i++){

            result += tab[i];

        }
        return result;
    }

    public static void main(String[] args) {
    Random generator = new Random();
    int [] tab = new int[10];

    for (int i=0;i<= tab.length -1;i++){

        tab [i]  = generator.nextInt(20) - 10;
        System.out.println(tab[i]);
    }
        System.out.println("Sum of table values: " + sum(tab));
        System.out.println("Below zero: " + countBelowZero(tab));
        System.out.println("Above zero: " + aboveBelowZero(tab));
        System.out.println("Maximum: " + max(tab));
        System.out.println("Minimum: " + min(tab));
        System.out.println("Average value: " + avg (tab));
        System.out.println("Below average value: " + countBelowAvg(tab,avg(tab)));
    }

}
