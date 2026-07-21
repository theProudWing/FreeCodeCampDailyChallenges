package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldenRatioTest {

    @Test
    void isGoldenRatio() {

        assertTrue(GoldenRatio.isGoldenRatio(21, 34));
        assertFalse(GoldenRatio.isGoldenRatio(15, 20));
        assertTrue(GoldenRatio.isGoldenRatio(8, 13));
        assertFalse(GoldenRatio.isGoldenRatio(10, 16));
        assertTrue(GoldenRatio.isGoldenRatio(1618, 1000));
        assertFalse(GoldenRatio.isGoldenRatio(88, 55));

    }
}