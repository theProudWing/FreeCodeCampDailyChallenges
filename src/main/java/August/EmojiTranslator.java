/**
 * Created by: Ben Jones
 * Date:03/08/2026
 * Time:08:00
 */

package main.java.August;

import java.util.HashMap;
import java.util.Map;

public class EmojiTranslator {

    Map<Integer, String> emojiWords;

    public EmojiTranslator(){
        emojiWords = new HashMap<>();
        loadEmojiWords();
    }

    public String getEmojiTranslation(String emojiPhrase){
        // emoji are Unicode characters
        // However(!), emoji are "Supplementary Characters" that exceed 16 bits requiring two char values (a surrogate pair)
        // Therefore to extract the Unicode value of an Emoji from a String,
        // we must iterate through the 'codepoints' - numerical values that map to a specific character.
        StringBuilder output = new StringBuilder();

        int i = 0;

        while (i < emojiPhrase.length()){
            int codepoint = emojiPhrase.codePointAt(i);
            i++;
            if (Character.isEmoji(codepoint)){
                output.append(codePointToWord(codepoint));
                output.append(" ");
            }
        }

        //System.out.println("\tReturning decoded emoji phrase: " + output.toString().toLowerCase().trim());
        return output.toString().toLowerCase().trim();
    }
    private String codePointToWord(int codePoint){
        // convert a single emoji character to the associated word
        // could use a switch or a HashSet

        //System.out.println("Codepoint: " + Integer.toHexString(codePoint) + " corresponds to expected word: " + emojiWords.get(codePoint));

        return emojiWords.get(codePoint);
    }

    private void loadEmojiWords(){
        emojiWords.put(0x1F476, "BABY");
        emojiWords.put(0x1F408, "CAT");
        emojiWords.put(0x1F415, "DOG");
        emojiWords.put(0x1F41F, "FISH");
        emojiWords.put(0x1F975, "HOT");
        emojiWords.put(0x1F9CA, "ICE");
        emojiWords.put(0x1FAA8, "ROCK");
        emojiWords.put(0x1F988, "SHARK");
        emojiWords.put(0x1F372, "SOUP");
        emojiWords.put(0x2B50, "STAR");

    }

}
