import java.util.Random;

/**
 * Created by Mark on 7/10/2017.
 */
public class ComputerPlayer extends Player{



    //create a random number generator that choose 1-3



    public static String runGenerator(){
        String computerPlayer;
        Random ran = new Random();
        int i = ran.nextInt(3);
        if(i==0){
            computerPlayer = Player.Roshambo.ROCK.toString();
        }else if (i ==1){
            computerPlayer = Roshambo.PAPER.toString();
        }else {
            computerPlayer = Roshambo.SCISSORS.toString();
        }
     return computerPlayer;
    }

    @Override
    public Roshambo generateRoshambo() {
        return null;
    }
}
