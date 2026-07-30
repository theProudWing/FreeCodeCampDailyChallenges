package main.java.July;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContrastRatingTest {

    @Test
    @DisplayName("Accurate with String Param")
    void accuratelyDeterminesRatingWithStringParams() {
        assertEquals("AAA", ContrastRating.getContrastRating("7.5", false));
        assertEquals("AA", ContrastRating.getContrastRating("4.8", false));
        assertEquals("Fail", ContrastRating.getContrastRating("4.2", false));
        assertEquals("AAA", ContrastRating.getContrastRating("4.5", true));
        assertEquals("AA", ContrastRating.getContrastRating("3.0", true));
        assertEquals("Fail", ContrastRating.getContrastRating("2.7", false));
    }
    @Test
    @DisplayName("Accurate with Double Params")
    void accuratelyDeterminesRatingWithDoubleParams(){
        assertEquals("AAA", ContrastRating.getContrastRating(1.0, 0.0, false));
        assertEquals("AA", ContrastRating.getContrastRating(0.9015, 0.1364, false));
        assertEquals("Fail", ContrastRating.getContrastRating(0.8965, 0.1628, false));
        assertEquals("AAA", ContrastRating.getContrastRating(0.7469, 0.0957, true));
        assertEquals("AA", ContrastRating.getContrastRating(0.7489, 0.2018, true));
        assertEquals("Fail", ContrastRating.getContrastRating(0.6571, 0.1974, true));
    }

    @Test
    void accuratelyDeterminesRatingWithIntegerArrayParams(){
        assertEquals("AAA", ContrastRating.getContrastRating(new int[]{255, 255, 255}, new int[] {0, 0, 0}, false));
        assertEquals("AA", ContrastRating.getContrastRating(new int[]{215, 188, 188}, new int[] {55, 55, 55}, false));
        assertEquals("Fail", ContrastRating.getContrastRating(new int[]{143, 144, 210}, new int[] {46, 47, 61}, false));
        assertEquals("AAA", ContrastRating.getContrastRating(new int[]{167, 167, 210}, new int[] {53, 10, 53}, true));
        assertEquals("AA", ContrastRating.getContrastRating(new int[]{135, 147, 155}, new int[] {60, 70, 90}, true));
        assertEquals("Fail", ContrastRating.getContrastRating(new int[]{125, 210, 195}, new int[] {105, 130, 90}, true));
    }

    @Test
    @DisplayName("Throws Exception with Illegal Arguments")
    void throwsIllegalArgumentExceptionWithBadParams(){
        assertThrows(IllegalArgumentException.class, () -> ContrastRating.getContrastRating("Ratio", true));
        assertThrows(IllegalArgumentException.class, () -> ContrastRating.getContrastRating(0.0, 1.0, false));
    }
}