package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpokenTimeTest {

    @Test
    void getSpokenTime() {
        assertEquals("3 o'clock", SpokenTime.getSpokenTime(90, 0));
        assertEquals("20 past 5", SpokenTime.getSpokenTime(160, 120));
        assertEquals("half past 8", SpokenTime.getSpokenTime(255, 180));
        assertEquals("quarter past 2", SpokenTime.getSpokenTime(67.5, 92));
        assertEquals("20 to 7", SpokenTime.getSpokenTime(200, 240));
        assertEquals("quarter to 11", SpokenTime.getSpokenTime(322.5, 273));
        assertEquals("5 to 4", SpokenTime.getSpokenTime(117.5, 335));
    }
}