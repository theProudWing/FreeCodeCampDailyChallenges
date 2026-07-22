package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiggyBankTest {

    @Test
    void totalSaved() {
        assertEquals("$1.98", PiggyBank.totalSaved(3, 5, 2, 6));
        assertEquals("$0.41", PiggyBank.totalSaved(1, 1, 1, 1));
        assertEquals("$2.25", PiggyBank.totalSaved(0, 8, 6, 5));
        assertEquals("$0.00", PiggyBank.totalSaved(0, 0, 0, 0));
        assertEquals("$6.76", PiggyBank.totalSaved(146, 11, 0, 19));
    }
}