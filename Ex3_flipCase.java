package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex3_flipCase {
//    3. Write the function String flipCase (String text) which will convert lower case letters to capital letters
//       and vice versa in the string given as a parameter.


    public static String getUserInput() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the sentence: ");
        return scan.nextLine();
    }

    static String flipCase (String text){

        String result = " ";

        char [] letters = text.toCharArray();

        for (char letter:letters){

            if (Character.isLowerCase(letter)){
                result += Character.toUpperCase(letter);
            }else result += Character.toLowerCase(letter);

        }
        return result;

    }
    public static void main(String[] args) {
        String words = getUserInput();

        System.out.printf("Lower case letters to capital letters and vice versa:\n" + flipCase(words));
    }

}

