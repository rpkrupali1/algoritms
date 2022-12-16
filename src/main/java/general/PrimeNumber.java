package general;

import java.util.ArrayList;

/**
 * Task
 * A prime is a natural number greater than  that has no positive divisors other than  and itself.
 * Given a number,n , determine and print whether it is prime or not prime.
 */
public class PrimeNumber {
    public static ArrayList<String> optimal(ArrayList<Integer> arr){
        ArrayList<String> result = new ArrayList<>();
        for(int number:arr){
            if(number<=1)
                result.add("Not prime");
            else if(number<=3)
                result.add("Prime");
            else if (number%2==0||number%3==0) {
                result.add("Not prime");
            }
            else {
                String prime = "Prime";
                for (int i = 5; i * i <=number ; i= i+6) {
                    if(number%i==0||number%(i+2)==0){
                        prime = "Not prime";
                        break;
                    }
                }
                result.add(prime);
            }
        }
        return result;
    }
}
