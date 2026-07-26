package main.java.July;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CellSignalTest {

    @Test
    void correctPhoneLocations() {
        assertArrayEquals(
                new int[]{1, 2},
                CellSignal.findPhone(new int[][]{
                        {0, 0, 1},
                        {0, 1, 0},
                        {0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{2, 1},
                CellSignal.findPhone(new int[][]{
                        {0, 2, 0},
                        {1, 0, 0},
                        {0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{2, 2},
                CellSignal.findPhone(new int[][]{
                        {0, 0, 2, 0},
                        {0, 0, 0, 0},
                        {2, 0, 0, 0},
                        {0, 0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{3, 3},
                CellSignal.findPhone(new int[][]{
                        {3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 2, 0, 0, 0, 2}
                })
        );
    }
}