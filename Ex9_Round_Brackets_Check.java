package pl.fablab.java.zadania.moje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9_Round_Brackets_Check {

//  9. Write a program that will check if, in the arithmetic expression, which user has specified,
//  round brackets are correctly paired

    public static String getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz wyrażenie arytmetyczne:");
        return scanner.nextLine();

    }

    public static void main(String[] args) {

        String aritmetic = getUserInput();

        List<Character> lista = new ArrayList<Character>();
        int counter = 0;

        for (int i = 0; i <= aritmetic.length() - 1; i++) {

            if (aritmetic.charAt(i) == '(') {
                lista.add(aritmetic.charAt(i));
                counter++;
            }

            if (aritmetic.charAt(i) == ')' && lista.contains('(')) {
            counter--;
            }

            if (aritmetic.charAt(i) == ')' && !lista.contains('(')) {
            counter = -10000000;
            }
        }

        if (counter == 0 ){
            System.out.println("Round brackets are paired correctly");
        }else System.out.println("Round brackets are paired incorrectly");

    }

}
