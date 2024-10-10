public class SnakeEyes{

    public static int countRollsUntilSnakeEyes(){

        boolean snakeEyes = false;
        int countRoll = 0;

        while (!snakeEyes){
            int numberOne = (int)(Math.random()*6 + 1);
            int numberTwo = (int)(Math.random()*6 + 1);
            countRoll++;

            if (numberOne == 1 && numberTwo == 1){
                snakeEyes = true;
             }
        }
        return countRoll;
    }

    public static void main(String[] args) {

        int rolls = countRollsUntilSnakeEyes();
        System.out.println("Hello");
        System.out.printf("there were %d tries before you got snake eyes", rolls);
    }
}