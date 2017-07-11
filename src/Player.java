/**
 * Created by Mark on 7/10/2017.
 */
public abstract class Player {

    public enum Roshambo {ROCK, PAPER, SCISSORS}
    //this class will store a name and Roshambo value

    private String name;
    public static Roshambo choice;

    //because were returning type, roshambo
    public abstract Roshambo generateRoshambo();
        //going to need another method in here to get the player input and return the player input
        //need getter for roshambo because its going to determine which value it takes in and returns
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Roshambo getChoice() {
        return choice;
    }

    public static void runChoice(){

    }

    public void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public static void runComputerPlayer(){
        //String opponent = "";
        if("Dwayne Johnson"==RoshamboApp.opponent){
            RoshamboApp.computerChoice = RockPlayer.rockPlayer;
        }
        else{
        RoshamboApp.computerChoice = ComputerPlayer.runGenerator();
        }
    }

}

