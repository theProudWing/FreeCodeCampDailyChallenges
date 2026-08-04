package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GolfHandicapCalculatorTest {

    @Test
    void accuratelyDeterminesHandicap() {
        assertEquals(0, GolfHandicapCalculator.calculateHandicap(new int[]{72, 72, 72}, new int[]{72, 72, 72}));
        assertEquals(6, GolfHandicapCalculator.calculateHandicap(new int[]{80, 76, 78, 78}, new int[]{72, 72, 72, 72}));
        assertEquals(8.3, GolfHandicapCalculator.calculateHandicap(new int[]{42, 45, 46, 44}, new int[]{36, 36, 36, 36}));
        assertEquals(8.8, GolfHandicapCalculator.calculateHandicap(new int[]{85, 80, 76, 79, 82}, new int[]{72, 72, 72, 71, 71}));
        assertEquals(11.7, GolfHandicapCalculator.calculateHandicap(new int[]{41, 50, 48, 52, 46, 49}, new int[] {35, 37, 35, 37, 35, 37}));
    }

    @Test
    void correctlyRejectsIllegalParameters() {
        assertThrows(IllegalArgumentException.class, () -> GolfHandicapCalculator.calculateHandicap(new int[] {72, 72}, new int[] {87}));
        assertThrows(IllegalArgumentException.class, () -> GolfHandicapCalculator.calculateHandicap(new int[] {87, 90, 98, 107, 105}, new int[] {}));
    }
}