package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpokenTimeTests {

    @Test
    void accuratelyDeterminesSpokenTime() {
        assertEquals("3 o'clock", SpokenTime.getSpokenTime(90, 0));
        assertEquals("20 past 5", SpokenTime.getSpokenTime(160, 120));
        assertEquals("half past 8", SpokenTime.getSpokenTime(255, 180));
        assertEquals("quarter past 2", SpokenTime.getSpokenTime(67.5, 92));
        assertEquals("20 to 7", SpokenTime.getSpokenTime(200, 240));
        assertEquals("quarter to 11", SpokenTime.getSpokenTime(322.5, 273));
        assertEquals("5 to 4", SpokenTime.getSpokenTime(117.5, 335));
    }

    @Test
    void correctlyRejectsIllegalArguments() {
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(360, 90));
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(87, 360));
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(-90, 56));
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(44, -97));
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(720, 90));
        assertThrows(IllegalArgumentException.class, () -> SpokenTime.getSpokenTime(59, 1099));
    }
}