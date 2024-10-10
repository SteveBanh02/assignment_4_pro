public class Divisor{

    public static int countDivisor(int i){

        int countDivisor = 0;
        for(int j = 1; j <= i; j++){
            
            if(i % j == 0){
                countDivisor++;
            }
        }
        return countDivisor;
    }

    public static void main(String[] args) {

        int numberWithMostDivisor = 0;
        int largestNumDivisor = 0;
        
        for(int i = 1; i <= 10000; i ++){

            int divisorCounted = countDivisor(i);
            if (largestNumDivisor < divisorCounted){
                largestNumDivisor = divisorCounted;
                numberWithMostDivisor = i; 
            }
        }
        System.out.printf("The number %d has %d divisors",numberWithMostDivisor, largestNumDivisor);
    }
}   