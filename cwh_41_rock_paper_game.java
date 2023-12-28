import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;
public class cwh_41_rock_paper_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /* 0 for rock
        1 for paper
        2 for scissor
      */
        int UserWin = 0;
        int ComputerWin = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Game " + (i + 1));
            System.out.println("Enter 0 rock, 1 For Paper, 2 For Scissor ");
            int userInput = sc.nextInt();
            UserWin = 0;
            ComputerWin = 0;
            Random random = new Random();
            int ComputerInput = random.nextInt(3);

            if (userInput == ComputerInput) {
                System.out.println("Draw :");
            } else if (userInput == 0 && ComputerInput == 2 || userInput == 1 && ComputerInput == 0
                    || userInput == 2 && ComputerInput == 1) {
                System.out.println("You Win!");
                UserWin++;
            } else {
                System.out.println("Computer Wins!");
                ComputerWin++;
            }

            System.out.println("The wins of User is : " + UserWin + " And Wins Of Computer is :" + ComputerWin);
            if (ComputerInput == 0) {
                System.out.println("Computer Choice is Rock");
            } else if (ComputerInput == 1) {
                System.out.println("Computer Choice is Paper");
            } else {
                System.out.println("Computer Choice is : Scissor :");
            }
            if (ComputerWin == 3) {
                System.out.println("Computer is the winner ");
                break;
            } else if (UserWin == 3) {
                System.out.println("User is the winner ");
                break;
            }

        }

    }

}
