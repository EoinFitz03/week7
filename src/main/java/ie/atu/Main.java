package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0-9 :");
        Scanner myscan = new Scanner(System.in);

        try {
            //Read user input as a string
            String input = myscan.nextLine();

            // parse the input to an integer
            int myNum = Integer.parseInt(input);

            // checkmif the number is between 0 abd 9
            if (myNum >= 0 && myNum <= 9) {
                System.out.println("you entered " + myNum);
            } else {
                System.out.println("not a valid number ");
            }
        }

        catch(NumberFormatException e){
            System.out.println("please enter a valid number ");
        }

    }
}