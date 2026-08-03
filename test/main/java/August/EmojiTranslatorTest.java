package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmojiTranslatorTest {

    @Test
    void getEmojiTranslation() {
        assertEquals("rock star", EmojiTranslator.getEmojiTranslation("🪨⭐"));
        assertEquals("hot dog", EmojiTranslator.getEmojiTranslation("🥵🐕"));
        assertEquals("baby shark", EmojiTranslator.getEmojiTranslation("👶🦈"));
        assertEquals("star fish", EmojiTranslator.getEmojiTranslation("⭐🐟"));
        assertEquals("ice ice baby", EmojiTranslator.getEmojiTranslation("🧊🧊👶"));
        assertEquals("cat fish soup", EmojiTranslator.getEmojiTranslation("🐈🐟🍲"));
    }
}