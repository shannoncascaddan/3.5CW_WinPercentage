import java.text.NumberFormat;
import java.util.Scanner;
public class winPercentage
{
    //Computes the percentage of games won by a team
    public static void main(String[] args)
    {
        final int NUM_GAMES = 12;
        int won;
        double ratio;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter the number of games won (0 to "+NUM_GAMES+"): ");
        won = keyboard.nextInt();

        while (won < 0 || won > NUM_GAMES)
        {
            System.out.print("Invalid input. Please reenter: ");
            won = keyboard.nextInt();
        }
        ratio = (double) won/NUM_GAMES;

        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println();
        System.out.println("Winning percentage: " +fmt.format(ratio));
    }//end main
}//end class
