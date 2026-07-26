package main.java.July;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CellSignalTest {

    @Test
    void correctPhoneLocations() {

        CellSignal signal = new CellSignal();

        assertArrayEquals(
                new int[]{1, 2},
                signal.findPhone(new int[][]{
                        {0, 0, 1},
                        {0, 1, 0},
                        {0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{2, 1},
                signal.findPhone(new int[][]{
                        {0, 2, 0},
                        {1, 0, 0},
                        {0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{2, 2},
                signal.findPhone(new int[][]{
                        {0, 0, 2, 0},
                        {0, 0, 0, 0},
                        {2, 0, 0, 0},
                        {0, 0, 0, 1}
                })
        );
        assertArrayEquals(
                new int[]{3, 4},
                signal.findPhone(new int[][]{
                        {0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 2},
                        {0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}
                })
        );
        assertArrayEquals(
                new int[]{3, 3},
                signal.findPhone(new int[][]{
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