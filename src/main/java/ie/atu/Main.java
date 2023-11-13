package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        while(x<1){
            System.out.println("please enter a number between 0-9 :");
            Scanner myscan = new Scanner(System.in);


            // adding in try
            try {
                //Read user input as a string
                String input = myscan.nextLine();

                // parse the input to an integer
                int myNum = Integer.parseInt(input);

                // check if the number is between 0 abd 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("you entered " + myNum);
                    x++;
                } else {
                    System.out.println("not a valid number ");
                }
            }

            //adding in catch
            catch(NumberFormatException e){
                System.out.println("not a valid number ");
            }

        }



    }
}