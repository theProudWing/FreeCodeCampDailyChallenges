/**
 * Created by: Ben Jones
 * Date:22/07/2026
 * Time:09:44
 */

package main.java.July;

import java.text.DecimalFormat;

public class PiggyBank {

    /**
     * FreeCodeCamp Daily Challenge - 22-07-2026
     * <p>Given an object representing a piggy bank, return the total value as a string formatted as "$D.CC"</p>
     *
     * @param pennies   the number of coins with a value of $0.01
     * @param nickles   the number of coins with a value of $0.05
     * @param dimes     the number of coins with a value of $0.10
     * @param quarters  the number of coins with a value of $0.25
     * @return          the total value as a formatted string
     */
    public static String totalSaved(int pennies, int nickles, int dimes, int quarters){
        // Create a variable to store the total
        // For each type of coin, increase the total by (value of coin * number of coins)
        // Convert the total to a string with a format of 0.00
        // Add a '$' to the start
        // return
        double total = 0;

        total += pennies * 0.01;
        total += nickles * 0.05;
        total += dimes * 0.10;
        total += quarters * 0.25;


        DecimalFormat df = new DecimalFormat("$#,##0.00");

        return df.format(total);
    }
}
