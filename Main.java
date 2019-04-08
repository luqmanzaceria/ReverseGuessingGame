
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {

        String choice;

        System.out.println("Welcome to Reverse Guessing Game!");
        System.out.println("Would you like to play?");


        System.out.println("(Type yes or no)");
        Scanner yesno = new Scanner(System.in);
        choice = yesno.nextLine();

        if (choice.equals("no")) {

            System.out.println("Hope you play next time!");
            System.exit(0);
        }
        else{

            String input;
            Integer maxnum = null;
            int minnum = 1;


            System.out.println("Please pick a range you would like to play in (1 - ?).");


            do {
                System.out.println("The number should be greater than 2.");

                try {
                    Scanner range = new Scanner(System.in);
                    input = range.nextLine();
                    maxnum = Integer.parseInt(input);
                }
                catch(Exception e){
                    System.out.println("Your input is not valid. Please enter a number." );
                }


            }while (maxnum==null || maxnum<=2);





            String proceed;


            System.out.println("Your range is 1 - " + maxnum + ". Pick a number within your chosen range.");
            int tries;
            tries = 1;

            do {
                System.out.println("Enter (ready) when you have picked a number, or (quit) if you would like to exit the game.");

                Scanner ready = new Scanner(System.in);
                proceed = ready.nextLine();

                if (proceed.equalsIgnoreCase("quit")) {
                    System.out.println("Hope you play next time!");
                    System.exit(0);

                }
            } while (!proceed.equalsIgnoreCase("ready"));
            String conclusion;
            do {
                int guess;
                guess = (Math.round(maxnum + minnum) / 2);

                System.out.println("Is your number (higher), (lower), or the (same) as " + guess + "?");
                Scanner rightorwrong = new Scanner(System.in);
                conclusion = rightorwrong.nextLine();


                if (conclusion.equalsIgnoreCase("higher")) {
                    tries++;
                    minnum = guess;

                } else if (conclusion.equalsIgnoreCase("lower")) {
                    tries++;
                    maxnum = guess;
                }
            } while (!conclusion.equalsIgnoreCase("same"));
            if (tries <= 1) {
                System.out.println("The computer took " + tries + " try");
                System.out.println("Thanks for playing!");

            } else {
                System.out.println("The computer took " + tries + " tries");
                System.out.println("Thanks for playing!");
            }
        }
    }
}

