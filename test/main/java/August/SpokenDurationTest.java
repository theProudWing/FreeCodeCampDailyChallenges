package main.java.August;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpokenDurationTests {

    @Test
    void accuratelyDeterminesDurationForPositiveParameters() {
        assertEquals("1 hour, 2 minutes, and 3 seconds", SpokenDuration.getSpokenDuration(3723));
        assertEquals("2 hours, 1 minute, and 35 seconds", SpokenDuration.getSpokenDuration(7295));
        assertEquals("2 hours, 22 minutes, and 1 second", SpokenDuration.getSpokenDuration(8521));
        assertEquals("7 minutes, and 15 seconds", SpokenDuration.getSpokenDuration(435));
        assertEquals("4 hours, and 55 seconds", SpokenDuration.getSpokenDuration(14455));
        assertEquals("20 hours", SpokenDuration.getSpokenDuration(72000));
        assertEquals("1 second", SpokenDuration.getSpokenDuration(1));


    }

    @Test
    void accuratelyDeterminesDurationForNegativeParameters() {
        assertEquals("1 hour, 2 minutes, and 3 seconds", SpokenDuration.getSpokenDuration(-3723));
        assertEquals("2 hours, 1 minute, and 35 seconds", SpokenDuration.getSpokenDuration(-7295));
        assertEquals("2 hours, 22 minutes, and 1 second", SpokenDuration.getSpokenDuration(-8521));
        assertEquals("7 minutes, and 15 seconds", SpokenDuration.getSpokenDuration(-435));
        assertEquals("4 hours, and 55 seconds", SpokenDuration.getSpokenDuration(-14455));
        assertEquals("20 hours", SpokenDuration.getSpokenDuration(-72000));
        assertEquals("1 second", SpokenDuration.getSpokenDuration(-1));
    }

    @Test
    void accuratelyDeterminesDurationForZeroSeconds(){
        assertEquals("0 seconds", SpokenDuration.getSpokenDuration(0));
    }
}