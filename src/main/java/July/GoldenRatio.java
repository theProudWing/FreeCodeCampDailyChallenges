/**
 * Created by: Ben Jones
 * Date:20/07/2026
 * Time:14:29
 */

package main.java.July;

public class GoldenRatio {
    /***
     * FreeCodeCamp Daily Challenge - 20-07-2026
     * <p>
     * Given two integers, determine if their ratio approximates the golden ratio (1.618)
     * <p>
     * Allow a tolerance of 0.01
     *
     * @param x     the first number
     * @param y     the second number
     * @return      true if the ratio is within 0.01 of 1.618
     */
    public static boolean isGoldenRatio(int x, int y){
        // Determine which of the numbers is greater (if the same, return false)
        // Divide the largest by the smallest
        // Determine whether the result is between 1.608 and 1.628
        // Return true if so, otherwise return false.
        int max = Integer.max(x, y);
        int min = Integer.min(x, y);

        double ratio = (double) max / (double) min;

        return 1.608 <= ratio && ratio <= 1.628;
    }
}
