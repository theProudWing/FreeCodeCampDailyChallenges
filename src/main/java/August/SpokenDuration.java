/**
 * Created by: Ben Jones
 * Date:05/08/2026
 * Time:09:44
 */

package main.java.August;

public class SpokenDuration {
    public static String getSpokenDuration(final int seconds){
        String output = "";

        if (seconds == 0) {
            return "0 seconds";
        }

        // Negative values make no sense here and should be handled appropriately
        int absSeconds = Math.abs(seconds);
        // The maths here is quite simple:

        int totalHours = absSeconds / 3600;
        int remainingMinutes = (absSeconds % 3600) / 60;
        int remainingSeconds = absSeconds % 60;

        // The complexity comes with formatting the output.
        // The String may have values for any combination of the 3 denominations of time (hms)
        // Each value must be properly pluralised if greater than 1 i.e., WE NEED A GOOD OLD TERNARY OPERATOR


        if (totalHours > 0){
            output += totalHours + " " + (totalHours == 1 ? "hour" : "hours");
            // The spooky XOR makes an appearance, for where total hours and exactly one other value is greater than 0.
            if (remainingMinutes > 0 ^ remainingSeconds > 0){
                output += ", and "; // Oxford comma goes brrrrrrrrrrr
            }
            else if (remainingMinutes > 0){
                output += ", ";
            }
        }
        if (remainingMinutes > 0){
            output += remainingMinutes + " " + (remainingMinutes == 1 ? "minute" : "minutes");
            if (remainingSeconds > 0){
                output += ", and ";
            }
        }
        if (remainingSeconds > 0){
            output += remainingSeconds + " " + (remainingSeconds == 1 ? "second" : "seconds");
        }

        return output;
    }
}
