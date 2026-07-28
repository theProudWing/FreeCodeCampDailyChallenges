/**
 * Created by: Ben Jones
 * Date:28/07/2026
 * Time:08:36
 */

package main.java.July;

public class ContrastRating {
    public static String getContrastRating(String contrastRatio, boolean isLargeText) throws IllegalArgumentException{
        if (!isDouble(contrastRatio)){
            throw new IllegalArgumentException("Argument String cannot be converted to a double value.");
        }

        double ratio = Double.parseDouble(contrastRatio);
        String rating = "Fail";

        if (isLargeText){
            if (ratio >= 4.5){
                rating = "AAA";
            } else if (ratio >= 3.0) {
                rating = "AA";
            }
        } else {
            if (ratio >= 7.0){
                rating = "AAA";
            } else if (ratio >= 4.5){
                rating = "AA";
            }
        }
        return rating;
    }

    private static boolean isDouble(String string){
        if (string == null){
            return false;
        }
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
