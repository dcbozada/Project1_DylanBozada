//Importing Scanner for user input
import java.util.Scanner;

public class Project1_DylanBozada {
    public static void main(String [] args)
    {
        // Creating scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompting user to enter desired wake up time in 24-hour notation
        System.out.print("Please enter the time you would like to wake up tomorrow in 24-hour notation: ");
        int H = input.nextInt();
        int M  = input.nextInt();

        // Checking if user input is valid
        if (H > 23 || M > 59)
        {
            System.out.print("That input is invalid, please enter a " +
                    "correct value for 24-hour notation: ");
            H = input.nextInt();
            M  = input.nextInt();
        }
        else
           System.out.print("Your new alarm is set at ");
            printNewTime(H,M);
    }

    public static void printNewTime(int h, int m)
    {
        if(m >= 45 && m <= 59) {
            m -= 45;
            System.out.printf("Your alarm is set at %02d:%02d", h, m);
        }
        else {
            int remain = 45 - m;
            int newM = 60 - remain;
            m = newM;
            h -= 1;
            System.out.printf("Your alarm is set at %02d:%02d", h, m);        }
    }
}
