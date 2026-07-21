/**
 * Created by: Ben Jones
 * Date:21/07/2026
 * Time:10:21
 */

package main.java.July;

public class WordBlender {

    /***
     * Given two words, return a new word combining the first half of the first word
     * with the second half of the second word.
     * <p>
     * For odd-length words, the first half is the shorter half.
     *
     * @param first the first word to blend, containing the first half of the result
     * @param second the second word to blend, containing the second half of the result
     * @return a new word combining the two halves derived from the input words.
     */
    public static String blendWords(String first, String second){
        // For each word:
        //          Find the length
        //          Identify the middle
        //          Split down the middle (if odd-length, the first half is one character shorter) using .substring
        //          Combine the two halves and return

        String firstHalf = first.substring(0, first.length() / 2);
        String secondHalf = second.substring(second.length() / 2);

        return firstHalf + secondHalf;
    }
}
