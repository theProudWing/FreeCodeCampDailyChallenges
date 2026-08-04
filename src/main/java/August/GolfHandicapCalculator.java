/**
 * Created by: Ben Jones
 * Date:04/08/2026
 * Time:10:11
 */

package main.java.August;

public class GolfHandicapCalculator {

    /**
     * FreeCodeCamp Daily Challenge - 04-08-2026
     * <p>
     * Given an array of golf scores and a corresponding array of course par values, return the golfer's handicap determined by:
     * <ol>
     *     <li>Calculate the differential for each round by subtracting the
     *     par value from the score.</li>
     *     <li>Determine the average of all differentials, rounded to one decimal place</li>
     *     <li>Return the average.</li>
     * </ol>
     *
     * @param playerScores an array of golf scores for a single player.
     * @param parValues the par scores for the courses corresponding to the golfer's scores.
     * @return the golfer's handicap, rounded to 1 decimal place.
     * @throws IllegalArgumentException if the parValue array is smaller than the playerScore array.
     */
    public static double calculateHandicap(final int[] playerScores, final int[] parValues) throws IllegalArgumentException{
        if (playerScores.length > parValues.length){
            throw new IllegalArgumentException("Player Score Array larger than Course Array");
        }
        int differential = 0;

        for (int i = 0; i < playerScores.length; i++) {
            differential += playerScores[i] - parValues[i];
        }

        double averageDiff = (double) differential / playerScores.length;
        return Math.round(averageDiff * 10.0) / 10.0; // multiply and divide by 10 to round to 1dp
    }
}
