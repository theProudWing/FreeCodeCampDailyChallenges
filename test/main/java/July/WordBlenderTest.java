package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordBlenderTest {

    @Test
    void blendWords() {
        assertEquals("turcan", WordBlender.blendWords("turtle", "toucan"));
        assertEquals("chipingo", WordBlender.blendWords("chipmunk", "flamingo"));
        assertEquals("falican", WordBlender.blendWords("falcon", "pelican"));
        assertEquals("hyana", WordBlender.blendWords("hyena", "iguana"));
        assertEquals("scorilla", WordBlender.blendWords("scorpion", "gorilla"));
        assertEquals("platerine", WordBlender.blendWords("platypus", "wolverine"));
    }
}