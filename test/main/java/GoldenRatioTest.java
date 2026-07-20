package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldenRatioTest {

    @Test
    void isGoldenRatio() {

        GoldenRatio checker = new GoldenRatio();

        assertTrue(checker.isGoldenRatio(21, 34));
        assertFalse(checker.isGoldenRatio(15, 20));
        assertTrue(checker.isGoldenRatio(8, 13));
        assertFalse(checker.isGoldenRatio(10, 16));
        assertTrue(checker.isGoldenRatio(1618, 1000));
        assertFalse(checker.isGoldenRatio(88, 55));

    }
}