import java.util.Scanner;

/**
 * Created by Mark on 7/10/2017.
 */
public class HumanPlayer extends Player{
    static Scanner scan = new Scanner (System.in);
    static String userName = "";
    public static String input = "";
    //now take user input and apply it to the variables
    //sout, whats your name
    //assign the input
    //name = scan.nextLine();
    //now were asking them to play the game, generate their roshambo
    //one is a random, one is always rock, and one is choosing through userinput


    //call this method from human player class
    @Override
    public  Roshambo generateRoshambo() {

        /*System.out.println("Choose rock paper or scissors: R/P/S");
        String input = scan.nextLine();
        //use conditional logic, one of 3 options
        if(input == "R"){
            input = Roshambo.ROCK.toString();
            System.out.println("do some task");
        }else if (input == "S"){
            input = Roshambo.SCISSORS.toString();
            System.out.println("Do something else");
        }else if (input == "P"){
            input = Roshambo.PAPER.toString();
        }*/
            //if you choose R thats rock, P is paper, S is scissors
        return null;
    }

    public static String runHumanPlayer(){
        System.out.println("Choose rock paper or scissors: R/P/S");
        input = scan.nextLine();
        //use conditional logic, one of 3 options
        if(input.equalsIgnoreCase("R")){
            input = Roshambo.ROCK.toString();
            //System.out.println("do some task");
        }else if (input.equalsIgnoreCase("S")){
            input = Roshambo.SCISSORS.toString();
            //System.out.println("Do something else");
        }else if (input.equalsIgnoreCase("P")){
            input = Roshambo.PAPER.toString();
        }
        return input;
    }

    //you can tie it into a validator that converts rock paper scissors to a value 1 2 oor 3 that converts it to a roshambo

    //were inheriting from abstract classs player so were extending the player class here

    //then take value of choice and figure out how to convert it back to a string

    //using value stored in variable to convert it to rock paper scissors

}
