package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PronicNumberTests {

    @Test
    void correctlyIdentifiesPronicNumbers() {
        assertTrue(PronicNumber.isPronic(6));
        assertTrue(PronicNumber.isPronic(12));
        assertTrue(PronicNumber.isPronic(132));
        assertTrue(PronicNumber.isPronic(0));
    }
    @Test
    void correctlyIdentifiesNonPronicNumbers() {
        assertFalse(PronicNumber.isPronic(15));
        assertFalse(PronicNumber.isPronic(80));
    }
}