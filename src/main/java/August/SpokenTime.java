/**
 * Created by: Ben Jones
 * Date:06/08/2026
 * Time:11:01
 */

package main.java.August;

public class SpokenTime {

    /**
     * FreeCodeCamp Daily Challenge - 06-08-2026
     * Given the angles (degrees) for the hour and minute hands on an analogue clock, return the derived time in spoken English
     *
     * @param hourAngle the angle in degrees of the hour hand, where 360 is 12.
     * @param minuteAngle the angle of the minute hand, where 360 is 0 Minutes.
     * @return the derived time as a String of spoken English
     */
    public static String getSpokenTime(double hourAngle, double minuteAngle) throws IllegalArgumentException{
        //  firstly, need to convert each angle to the nearest value
        //      minute should be easy, simply divide by 6 as 360 / 6 = 60
        //      hour is the same, simply divide by 30 as 360 / 30 = 12
        //      each number should be rounded down i.e., the floor
        //  after that, the rest of the programme should be quite straightforward

        if (isInvalidAngle(hourAngle) || isInvalidAngle(minuteAngle)){
            throw new IllegalArgumentException("Provided Angles are Invalid");
        }

        int hour = (int)Math.floor(hourAngle / 30);
        int minutes = (int)Math.floor(minuteAngle / 6);

        if (minutes == 0){
            return hour + " o'clock";
        }
        if (minutes <= 30){
            return getMinuteText(minutes) + " past " + hour;
        }
        minutes = Math.abs(minutes - 60); // re-format minutes to the hour

        return  getMinuteText(minutes) + " to " + (hour + 1);
    }

    private static String getMinuteText(final int minutes){
        return switch (minutes) {
            case 15 -> "quarter";
            case 30 -> "half";
            default -> Integer.toString(minutes);
        };
    }

    private static boolean isInvalidAngle(final double angle){
        return angle < 0 || angle > 359;
    }
}
