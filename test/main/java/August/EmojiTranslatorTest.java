package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmojiTranslatorTest {

    @Test
    void getEmojiTranslation() {

        EmojiTranslator translator = new EmojiTranslator();

        assertEquals("rock star", translator.getEmojiTranslation("🪨⭐"));
        assertEquals("hot dog", translator.getEmojiTranslation("🥵🐕"));
        assertEquals("baby shark", translator.getEmojiTranslation("👶🦈"));
        assertEquals("star fish", translator.getEmojiTranslation("⭐🐟"));
        assertEquals("ice ice baby", translator.getEmojiTranslation("🧊🧊👶"));
        assertEquals("cat fish soup", translator.getEmojiTranslation("🐈🐟🍲"));
    }
}