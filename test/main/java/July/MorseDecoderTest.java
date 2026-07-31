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
                "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",
                MorseDecoder.decodeMorse("- .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -." +
                        "   ..-. --- -..-   .--- ..- -- .--. . -..   --- ...- . .-.   - .... .   .-.. .- --.." +
                        " -.--   -.. --- --.")
        );
    }

    @Test
    void decodeMorseCharacter() {
    }
}