/**
 * Created by: Ben Jones
 * Date:31/07/2026
 * Time:08:40
 */

package main.java.July;

import java.util.Arrays;
import java.util.Iterator;

public class MorseDecoder {
    /**
     * FreeCodeCamp Daily Challenge - 31-07-2026
     * <p>
     * Given a Morse code string, returns the decoded message.
     * <ul>
     *     <li>Letters are separated by a single space</li>
     *     <li>Words are separated by three spaces</li>
     * </ul>
     *
     * @param morseCode a message in Morse Code.
     *                  Words are separated with 3 spaces.
     *                  Characters within words are separated with 1 space.
     * @return the decoded message
     */
    public static String decodeMorse(String morseCode){
        // Will need to separate the message into individual words, with three spaces "   " as the delimiter
        // Further split each word into characters, with one space " " as the delimiter
        // Pass each separate character to the decodeMorseCharacter method
        // Add each decoded char to a new string which will be the return value
        // Add a space to the end of each word UNLESS it is the final word in the message
        StringBuilder decoded = new StringBuilder();

        String[] splitMessage = morseCode.split(" {3}"); // separates message into individual words
        Iterator<String> wordIterator = Arrays.stream(splitMessage).iterator();

        // iterate over each word
        while (wordIterator.hasNext()){
            String[] splitWord = wordIterator.next().split(" ");

            // decode each character and add to decoded string
            for (String morseCharacter : splitWord) {
                Character next = decodeMorseCharacter(morseCharacter);
                decoded.append(next);
            }
            if (wordIterator.hasNext()){
                decoded.append(" "); // add spaces between words
            }
        }
        return decoded.toString();
    }

    /**
     * Given a single encoded Morse character, returns the decoded Character.
     * @param morseCharacter a single character in Morse Code
     * @return the decoded Character
     */
    public static Character decodeMorseCharacter(String morseCharacter){
        //When passed a morse code character, should return the decoded Character
        switch (morseCharacter){
            case ".-":
                return 'A';
            case "-...":
                return 'B';
            case "-.-.":
                return 'C';
            case "-..":
                return 'D';
            case ".":
                return 'E';
            case "..-.":
                return 'F';
            case "--.":
                return 'G';
            case "....":
                return 'H';
            case "..":
                return 'I';
            case ".---":
                return 'J';
            case "-.-":
                return 'K';
            case ".-..":
                return 'L';
            case "--":
                return 'M';
            case "-.":
                return 'N';
            case "---":
                return 'O';
            case ".--.":
                return 'P';
            case "--.-":
                return 'Q';
            case ".-.":
                return 'R';
            case "...":
                return 'S';
            case "-":
                return 'T';
            case "..-":
                return 'U';
            case "...-":
                return 'V';
            case ".--":
                return 'W';
            case "-..-":
                return 'X';
            case "-.--":
                return 'Y';
            case "--..":
                return 'Z';
            case "-----":
                return '0';
            case ".----":
                return '1';
            case "..---":
                return '2';
            case "...--":
                return '3';
            case "....-":
                return '4';
            case ".....":
                return '5';
            case "-....":
                return '6';
            case "--...":
                return '7';
            case "---..":
                return '8';
            case "----.":
                return '9';
            case ".-.-.-":
                return '.';
            case "--..--":
                return ',';
            case "..--..":
                return '?';
            case ".----.":
                return '\'';
            default:
                System.out.println(
                        "ERROR: String parameter: " + morseCharacter + " could not be decoded as a Morse Character."
                );
        }
        return null;
    }
}
