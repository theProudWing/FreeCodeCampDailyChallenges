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
     * returns the WCAG contrast rating based on the contrast ratio using the following table:
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

    /**
     * FreeCodeCamp Daily Challenge - 30-07-2026
     * <p>
     * Given two integer arrays representing the RGB values of colours and a boolean indicating whether the text is large,
     * returns the WCAG contrast rating using the following table:
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
     *
     * @param lighterRGB an integer array containing 3 8-bit integers (0-255) representing Red, Green, and Blue values
     *                   for the lighter of the two colours.
     * @param darkerRGB an integer array containing 3 8-bit integers (0-255) representing Red, Green, and Blue values
     *                   for the darker of the two colours.
     * @param isLargeText whether the text to display is of a large font size
     * @return the WCAG rating given the provided parameters
     */
    public static String getContrastRating(int[] lighterRGB, int[] darkerRGB, boolean isLargeText ){
        //check that the provided arrays are of the rite size
        //create a function to calculate luminance from a set of rgb values
        double lighter = getRelativeLuminance(lighterRGB);
        double darker = getRelativeLuminance(darkerRGB);

        return getContrastRating(lighter, darker, isLargeText);
    }

    public static double getRelativeLuminance(final int r, final int g, final int b){
        int red = Math.clamp(r, 0, 255); // handles values out of 8-bit range by clamping them
        int green = Math.clamp(g, 0, 255);
        int blue = Math.clamp(b, 0, 255);

        //normalise to values between 0-1
        double redN = (double) red / 255;
        double greenN = (double) green / 255;
        double blueN = (double) blue / 255;

        // apply gamma correction to each channel
        redN = getGammaCorrectedValue(redN);
        greenN = getGammaCorrectedValue(greenN);
        blueN = getGammaCorrectedValue(blueN);

        // calculate luminance and return
        return 0.2126 * redN + 0.7152 * greenN + 0.0722 * blueN;
    }

    private static double getRelativeLuminance(int[] rgbValues) throws IllegalArgumentException{
        if (rgbValues.length != 3){
            throw new IllegalArgumentException("Provided array does not contain 3 values");
        }
        // passes the values for red, green, and blue to the overloaded method.
        return getRelativeLuminance(rgbValues[0], rgbValues[1], rgbValues[2]);
    }

    private static double getGammaCorrectedValue(double colourChannel){
        if (colourChannel <= 0.04045){
            return colourChannel / 12.92;
        } else {
            return Math.pow(((colourChannel + 0.055) / 1.055), 2.4);
        }
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
