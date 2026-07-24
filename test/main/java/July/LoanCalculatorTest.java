package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {

    @Test
    void accurateLoanSchedules() {

        assertArrayEquals(
                new int[]{1000, 800, 600, 400, 200, 0},
                LoanCalculator.getLoanSchedule(1000, 0, 200)
        );
        assertArrayEquals(
                new int[]{1000, 804, 608, 410, 212, 13, 0},
                LoanCalculator.getLoanSchedule(1000, 5, 200)
        );
        assertArrayEquals(
                new int[]{10, 9, 9, 8, 8, 7, 6, 5, 5, 4, 3, 2, 1, 0, 0},
                LoanCalculator.getLoanSchedule(10, 50, 1)
        );
        assertArrayEquals(
                new int[] {5500, 5137, 4771, 4403, 4032, 3659, 3283, 2905, 2525, 2141, 1756, 1367, 977, 583, 187, 0},
                LoanCalculator.getLoanSchedule(5500, 8, 400)
        );
        assertArrayEquals(
                new int[] {50000, 48567, 47127, 45681, 44229, 42771, 41306, 39835, 38358, 36874, 35384, 33887, 32384,
                        30874, 29358, 27835, 26306, 24770, 23227, 21678, 20122, 18559, 16990, 15413, 13830, 12240, 10643,
                        9039, 7428, 5810, 4186, 2554, 915, 0},
                LoanCalculator.getLoanSchedule(50_000, 5.2, 1650)
        );
    }
}