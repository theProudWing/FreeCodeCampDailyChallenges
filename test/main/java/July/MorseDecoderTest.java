package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseDecoderTest {

    @Test
    void decodeMorse() {
        assertEquals(
                "Z",
                MorseDecoder.decodeMorse("--..")
        );
        assertEquals(
                "SOS",
                MorseDecoder.decodeMorse("... --- ...")
        );
        assertEquals(
                "FREECODECAMP",
                MorseDecoder.decodeMorse("..-. .-. . . -.-. --- -.. . -.-. .- -- .--.")
        );
        assertEquals(
                "HELLO WORLD",
                MorseDecoder.decodeMorse(".... . .-.. .-.. ---   .-- --- .-. .-.. -..")
        );
        assertEquals(
                "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG",
                MorseDecoder.decodeMorse("- .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -." +
                        "   ..-. --- -..-   .--- ..- -- .--. . -..   --- ...- . .-.   - .... .   .-.. .- --.." +
                        " -.--   -.. --- --.")
        );
        assertEquals(
                "FOR A GOOD TIME CALL JENNY ON 8675309",
                MorseDecoder.decodeMorse("..-. --- .-.   .-   --. --- --- -..   - .. -- .   -.-. .- .-.. .-.." +
                        "   .--- . -. -. -.--   --- -.   ---.. -.... --... ..... ...-- ----- ----.")
                );
        assertEquals(
                "WHAT ARE YOU AFRAID OF?",
                MorseDecoder.decodeMorse(".-- .... .- -   .- .-. .   -.-- --- ..-   .- ..-. .-. .- .. -.." +
                        "   --- ..-. ..--..")
        );
        assertEquals("0 1 2 3 4 5 6 7 8 9,.?",
                MorseDecoder.decodeMorse("-----   .----   ..---   ...--   ....-   .....   -....   --..." +
                        "   ---..   ----. --..-- .-.-.- ..--..")
        );
    }

    @Test
    void decodeMorseCharacter() {
    }
}