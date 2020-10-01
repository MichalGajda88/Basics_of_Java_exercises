package pl.fablab.java.zadania.moje;

import java.util.Scanner;

public class Ex2_Sentence_Backward {
// 2. On the given sentence, do:
// a. List the words in the sentence in the reverse order
// b. Write words with an even number of letters
// c. List words ending with a

    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the sentence:");

        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String sentence = getUserInput();
        String result1 = "", result2 = "", result3 = "";

        //a.
        String [] words = sentence.split(" ");

        for (int i= words.length-1; i>=0; i--){

            result1 += words[i] + " ";

            if (words[i].length()%2==0){

                result2 += words[i] + " ";
            }

            if (words[i].endsWith("a")){

                result3 += words[i] + " ";
            }

        }

        //a.
        System.out.println("Your sentence in backward:\n" + result1);

        //b.
        System.out.println("Words with even number of letters:\n" + result2);

        //c.
        System.out.println("Words that end with a:\n" + result3);
        }
    }