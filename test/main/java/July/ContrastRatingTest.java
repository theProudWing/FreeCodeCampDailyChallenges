package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContrastRatingTest {

    @Test
    void accuratelyDeterminesRating() {
        assertEquals("AAA", ContrastRating.getContrastRating("7.5", false));
        assertEquals("AA", ContrastRating.getContrastRating("4.8", false));
        assertEquals("Fail", ContrastRating.getContrastRating("4.2", false));
        assertEquals("AAA", ContrastRating.getContrastRating("4.5", true));
        assertEquals("AA", ContrastRating.getContrastRating("3.0", true));
        assertEquals("Fail", ContrastRating.getContrastRating("2.7", false));
    }
}