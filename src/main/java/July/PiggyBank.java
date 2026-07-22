/**
 * Created by: Ben Jones
 * Date:22/07/2026
 * Time:09:44
 */

package main.java.July;

import java.text.DecimalFormat;

public class PiggyBank {
    public static String totalSaved(int pennies, int nickles, int dimes, int quarters){
        // Create a variable to store the total
        // For each type of coin, increase the total by (value of coin * number of coins)
        // Convert the total to a string with a format of 0.00
        // Add a '$' to the start
        // return
        double total = 0;

        for (int i = 0; i < pennies; i++) {
            total += 0.01;
        }
        for (int i = 0; i < nickles; i++) {
            total += 0.05;
        }
        for (int i = 0; i < dimes; i++) {
            total += 0.10;
        }
        for (int i = 0; i < quarters; i++) {
            total += 0.25;
        }

        DecimalFormat df = new DecimalFormat("$#,##0.00");

        return df.format(total);
    }
}
