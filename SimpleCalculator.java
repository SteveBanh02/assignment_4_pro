import java.util.Scanner;
public class SimpleCalculator{

    public static int calculation(int firstNumber, String operator, int secondNumber){

        int result = 0;
        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.println("invalid, please enter a number above 0");
                    return 0;
                }else{
                    result = firstNumber / secondNumber;
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter \"+\", \"-\", \"*\" or \"/\"");
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int firstNumber = -1;

        while(firstNumber != 0){
            System.out.println("please enter the first number (enter 0 to stop)");
            firstNumber = user.nextInt();

            if (firstNumber == 0){
                System.out.println("thank you for using our calculator");
                break;
            }
            
            System.out.println("please enter an operation");
            user.nextLine();
            String operator = user.nextLine();

            System.out.println("please enter a second number");
            int secondNumber = user.nextInt();

            System.out.printf("your result is %d \n", calculation(firstNumber, operator, secondNumber));
        }
    }
}