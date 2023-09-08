import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ready for the guess Game ??");
    Random rand = new Random ();
//    number is between 1 to 100
        int Guess_num = rand.nextInt(101);


    while(true)
    {
        System.out.println("To exit press any negative Value :-(");
        Scanner a= new Scanner (System.in);
        int A= a.nextInt ( );
        if ( A>0) {
            System.out.println("Guess the number b/w 1 to 100  ");
            Scanner user_guess = new Scanner(System.in);
            int num = user_guess.nextInt();
            if (num == Guess_num) {

                System.out.println("Bingo you won");
                break;
            } else if (num > Guess_num) {
                System.out.println("Oh! You choose the greater number >>>");
                System.out.println("Lets try again !");
            } else {
                System.out.println("Oh! You choose the smaller number >>>");
                System.out.println("Lets try again !");
            }
        }
        else
            {
                break;
            };

    }


    }


    }
