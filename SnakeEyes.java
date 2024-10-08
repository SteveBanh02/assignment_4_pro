import java.util.Scanner;

public class SnakeEyes{


    public void guessNumRight(int number){

        int randomNum = (int)(Math.random()*6 + 1);
        
        if (number == randomNum){
            System.out.println("congrads you got the right number");
        }else {
            System.out.println("better luck next time");
        }

        System.out.println("the random number is " + randomNum);

    }

    public static void main(String[] args) {

        
    }
}