/**
 * Created by: Ben Jones
 * Date:28/07/2026
 * Time:08:36
 */

package main.java.July;


public class ContrastRating {

    /**
     * FreeCodeCamp Daily Challenge - 28-07-2026
     * <p>
     * Given a contrast ratio and a boolean indicating large text, return the Web Content Accessibility Guidelines (WCAG)
     * rating using the following table:
     * <table border="1" cellpadding="2">
     *     <tr>
     *         <th>Rating</th>
     *         <th>Normal Text</th>
     *         <th>Large Text</th></th>
     *     </tr>
     *     <tr>
     *         <td>AAA</td>
     *         <td>7.0+</td>
     *         <td>4.5+</td>
     *     </tr>
     *     <tr>
     *      <td>AA</td>
     *      <td>4.5+</td>
     *      <td>3.0+</td>
     *     </tr>
     *     <tr>
     *         <td>Fail</td>
     *         <td>below 4.5</td>
     *         <td>below 3.0</td>
     *     </tr>
     * </table>
     * <p>
     *     Contrast Ratio is calculated as: (L1 + 0.05) / (L2 + 0.05) where:
     *     <ul>
     *         <li>L1 is the relative luminance of the lighter of the colours</li>
     *         <li>L2 is the relative luminance of the darker of the colours</li>
     *     </ul>
     * </p>
     * @param contrastRatio the ratio between the relative luminance of two colours
     * @param isLargeText whether the text to display is of a large font size
     * @return the WCAG rating given the provided parameters
     * @throws IllegalArgumentException If the String provided for contrast ratio can not be converted to a double.
     */
    public static String getContrastRating(String contrastRatio, boolean isLargeText) throws IllegalArgumentException{
        if (!isDouble(contrastRatio)){
            throw new IllegalArgumentException("Argument String cannot be converted to a double value.");
        }

        double ratio = Double.parseDouble(contrastRatio);

        double aaaRating = isLargeText ? 4.5 : 7.0;
        double aaRating = isLargeText ? 3.0 : 4.5;

        if (ratio >= aaaRating){
            return "AAA";
        } else if (ratio >= aaRating) {
            return "AA";
        }
        return "Fail";
    }

    /**
     * FreeCodeCamp Daily Challenge - 29-07-2026
     * <p>
     * Given two relative luminance values and a boolean indicating whether the text is large,
     * return the WCAG contrast rating based on the contrast ratio using the following table:
     * <table border="1" cellpadding="2">
     *     <tr>
     *         <th>Rating</th>
     *         <th>Normal Text</th>
     *         <th>Large Text</th></th>
     *     </tr>
     *     <tr>
     *         <td>AAA</td>
     *         <td>7.0+</td>
     *         <td>4.5+</td>
     *     </tr>
     *     <tr>
     *      <td>AA</td>
     *      <td>4.5+</td>
     *      <td>3.0+</td>
     *     </tr>
     *     <tr>
     *         <td>Fail</td>
     *         <td>below 4.5</td>
     *         <td>below 3.0</td>
     *     </tr>
     * </table>
     * <p>
     *     Contrast Ratio is calculated as: (L1 + 0.05) / (L2 + 0.05) where:
     *     <ul>
     *         <li>L1 is the relative luminance of the lighter of the colours</li>
     *         <li>L2 is the relative luminance of the darker of the colours</li>
     *     </ul>
     * </p>
     * @param lighter the lighter of the two luminance values
     * @param darker the darker of the two luminance values
     * @param isLargeText whether the text to display is of a large font size
     * @return the WCAG rating given the provided parameters
     * @throws IllegalArgumentException if lighter < darker
     */
    public static String getContrastRating(double lighter, double darker, boolean isLargeText) throws IllegalArgumentException{
        if (lighter < darker){
            throw new IllegalArgumentException(
                    "The lighter of the two luminance values should be entered as the first argument."
            );
        }

        double contrastRatio = (lighter + 0.05) / (darker + 0.05);

        final double AAA_RATING = isLargeText ? 4.5 : 7.0;
        final double AA_RATING = isLargeText ? 3.0 : 4.5;

        if (contrastRatio >= AAA_RATING){
            return "AAA";
        } else if (contrastRatio >= AA_RATING){
            return "AA";
        }
        return "Fail";
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
