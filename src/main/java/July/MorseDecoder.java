/**
 * Created by: Ben Jones
 * Date:31/07/2026
 * Time:08:40
 */

package main.java.July;

public class MorseDecoder {
    public static String decodeMorse(String morseCode){
        // Will need to separate the message with three spaces "   " as the String delimiter
        // Pass each separate character to the decodeMorseCharacter method
        // Add each decoded char to a new string which will be the return value
        StringBuilder decoded = new StringBuilder();
        String[] splitMessage = morseCode.split(" {3}");

        for (String morseWord : splitMessage){
            String[] splitWord = morseWord.split(" ");
            for (String morseCharacter : splitWord) {
                Character next = decodeMorseCharacter(morseCharacter);
                decoded.append(next);
            }
            decoded.append(" ");
        }


        return decoded.toString().trim();
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
