import java.util.Scanner;
import java.util.regex.*;
public class BreakSentenceToWords{

    public static String [] breakSentence(String sentence){

        sentence = sentence.replaceAll("[\\p{Punct}&&[^']]", "");
        String regex = "[\\s+]";
        String [] arrayWords = sentence.split(regex);

        for(int i = 0; i < arrayWords.length; i++){
            System.out.println(arrayWords[i]);
        }
        return arrayWords;
    }


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter a sentence.");
        String sentence = user.nextLine();

        System.out.println("The words in your sentence are: ");
        breakSentence(sentence);
        
    }
}