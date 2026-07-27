/**
 * Created by: Ben Jones
 * Date:27/07/2026
 * Time:17:51
 */

package main.java.July;

import java.util.ArrayList;

public class PronicNumber {

    /**
     * FreeCodeCamp Daily Challenge - 27-07-2026
     * <p>
     * Given a number, determines if that number is <b>pronic</b>, i.e., the product of two consecutive integers.
     * <p>
     * e.g., 6 is pronic because 2 * 3 = 6
     * @param number the number to be checked
     * @return true if the number is pronic, otherwise false.
     */
    public static boolean isPronic(int number){
        if (number < 0){
            return false;
        }


        int sqrt = (int)Math.sqrt(number);

        // Loop Method

        for (int i = 0; i <= sqrt; i++) {
            if (i * (i + 1) == number){
                return true;
            }
        }
        return false;


        // Simplified Method
        //return sqrt * (sqrt + 1) == number;
    }
}
