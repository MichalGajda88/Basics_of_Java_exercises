package pl.fablab.java.zadania.moje;

import java.util.Random;
import java.util.Scanner;

public class Ex7_Guess_the_number {

//  7. Playing Too Much, Too Little. The computer draws from the range 1.. . 100, the player
// (user) guesses what the number of research studies is
// values. If the given value is:
// a. wealth - the message "You entered the value too high" is displayed,
// b. displayed - the message "You entered a value too low" is displayed,
// c. identical to the displayed message CONGRATULATIONS, YOU WON

public static int getUserInput(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type your number:");

    return scanner.nextInt();
}

    public static void main(String[] args) {
        Random generator = new Random();

        int number = generator.nextInt(99) + 1;
        int userNumber = getUserInput(), counter = 1;


        while (number != userNumber) {

            if (number > userNumber) {
                System.out.println("Your number is too low, try again!");
            }

            if (number < userNumber) {
                System.out.println("Your number is too high, try again!");
            }
            userNumber = getUserInput();
            counter ++;
        }

        if (number == userNumber) {
            System.out.printf("Congratulations, You won! Number of attempts: %d", counter);
        }

    }
}


