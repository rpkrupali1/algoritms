package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to convert Decimal to binary using recursion
 * Step 1: Divide the given decimal number by 2 and note down the remainder.
 * Step 2: Now, divide the obtained quotient by 2, and note the remainder again.
 * Step 3: Repeat the above steps until you get 0 as the quotient.
 * Step 4: Now, write the remainders in such a way that the last remainder is written first, followed by the rest in the reverse order.
 * Example: Find binary for 13
 *  1) 13/2 = 6 Remainder 1
 *  2) 6/2 = 3 Remainder 0
 *  3) 3/2 = 1 Remainder 1
 *  4) 1/2 = 0 Remainder 1
 *  Now you align remainders in reverse to get binary value = 1101
 */
public class DecimalToBinary {
    private static ArrayList<Integer> result = new ArrayList<>();
    public static ArrayList<Integer> recursive(int n){
        if(n/2==0){
            result.add(n%2);
            Collections.reverse(result);
            return result;
        }
        int remainder = n%2;
        result.add(remainder);
        return recursive(n/2);
    }
}
