import java.util.Scanner;

/**
 * Created by Mark on 7/10/2017.
 */
public class RoshamboApp {
    public static String opponent = "";
    public static String computerChoice = "";
    //or just use strings
    //public enum Roshambo {ROCK, PAPER, SCISSORS}
    //public enum Roshambo(){
    //ROCK, PAPER, SCISSORS;
    //@Override
    //public String toString(){

    // }
    //}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "";


        System.out.println("Hello, Please enter your name: ");
        userName = scan.nextLine();
        System.out.println(userName);
        String cont = "y";

        while (cont.equalsIgnoreCase("y")) {
            System.out.println("Who would you like to compete against, Dwayne Johnson or Watson?: ");
            opponent = scan.nextLine();
            String  hpChoice = HumanPlayer.runHumanPlayer();
            Player.runComputerPlayer();
            System.out.println(userName + ": " + hpChoice);
            if ("Dwayne Johnson".equalsIgnoreCase(opponent)) {
                RockPlayer rp = new RockPlayer();
                System.out.println("Dwayne Johnson: " + rp.generateRoshambo() );
            } else {
                System.out.println("Watson: " + computerChoice);
            }
            //create an enumeration called Roshambo that stores 3 values, rock paper, scissors,
            //should include a toString method that can convert the selected value to a string
            System.out.println("");
            System.out.println("Would you like to continue:");
            System.out.println("Please enter Y or N: ");
            cont = scan.nextLine();
        }
        System.out.println("Goodbye");

    }


}
