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
        System.out.println("Who would you like to compete against, Dwayne Johnson or Watson?: ");
        opponent = scan.nextLine();
        HumanPlayer.runHumanPlayer();
        Player.runComputerPlayer();
        System.out.println(userName+": "+HumanPlayer.input);
        if("Dwayne Johnson".equalsIgnoreCase(opponent)){
            System.out.println("Dwayne Johnson: ROCK");
        }
        else{System.out.println("Watson: "+computerChoice);}
        //create an enumeration called Roshambo that stores 3 values, rock paper, scissors,
        //should include a toString method that can convert the selected value to a string


    }


}
